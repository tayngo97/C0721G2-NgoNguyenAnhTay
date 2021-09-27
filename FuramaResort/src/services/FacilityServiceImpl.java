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
        facilityIntegerMap.put(new Villa("Villa1", "SVVL-0001", 50, 100000, 4, Villa.HOURS, Villa.FAMILY, 50, 4), 0);
        facilityIntegerMap.put(new Villa("Villa2", "SVVL-0002", 50, 120000, 4, Villa.MONTH, Villa.DELUXE, 50, 5), 0);
        facilityIntegerMap.put(new Villa("Villa3", "SVVL-0003", 50, 150000, 4, Villa.YEAR, Villa.DELUXE, 50, 6), 0);
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
        boolean flag = true;
        while (flag) {
            flag = false;
            try {
                System.out.println("Enter your choice" + "\n" + "1.Add New Villa" + "\n" + "2.Add New House" + "\n" + "3.Add New Room" + "\n" + "4.Back to Menu");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 4 || choice > 4) break;
                System.out.println("Enter serviceName");
                String name = scanner.nextLine();
                System.out.println("Enter serviceID");
                String serviceId = scanner.nextLine();
                System.out.println("Enter usableArea");
                int Area = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter rentalCost");
                int rentalCost = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter maxNumberOfTenants");
                int maxNumberOfTenants = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter typeOfRent");
                String typeOfRent = scanner.nextLine();
                switch (choice) {
                    case 1:
                        flag = true;
                        while (flag) {
                            flag = false;
                            try {
                                System.out.println("Enter roomStandard");
                                String roomStandard = scanner.nextLine();
                                System.out.println("Enter poolArea");
                                int poolArea = Integer.parseInt(scanner.nextLine());
                                System.out.println("Enter numOfFloor");
                                int numOfFloor = Integer.parseInt(scanner.nextLine());
                                Villa villa = new Villa(name, serviceId, Area, rentalCost, maxNumberOfTenants, typeOfRent, roomStandard, poolArea, numOfFloor);
                                facilityIntegerMap.put(villa, 0);
                            } catch (Exception e) {
                                System.err.println("Invalid input");
                                flag = true;
                            }
                        }
                        break;
                    case 2:
                        flag = true;
                        while (flag) {
                            flag = false;
                            try {
                                System.out.println("Enter roomStandard");
                                String roomStandard1 = scanner.nextLine();
                                System.out.println("Enter numOfFloor");
                                int numOfFloor1 = Integer.parseInt(scanner.nextLine());
                                House house = new House(name, serviceId, Area, rentalCost, maxNumberOfTenants, typeOfRent, roomStandard1, numOfFloor1);
                                facilityIntegerMap.put(house, 0);
                            } catch (Exception e) {
                                System.err.println("Invalid input");
                                flag = true;
                            }
                        }
                        break;
                    case 3:
                        flag = true;
                        while (flag) {
                            flag = false;
                            try {
                                System.out.println("Enter FreeService");
                                String promotionService = scanner.nextLine();
                                Room room = new Room(name, serviceId, Area, rentalCost, maxNumberOfTenants, typeOfRent, promotionService);
                                facilityIntegerMap.put(room, 0);
                            } catch (Exception e) {
                                System.err.println("Invalid input");
                                flag = true;
                            }
                        }
                        break;
                }
            } catch (Exception e) {
                System.err.println("Invalid input !");
                flag = true;
            }
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

    public static void show() {
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() + "times");
        }
    }
}
