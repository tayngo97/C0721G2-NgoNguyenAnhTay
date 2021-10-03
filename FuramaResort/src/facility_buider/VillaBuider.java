package facility_buider;

import models.service.Facility;
import models.service.Villa;

public class VillaBuider {
    private String serviceName;
    private String serviceID;
    private String usableArea;
    private String rentalCost;
    private String maxNumberOfTenants ;
    private  String typeOfRent;
    private String roomStandard ;
    private String poolArea;
    private String numOfFloor;

    public VillaBuider addServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public VillaBuider addServiceId(String serviceId) {
        this.serviceID = serviceId;
        return this;
    }


    public VillaBuider addUsableArea(String usableArea) {
        this.usableArea = usableArea;return this;
    }

    public VillaBuider addRentalCost(String rentalCost) {
        this.rentalCost = rentalCost;
        return  this;
    }


    public VillaBuider addNumberOfTenants(String maxNumberOfTenants) {
        this.maxNumberOfTenants = maxNumberOfTenants;return this;
    }


    public VillaBuider addTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;return this;
    }

    public VillaBuider addRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
        return  this;
    }

    public VillaBuider addPoolArea(String poolArea) {
        this.poolArea = poolArea;
        return this;
    }

    public VillaBuider addNumOfFloor(String numOfFloor) {
        this.numOfFloor= numOfFloor;
        return this;
    }

    public Facility build() {
        return new Villa(serviceName,serviceID,usableArea,rentalCost,maxNumberOfTenants,typeOfRent,roomStandard,poolArea,numOfFloor);
    }
}
