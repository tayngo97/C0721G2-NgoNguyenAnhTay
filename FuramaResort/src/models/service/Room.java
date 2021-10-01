package models.service;

import models.service.Facility;

import java.io.Serializable;

public class Room extends Facility {
    private String promotionService;

    public Room(String serviceName, String serviceID, String usableArea, String rentalCost, String maxNumberOfTenants, String typeOfRent, String promotionService) {
        super(serviceName, serviceID, usableArea, rentalCost, maxNumberOfTenants, typeOfRent);
        this.promotionService = promotionService;
    }

    public String getPromotionService() {
        return promotionService;
    }

    public void setPromotionService(String promotionService) {
        this.promotionService = promotionService;
    }

    @Override
    public String toString() {
        return "Room{"  + super.toString()+
                "promotionService='" + promotionService + '\'' +
                "} ";
    }

    public String stringToFile(){
        return getServiceName() +","+ getServiceID()+","+ getUsableArea()+","+ getRentalCost()+","+ getMaxNumberOfTenants()+
                ","+ getTypeOfRent()+","+ getPromotionService();
    }
}
