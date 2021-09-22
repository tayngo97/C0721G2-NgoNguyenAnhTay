package services;

import models.person.Customer;
import models.service.Facility;
import models.service.House;
import models.service.Room;
import models.service.Villa;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    ;
    private Scanner scanner = new Scanner(System.in);

    static {
        facilityIntegerMap.put(new Villa("Villa1", 50, 100000, 4, Villa.HOURS, Villa.FAMILY, 50, 4), 0);
        facilityIntegerMap.put(new Villa("Villa2", 50, 120000, 4, Villa.MONTH, Villa.DELUXE, 50, 5), 0);
        facilityIntegerMap.put(new Villa("Villa3", 50, 150000, 4, Villa.YEAR, Villa.DELUXE, 50, 6), 0);
    }

    public void showFacilityList() {
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() + "times");
        }
    }

    public static Facility getFT(String facilityName) {
        for (Map.Entry<Facility, Integer> e : facilityIntegerMap.entrySet()) {
            if (e.getKey().getServiceName().equals(facilityName)) {
                e.setValue(e.getValue() + 1);
                return e.getKey();
            }
        }
        return null;
    }

    @Override
    public void addNewService() {
        System.out.println("Enter your choice" + "\n" + "1.Add New Villa" + "\n" + "2.Add New House" + "\n" + "3.Add New Room" + "\n" + "4.Back to Menu");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter serviceName");
        String name = scanner.nextLine();
        System.out.println("Enter usableArea");
        int Area = scanner.nextInt();
        System.out.println("Enter rentalCost");
        int rentalCost = scanner.nextInt();
        System.out.println("Enter maxNumberOfTenants");
        int maxNumberOfTenants = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter typeOfRent");
        String typeOfRent = scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter roomStandard");
                String roomStandard = scanner.nextLine();
                System.out.println("Enter poolArea");
                int poolArea = scanner.nextInt();
                System.out.println("Enter numOfFloor");
                int numOfFloor = scanner.nextInt();
                Villa villa = new Villa(name, Area, rentalCost, maxNumberOfTenants, typeOfRent, roomStandard, poolArea, numOfFloor);
                facilityIntegerMap.put(villa, 0);
                break;

            case 2:
                System.out.println("Enter roomStandard");
                String roomStandard1 = scanner.nextLine();
                System.out.println("Enter numOfFloor");
                int numOfFloor1 = scanner.nextInt();
                House house = new House(name, Area, rentalCost, maxNumberOfTenants, typeOfRent, roomStandard1, numOfFloor1);
                facilityIntegerMap.put(house, 0);
                break;
            case 3:
                String typeOfRent3 = scanner.nextLine();
                System.out.println("Enter promotionService");
                String promotionService = scanner.nextLine();
                Room room = new Room(name, Area, rentalCost, maxNumberOfTenants, typeOfRent3, promotionService);
                facilityIntegerMap.put(room, 0);
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid");
        }
    }

    @Override
    public void showMaintenanceList() {
        for (Map.Entry<Facility, Integer> e : facilityIntegerMap.entrySet()) {
            if (e.getValue() >= 5) {
                System.out.println("Need to maintenance " + e.getKey() + " exceed " + e.getValue() + "times");
            }
        }
    }


}
