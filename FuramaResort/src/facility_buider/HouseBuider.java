package facility_buider;

import models.service.Facility;
import models.service.House;

public class HouseBuider {
    private String serviceName;
    private String serviceID;
    private String usableArea;
    private String rentalCost;
    private String maxNumberOfTenants;
    private String typeOfRent;
    private String roomStandard;
    private String numOfFloor;

    public HouseBuider addServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public HouseBuider addServiceId(String serviceId) {
        this.serviceID = serviceId;
        return this;
    }


    public HouseBuider addUsableArea(String usableArea) {
        this.usableArea = usableArea;
        return this;
    }

    public HouseBuider addRentalCost(String rentalCost) {
        this.rentalCost = rentalCost;
        return this;
    }


    public HouseBuider addNumberOfTenants(String maxNumberOfTenants) {
        this.maxNumberOfTenants = maxNumberOfTenants;
        return this;
    }


    public HouseBuider addTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
        return this;
    }

    public HouseBuider addRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
        return this;
    }


    public HouseBuider addNumOfFloor(String numOfFloor) {
        this.numOfFloor = numOfFloor;
        return this;
    }

    public Facility build() {
        return new House(serviceName,serviceID,usableArea,rentalCost,maxNumberOfTenants,typeOfRent,roomStandard,numOfFloor);
    }
}
