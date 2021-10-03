package facility_buider;

import models.service.Facility;
import models.service.Room;

public class RoomBuider {
    private String serviceName;
    private String serviceID;
    private String usableArea;
    private String rentalCost;
    private String maxNumberOfTenants ;
    private  String typeOfRent;
    private String promotionService;
    
    public RoomBuider addServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public RoomBuider addServiceId(String serviceId) {
        this.serviceID = serviceId;
        return this;
    }


    public RoomBuider addUsableArea(String usableArea) {
        this.usableArea = usableArea;
        return this;
    }

    public RoomBuider addRentalCost(String rentalCost) {
        this.rentalCost = rentalCost;
        return this;
    }


    public RoomBuider addNumberOfTenants(String maxNumberOfTenants) {
        this.maxNumberOfTenants = maxNumberOfTenants;
        return this;
    }


    public RoomBuider addTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
        return this;
    }

    public RoomBuider addPromotionService(String promotionService) {
        this.promotionService = promotionService;
        return this;
    }

    public Facility build() {
        return new Room(serviceName,serviceID,usableArea,rentalCost,maxNumberOfTenants,typeOfRent,promotionService);
    }
}
