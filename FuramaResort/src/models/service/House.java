package models.service;

import models.service.Facility;

import java.io.Serializable;

public class House extends Facility {
    private String roomStandard;
    private String numOfFloor;

    public static final String STANDARD = "Standart";
    public static final String DELUXE = "Deluxe";
    public static final String FAMILY = "Family";

    public House(String serviceName, String serviceID, String usableArea, String rentalCost, String maxNumberOfTenants, String typeOfRent, String roomStandard, String numOfFloor) {
        super(serviceName, serviceID, usableArea, rentalCost, maxNumberOfTenants, typeOfRent);
        this.roomStandard = roomStandard;
        this.numOfFloor = numOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(String numOfFloor) {
        this.numOfFloor = numOfFloor;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", numOfFloor=" + numOfFloor +
                "} ";
    }

    public String stringToFile() {
        return getServiceName() + "," + getServiceID() + "," + getUsableArea() + "," + getRentalCost() + "," + getMaxNumberOfTenants() +
                "," + getTypeOfRent() + "," + getRoomStandard() + "," + getNumOfFloor();
    }
}
