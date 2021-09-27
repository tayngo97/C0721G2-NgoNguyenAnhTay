package models.person;

import java.io.Serializable;

public class Customer  extends Person  implements Serializable {
    private String customerID;
    private String typeOfGuest;
    private String address;
    public final static String DIAMOND = "Diamond";
    public final static String PLATINUM = "Platinum";
    public final static String GOLD = "Gold";
    public final static String SILVER = "Silver";
    public final static String MEMBER = "Member";

    public Customer(String name, int birthday, String gender, int CMND, int phoneNumber, String email, String  customerID , String typeOfGuest, String address) {
        super(name, birthday, gender, CMND, phoneNumber, email);
        this.customerID = customerID;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                ", customerID='" + customerID + '\'' +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
