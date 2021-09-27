package models.service;

public abstract class Facility {
    private String serviceName;
    private String serviceID;
    private int usableArea;
    private int rentalCost;
    private int maxNumberOfTenants ;
    private  String typeOfRent;

    public final static String HOURS = "hours";
    public final static String MONTH = "month";
    public final static String YEAR = "year";

    public Facility(String serviceName, String serviceID, int usableArea, int rentalCost, int maxNumberOfTenants, String typeOfRent) {
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

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxNumberOfTenants() {
        return maxNumberOfTenants;
    }

    public void setMaxNumberOfTenants(int maxNumberOfTenants) {
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
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", serviceID='" + serviceID + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxNumberOfTenants=" + maxNumberOfTenants +
                ", typeOfRent='" + typeOfRent + '\'' +
                '}';
    }
}
