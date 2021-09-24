package models.service;

import models.person.Customer;

public class Contract {
    private String contractID;
    private Booking bookingID;
    private int depositAmount;
    private int totalPayment;
    private Customer customerID;

    public Contract(String contractID, Booking bookingID, int depositAmount, int totalPayment, Customer customerID) {
        this.contractID = contractID;
        this.bookingID = bookingID;
        this.depositAmount = depositAmount;
        this.totalPayment = totalPayment;
        this.customerID = customerID;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public Booking getBookingID() {
        return bookingID;
    }

    public void setBookingID(Booking bookingID) {
        this.bookingID = bookingID;
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractID='" + contractID + '\'' +
                ", bookingID='" + bookingID + '\'' +
                ", depositAmount=" + depositAmount +
                ", totalPayment=" + totalPayment +
                ", customerID='" + customerID + '\'' +
                '}';
    }
}