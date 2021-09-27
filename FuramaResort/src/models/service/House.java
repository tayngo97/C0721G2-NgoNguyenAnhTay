package models.service;

import models.service.Facility;

public class House extends Facility {
    private String roomStandard ;
    private int numOfFloor;

    public House(String serviceName, String serviceID, int usableArea, int rentalCost, int maxNumberOfTenants, String typeOfRent, String roomStandard, int numOfFloor) {
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

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(int numOfFloor) {
        this.numOfFloor = numOfFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numOfFloor=" + numOfFloor +
                "} " + super.toString();
    }
}
