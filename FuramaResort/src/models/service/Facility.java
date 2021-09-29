package models.service;

import java.io.Serializable;

public abstract class Facility implements Serializable {
    private String serviceName;
    private String serviceID;
    private String usableArea;
    private String rentalCost;
    private String maxNumberOfTenants ;
    private  String typeOfRent;

    public final static String HOURS = "Hours";
    public final static String MONTH = "Month";
    public final static String YEAR = "Year";

    public Facility(String serviceName, String serviceID, String usableArea, String rentalCost, String maxNumberOfTenants, String typeOfRent) {
        this.serviceName = serviceName;
        this.serviceID = serviceID;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxNumberOfTenants = maxNumberOfTenants;
        this.typeOfRent = typeOfRent;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(String rentalCost) {
        this.rentalCost = rentalCost;
    }

    public String getMaxNumberOfTenants() {
        return maxNumberOfTenants;
    }

    public void setMaxNumberOfTenants(String maxNumberOfTenants) {
        this.maxNumberOfTenants = maxNumberOfTenants;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    @Override
    public String toString() {
        return
                "serviceName='" + serviceName + '\'' +
                ", serviceID='" + serviceID + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rentalCost='" + rentalCost + '\'' +
                ", maxNumberOfTenants='" + maxNumberOfTenants + '\'' +
                ", typeOfRent='" + typeOfRent + '\'';
    }
}
