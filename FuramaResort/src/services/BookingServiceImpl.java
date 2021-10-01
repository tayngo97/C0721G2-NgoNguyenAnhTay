package services;

import models.person.Customer;
import models.service.*;
import services.exception_validate.CheckValidTime;
import utils.BookingToCsv;

import java.io.*;
import java.util.*;

public class BookingServiceImpl implements BookingService {
    protected static Scanner scanner = new Scanner(System.in);
    protected static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    protected static Set<Booking> bookingTreeSet = new TreeSet<>();
    protected static List<Customer> customerList = CustomerServiceImpl.readDataFromFile();

    protected static Map<Villa,Integer> villaMap = FacilityServiceImpl.villaList.readDataFromFile();
    protected static Map<House,Integer> houseMap = FacilityServiceImpl.houseList.readDataFromFile();
    protected static Map<Room,Integer> roomMap = FacilityServiceImpl.roomList.readDataFromFile();

    public void addNewBooking() {
        System.out.println("Enter bookingID");
        String bookingID = scanner.nextLine();

        System.out.println("Enter checkinTime");
        String timeCI = CheckValidTime.checkValidTime();
        System.out.println("Enter checkinOut");
        String timeCO = CheckValidTime.checkValidTime();

        Customer customer = getCustomerID();
        Facility service = getFacility();

        Booking booking = new Booking(bookingID, timeCI, timeCO, customer, service);
        if (BookingToCsv.bookingFile.length() > 0) {
            bookingTreeSet = BookingToCsv.readDataFromFile();
        }
        bookingTreeSet.add(booking);
        BookingToCsv.writeToFile(bookingTreeSet);
    }

    public void showBooking() {
        bookingTreeSet = BookingToCsv.readDataFromFile();
        for (Booking e : bookingTreeSet) {
            System.out.println(e);
        }
    }

    public void deleteBooking() {
        bookingTreeSet = BookingToCsv.readDataFromFile();
        bookingTreeSet.forEach(System.out::println);
        System.out.println("Enter booking ID to delete booking !");
        String bookingId = scanner.nextLine();
        bookingTreeSet.removeIf(b -> b.getBookingID().equals(bookingId));
        BookingToCsv.writeToFile(bookingTreeSet);
        showBooking();
    }

    public static Customer getCustomerID() {
        System.out.println("-------------CUSTOMERS LISTS--------------");
        customerList.forEach(System.out::println);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter customerID");
            String customerID = scanner.nextLine();
            for (Customer customer1 : customerList) {
                if (customer1.getCustomerID().equals(customerID)) {
                    return customer1;
                } else flag = false;
            }
        } return null ;
    }

    public static Facility getFacility() {
        System.out.println("-------------FACILITY LISTS--------------");
        facilityService.showFacilityList();
        while (true) {
            System.out.println("Enter service ID");
            String serviceID = scanner.nextLine();

            for (Map.Entry<Villa, Integer> villa : villaMap.entrySet()) {
                if (villa.getKey().getServiceID().equals(serviceID)) {
                    villa.setValue(villa.getValue() + 1);
                    FacilityServiceImpl.villaList.writeToFile(villaMap);
                    return villa.getKey();
                }
            }
            for (Map.Entry<House, Integer> house : houseMap.entrySet()) {
                if (house.getKey().getServiceID().equals(serviceID)) {
                    house.setValue(house.getValue() + 1);
                    FacilityServiceImpl.houseList.writeToFile(houseMap);
                    return house.getKey();
                }
            }
            for (Map.Entry<Room, Integer> room : roomMap.entrySet()) {
                if (room.getKey().getServiceID().equals(serviceID)) {
                    room.setValue( room.getValue() + 1);
                    FacilityServiceImpl.roomList.writeToFile(roomMap);
                    return room.getKey();
                }
            }
        }
    }

    public static Queue<Booking> changeSetToQueue(){
        bookingTreeSet = BookingToCsv.readDataFromFile();
        Queue<Booking> bookingQueue = new ArrayDeque<>();
        for (Booking booking: bookingTreeSet) {
            bookingQueue.offer(booking);
        }
        return bookingQueue;
    }
}
