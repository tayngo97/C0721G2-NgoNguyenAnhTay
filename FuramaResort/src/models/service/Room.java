package models.service;

import models.service.Facility;

public class Room extends Facility {
    private String promotionService;

    public Room(String serviceName, String serviceID, int usableArea, int rentalCost, int maxNumberOfTenants, String typeOfRent, String promotionService) {
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
        return "Room{" +
                "promotionService='" + promotionService + '\'' +
                "} " + super.toString();
    }
}
