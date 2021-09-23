package models.service;

import models.person.Customer;

import java.util.Comparator;


public class Booking  {
    private String bookingID ;
    private String checkinTime ;
    private String checkoutTime;
    private Customer customer;
    private  Facility facility;

    public Booking(String bookingID, String checkinTime, String checkoutTime,Customer customer,Facility facility) {
        this.bookingID = bookingID;
        this.checkinTime = checkinTime;
        this.checkoutTime = checkoutTime;
        this.customer = customer;
        this.facility = facility ;
    }


    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(String checkinTime) {
        this.checkinTime = checkinTime;
    }

    public String getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(String checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacilityName() {
        return facility;
    }

    public void setFacilityName(Facility facilityName) {
        this.facility = facilityName;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        Booking booking = (Booking) obj ;
        return this.bookingID.equals(booking.bookingID);
    }

    @Override
    public String toString() {
        return "New Booking{" +
                "bookingID=" + bookingID +
                ", checkinTime=" + checkinTime +
                ", checkoutTime=" + checkoutTime + "\n" +
                ", customer=" + customer + "\n" +
                ", facility=" + facility +
                '}' + "\n";
    }

}
