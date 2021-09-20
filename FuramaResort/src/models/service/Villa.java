package models;

public class Villa  extends Facility{
    private String roomStandard ;
    private int poolArea;
    private int numOfFloor;

    public Villa(String serviceName, int usableArea, int rentalCost, int maxNumberOfTenants, String typeOfRent, String roomStandard, int poolArea, int numOfFloor) {
        super(serviceName, usableArea, rentalCost, maxNumberOfTenants, typeOfRent);
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

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(int numOfFloor) {
        this.numOfFloor = numOfFloor;
    }
}
