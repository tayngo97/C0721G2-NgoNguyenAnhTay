package models.service;

import models.person.Customer;
import models.person.Voucher;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;


public class Booking  implements Serializable{
    protected static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private String bookingID ;
    private Date checkinTime ;
    private Date checkoutTime;
    private Customer customer;
    private  Facility facility;
    private String checkInTime;
    private String checkOutTime;

    public Booking(String bookingID, Date checkinTime, Date checkoutTime,Customer customer,Facility facility) {
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

    public Date getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Date checkinTime) {
        this.checkinTime = checkinTime;
    }

    public Date getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(Date checkoutTime) {
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

    public String checkInTime(){
        return checkInTime = simpleDateFormat.format(checkinTime);
    }

    public String checkOutTime(){
        return checkOutTime = simpleDateFormat.format(checkoutTime);
    }

    @Override
    public String toString() {
        return "New Booking{" +
                "bookingID=" + bookingID +
                ", checkinTime=" + checkInTime() +
                ", checkoutTime=" + checkOutTime() + "\n" +
                ", customer=" + customer + "\n" +
                ", facility=" + facility +
                '}' + "\n";
    }
}
