package models.service;

import models.person.Customer;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Booking implements Comparable<Booking> {
    protected static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private String bookingID;
    private String checkinTime;
    private String checkoutTime;
    private Customer customer;
    private Facility facility;
    private Date checkin;
    private Date checkout;

    public Booking(String bookingID, String checkinTime, String checkoutTime, Customer customer, Facility facility) {
        this.bookingID = bookingID;
        this.checkinTime = checkinTime;
        this.checkoutTime = checkoutTime;
        this.customer = customer;
        this.facility = facility;
    }

    public String stringToWrite() {
        return getBookingID() + "," + getCheckinTime() + "," + getCheckoutTime() + "," + getCustomer().stringToWrite() + "," + getFacility().stringToFile();
    }

    public Date getCheckIn() {
        try {
            this.checkin = simpleDateFormat.parse(this.checkinTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return checkin;
    }

    public Date getCheckOut() {
        try {
            this.checkout = simpleDateFormat.parse(this.checkoutTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return checkout;
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

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facilityName) {
        this.facility = facilityName;
    }



    @Override
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", checkinTime=" + checkinTime +
                ", checkoutTime=" + checkoutTime + "\n"
                + customer + "\n"
                + facility +
                '}' + "\n";
    }

    public String toStringContract() {
        return   bookingID +
                ", checkinTime=" + checkinTime +
                ", checkoutTime=" + checkoutTime + "\n"
                + customer + "\n"
                + facility +
                '}' + "\n";
    }

    @Override
    public int compareTo(Booking o) {
        if ((bookingID.compareTo(o.bookingID)) == 0){
            return 0;
        }
        if ((this.getCheckIn().compareTo(o.getCheckIn()) == 0)) {
            return this.getCheckOut().compareTo(o.getCheckOut());
        } else return this.getCheckIn().compareTo(o.getCheckIn());
    }

}
