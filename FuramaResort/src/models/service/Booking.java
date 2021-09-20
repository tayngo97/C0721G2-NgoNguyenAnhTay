package models;

import models.person.Customer;

public class Booking {
    private int bookingID;
    private int checkinTime;
    private int checkoutTime;
    private Customer customer;
    private  Facility facility;

    public Booking(int bookingID, int checkinTime, int checkoutTime, Customer customer, Facility facility) {
        this.bookingID = bookingID;
        this.checkinTime = checkinTime;
        this.checkoutTime = checkoutTime;
        this.customer = customer;
        this.facility = facility;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(int checkinTime) {
        this.checkinTime = checkinTime;
    }

    public int getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(int checkoutTime) {
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
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", checkinTime=" + checkinTime +
                ", checkoutTime=" + checkoutTime +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }

}
