package models;

public class Customer  extends Person{
    private String customerID;
    private String typeOfGuest;
    private String address;
    private final static String DIAMOND = "Diamond";
    private final static String PLATINUM = "Platinum";
    private final static String GOLD = "Gold";
    private final static String SILVER = "Silver";
    private final static String MEMBER = "Member";

    public Customer(String name, int birthday, String gender, int CMND, int phoneNumber, String email, String customerID, String typeOfGuest, String address) {
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

    public static void main(String[] args) {
        Customer customer = new Customer("Lan",123,"Male",123,123,"Ef","asd",GOLD,"DN");
    }

}
