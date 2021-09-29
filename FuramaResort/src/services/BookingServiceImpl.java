package services;

import models.person.Customer;
import models.service.Booking;
import models.service.Facility;
import services.exception_validate.CheckValidTime;
import java.io.*;
import java.util.*;

public class BookingServiceImpl implements BookingService, Serializable {
    protected static File bookingFile = new File("C:\\C0721G2_NgoNguyenAnhTay\\FuramaResort\\src\\data\\booking.csv");
    protected static Scanner scanner = new Scanner(System.in);
    protected static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    protected static TreeSet<Booking> bookingTreeSet = new TreeSet<>(new BookingComparatorByCheckinTime());
    protected static List<Customer> customerList = CustomerServiceImpl.readDataFromFile();
    protected static Map<Facility, Integer> villaSet = FacilityServiceImpl.readDataFromFile(FacilityServiceImpl.villaFile);
    protected static Map<Facility, Integer> houseSet = FacilityServiceImpl.readDataFromFile(FacilityServiceImpl.houseFile);
    protected static Map<Facility, Integer> roomSet = FacilityServiceImpl.readDataFromFile(FacilityServiceImpl.roomFile);

    public void addNewBooking() {
        System.out.println("Enter bookingID");
        String bookingID = scanner.nextLine();

        System.out.println("Enter checkinTime");
        Date timeCI = CheckValidTime.checkValidTime();
        System.out.println("Enter checkinOut");
        Date timeCO = CheckValidTime.checkValidTime();

        Customer customer = getCustomerID();
        Facility service = getFacility();

        Booking booking = new Booking(bookingID, timeCI, timeCO, customer, service);
        if (bookingFile.length() > 0) {
            bookingTreeSet = readDataFromFile();
        }
        bookingTreeSet.add(booking);
        writeToFile(bookingTreeSet);
    }

    public void showBooking() {
        bookingTreeSet = readDataFromFile();
        for (Booking e : bookingTreeSet) {
            System.out.println(e + " ");
        }
    }

    public void deleteBooking() {
        bookingTreeSet = readDataFromFile();
        bookingTreeSet.forEach(System.out::println);
        System.out.println("Enter booking ID to delete booking !");
        String bookingId = scanner.nextLine();
        bookingTreeSet.removeIf(b -> b.getBookingID().equals(bookingId));
        writeToFile(bookingTreeSet);
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

            for (Map.Entry<Facility, Integer> villa : villaSet.entrySet()) {
                if (villa.getKey().getServiceID().equals(serviceID)) {
                    villa.setValue(villa.getValue() + 1);
                    FacilityServiceImpl.writeToFile(villaSet,FacilityServiceImpl.villaFile);
                    return villa.getKey();
                }
            }
            for (Map.Entry<Facility, Integer> house : houseSet.entrySet()) {
                if (house.getKey().getServiceID().equals(serviceID)) {
                    house.setValue(house.getValue() + 1);
                    FacilityServiceImpl.writeToFile(houseSet,FacilityServiceImpl.houseFile);
                    return house.getKey();
                }
            }
            for (Map.Entry<Facility, Integer> room : roomSet.entrySet()) {
                if (room.getKey().getServiceID().equals(serviceID)) {
                    room.setValue( room.getValue() + 1);
                    FacilityServiceImpl.writeToFile(roomSet,FacilityServiceImpl.roomFile);
                    return room.getKey();
                }
            }
        }
    }

    public static Queue<Booking> changeSetToQueue(){
        bookingTreeSet = readDataFromFile();
        Queue<Booking> bookingQueue = new ArrayDeque<>();
        for (Booking booking: bookingTreeSet) {
            bookingQueue.offer(booking);
        }
        return bookingQueue;

    }


    public static TreeSet<Booking> readDataFromFile() {
        TreeSet<Booking> bookingTreeSet = new TreeSet<>(new BookingComparatorByCheckinTime());
        try {
            FileInputStream fis = new FileInputStream(bookingFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            bookingTreeSet = (TreeSet<Booking>) ois.readObject();
            ois.close();
        } catch (Exception ex) {
            System.out.println("File is empty");
        }
        return bookingTreeSet;
    }

    public static void writeToFile(TreeSet<Booking> bookings) {
        try {
            FileOutputStream fos = new FileOutputStream(bookingFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bookings);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
