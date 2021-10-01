package services;

import models.service.House;
import models.service.Room;
import models.service.Villa;
import services.exception_validate.ValidateFacility;
import utils.HouseToCSV;
import utils.RoomToCsv;
import utils.VillaToCSV;

import java.io.*;
import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    protected static VillaToCSV villaList  = new VillaToCSV();
    protected static HouseToCSV houseList  = new HouseToCSV();
    protected static RoomToCsv roomList  = new RoomToCsv();
    private static Map<Villa, Integer> villaMap = new LinkedHashMap<>();
    private static Map<House, Integer> houseMap = new LinkedHashMap<>();
    private static Map<Room, Integer> roomMap = new LinkedHashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void showFacilityList() {
        if ( VillaToCSV.villaFile.length() > 0) {
            Map<Villa, Integer> villaMap = villaList.readDataFromFile();
            for (Map.Entry<Villa, Integer> entry : villaMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue() + "times");
            }
        }
        if (HouseToCSV.houseFile.length() > 0) {
            Map<House, Integer> houseMap = houseList.readDataFromFile();
            for (Map.Entry<House, Integer> entry : houseMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue() + "times");
            }
        }
        if (RoomToCsv.roomFile.length() > 0) {
            Map<Room, Integer> roomMap = roomList.readDataFromFile();
            for (Map.Entry<Room, Integer> entry : roomMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue() + "times");
            }
        }
    }

    public void addNewService() {
        boolean flag = true;
        while (flag) {
            flag = false;
            try {
                System.out.println("Enter your choice" + "\n" + "1.Add New Villa" + "\n" + "2.Add New House" + "\n" + "3.Add New Room" + "\n" + "4.Back to Menu");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 4) {
                    break;
                } else if (choice > 4) continue;

                String seviceName = ValidateFacility.checkServiceName();
                String area = ValidateFacility.checkUsableArea();
                String rentalCost = ValidateFacility.checkRentalCost();
                String maxNumberOfTenants = ValidateFacility.checkMaximumTenants();
                String typeOfRent = ValidateFacility.checktypeOfRent();

                switch (choice) {
                    case 1:
                        String serviceVillaId = ValidateFacility.checkVillaId();
                        String roomStandard = ValidateFacility.checkRoomStandard();
                        String poolArea = ValidateFacility.checkPoolArea();
                        String numOfFloor = ValidateFacility.checkNumOfFloor();
                        Villa villa = new Villa(seviceName, serviceVillaId, area, rentalCost, maxNumberOfTenants, typeOfRent, roomStandard, poolArea, numOfFloor);
                        if (VillaToCSV.villaFile.length() > 0) {
                            villaMap = villaList.readDataFromFile();
                        }
                        villaMap.put(villa, 0);
                        villaList.writeToFile(villaMap);
                        break;
                    case 2:
                        String serviceHouseId = ValidateFacility.checkHouseId();
                        String roomStandard1 = ValidateFacility.checkRoomStandard();
                        String numOfFloor1 = ValidateFacility.checkNumOfFloor();
                        House house = new House(seviceName, serviceHouseId, area, rentalCost, maxNumberOfTenants, typeOfRent, roomStandard1, numOfFloor1);
                        if (HouseToCSV.houseFile.length() > 0) {
                            houseMap = houseList.readDataFromFile();
                        }
                        houseMap.put(house, 0);
                        houseList.writeToFile(houseMap);
                        break;
                    case 3:
                        String serviceRoomId = ValidateFacility.checkRoomId();
                        System.out.println("Enter FreeService");
                        String promotionService = scanner.nextLine();
                        Room room = new Room(seviceName, serviceRoomId, area, rentalCost, maxNumberOfTenants, typeOfRent, promotionService);
                        if (RoomToCsv.roomFile.length() > 0) {
                            roomMap = roomList.readDataFromFile();
                        }
                        roomMap.put(room, 0);
                        roomList.writeToFile(roomMap);
                        break;
                }
            } catch (Exception e) {
                System.err.println("Invalid input !");
                flag = true;
            }
        }
        showFacilityList();
    }

    @Override
    public void showMaintenanceList() {
        boolean flag = false;
        if ( VillaToCSV.villaFile.length() > 0) {
            Map<Villa, Integer> villaMap = villaList.readDataFromFile();
            for (Map.Entry<Villa, Integer> entry : villaMap.entrySet()) {
                if (entry.getValue() >= 5) {
                    System.out.println("Need to maintenance " + entry.getKey() + " exceed " + entry.getValue() + "times");
                    flag = true;
                }
            }
        }
        if (HouseToCSV.houseFile.length() > 0) {
            Map<House, Integer> houseMap = houseList.readDataFromFile();
            for (Map.Entry<House, Integer> entry : houseMap.entrySet()) {
                if (entry.getValue() >= 5) {
                    System.out.println("Need to maintenance " + entry.getKey() + " exceed " + entry.getValue() + "times");
                    flag = true;
                }
            }
        }
        if (RoomToCsv.roomFile.length() > 0) {
            Map<Room, Integer> roomMap = roomList.readDataFromFile();
            for (Map.Entry<Room, Integer> entry : roomMap.entrySet()) {
                if (entry.getValue() >= 5) {
                    System.out.println("Need to maintenance " + entry.getKey() + " exceed " + entry.getValue() + "times");
                    flag = true;
                }
            }
        }
        if (!flag){
            System.err.println("Have no facility need to maintenance!");
        }
    }
}
