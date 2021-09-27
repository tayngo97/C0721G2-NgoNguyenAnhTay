package services;

import models.person.Customer;
import models.service.Booking;
import models.service.Facility;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookingServiceImpl implements BookingService {
    protected Scanner scanner = new Scanner(System.in);
    protected SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    protected static TreeSet<Booking> bookingTreeSet;



    static {
    bookingTreeSet = new TreeSet<>(new BookingComparatorByCheckinTime());
        Booking booking1 = new Booking("Bk1","20-09-2021","20-11-2020",CustomerServiceImpl.customerList.get(0),FacilityServiceImpl.getFT("Villa1"));
        Booking booking2 = new Booking("Bk2","05-10-2019","10-12-2020",CustomerServiceImpl.customerList.get(1),FacilityServiceImpl.getFT("Villa2"));
        Booking booking3 = new Booking("Bk3","10-09-2021","09-09-2021",CustomerServiceImpl.customerList.get(2),FacilityServiceImpl.getFT("Villa3"));
        Booking booking4 = new Booking("Bk4","22-09-2021","12-11-2021",CustomerServiceImpl.customerList.get(0),FacilityServiceImpl.getFT("Villa1"));
        Booking booking5 = new Booking("Bk5","28-09-2021","09-12-2021",CustomerServiceImpl.customerList.get(1),FacilityServiceImpl.getFT("Villa3"));
        Booking booking6 = new Booking("Bk6","01-09-2021","05-12-2021",CustomerServiceImpl.customerList.get(2),FacilityServiceImpl.getFT("Villa2"));
        bookingTreeSet.add(booking1);bookingTreeSet.add(booking2);bookingTreeSet.add(booking3);bookingTreeSet.add(booking4);bookingTreeSet.add(booking5);bookingTreeSet.add(booking6);
    }


    public void addNewBooking() {
        System.out.println("Enter bookingID");
        String bookingID = scanner.nextLine();

        Date checkinTime = null;
        Date checkoutTime = null;
        boolean flag = true;


        while (flag){
            flag = false;
        try {
            System.out.println("Enter checkinTime");
            checkinTime = dateFormat.parse(scanner.nextLine());
            System.out.println("Enter checkoutTime");
            checkoutTime = dateFormat.parse(scanner.nextLine());
        } catch (Exception e) {
            flag = true;
            System.err.println("Invalid date ,dd-MM-yyyy");
        }
        }
        String timeCI = dateFormat.format(checkinTime);
        String timeCO = dateFormat.format(checkoutTime);

        System.out.println("-------------CUSTOMERS LISTS--------------");
        CustomerServiceImpl.show();
        System.out.println("Enter customerID");
        String customerID = scanner.nextLine();
        Customer customer =  CustomerServiceImpl.getOb(customerID);
        if (customer == null){
            System.out.println("Not found your booking !");
        }

        System.out.println("-------------FACILITY LISTS--------------");
        FacilityServiceImpl.show();
        System.out.println("Enter service name");
        String serviceName = scanner.nextLine();
        Facility service = FacilityServiceImpl.getFT(serviceName);
        if (service == null){
            System.out.println("Not found your service name !");
        }

        Booking booking = new Booking(bookingID,timeCI,timeCO,customer,service);
        bookingTreeSet.add(booking);
    }

    public void showBooking() {
        for (Booking e : bookingTreeSet) {
            System.out.println(e + " ");
        }
    }


}
