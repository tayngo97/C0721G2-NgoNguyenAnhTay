package models.service;

import models.service.Facility;

import java.io.Serializable;

public class Villa  extends Facility implements Serializable {
    private String roomStandard ;
    private String poolArea;
    private String numOfFloor;

    public static final String STANDARD = "Standard";
    public static final String DELUXE = "Deluxe";
    public static final String FAMILY = "Family";

    public Villa(String serviceName, String serviceID, String usableArea, String rentalCost, String maxNumberOfTenants, String typeOfRent, String roomStandard, String poolArea, String numOfFloor) {
        super(serviceName, serviceID, usableArea, rentalCost, maxNumberOfTenants, typeOfRent);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numOfFloor = numOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(String numOfFloor) {
        this.numOfFloor = numOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numOfFloor=" + numOfFloor +
                "} ";
    }
}
