package services;

import models.service.Facility;
import models.service.House;
import models.service.Room;
import models.service.Villa;
import utils.HouseToCsv;
import utils.RoomToCsv;
import utils.VillaToCsv;
import validator.CheckInput;

import java.io.File;
import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static  CheckInput  input = new CheckInput();
    protected static VillaToCsv villaList  = new VillaToCsv();
    protected static HouseToCsv houseList  = new HouseToCsv();
    protected static RoomToCsv roomList  = new RoomToCsv();
    private static Map<Villa, Integer> villaMap = new LinkedHashMap<>();
    private static Map<House, Integer> houseMap = new LinkedHashMap<>();
    private static Map<Room, Integer> roomMap = new LinkedHashMap<>();
    private static Map<Facility, Integer> facilities = new LinkedHashMap<>();
    private Scanner  scanner = new Scanner(System.in);


    public void show() {
        if ( VillaToCsv.villaFile.length() > 0) {
            Map<Villa, Integer> villaMap = villaList.readDataFromFile();
            for (Map.Entry<Villa, Integer> entry : villaMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue() + "times");
            }
        }
        if (HouseToCsv.houseFile.length() > 0) {
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

    public void add() {
        boolean flag = true;
        while (flag) {
            flag = false;
            try {
                System.out.println("Enter your choice" + "\n" + "1.Add New Villa" + "\n"
                        + "2.Add New House" + "\n" + "3.Add New Room" + "\n" + "4.Back to Menu");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 4) {
                    break;
                } else if (choice > 4) continue;
                System.out.println("Enter service name :");
                String seviceName = input.getInput(input.REGEX_CHECK_NAME);
                System.out.println("Enter number of usable area :");
                String area = input.getInput(input.REGEX_AREA);
                String rentalCost = input.getInput(input.REGEX_RENTAL_COST);
                String maxNumberOfTenants = input.getInput(input.REGEX_MAXIMUML_TENANTS);
                System.out.println("Enter type of rent :");
                String typeOfRent = input.getInput(input.REGEX_CHECK_NAME);
                switch (choice) {
                    case 1:
                        String serviceVillaId = input.getInput(input.REGEX_VILLA_ID);
                        String roomStandard = input.getInput(input.REGEX_CHECK_NAME);
                        System.out.println("Enter number of pool area");
                        String poolArea = input.getInput(input.REGEX_AREA);
                        String numOfFloor = input.getInput(input.REGEX_NUM_OF_FLOOR);
                        Villa villa = new Villa(seviceName, serviceVillaId, area, rentalCost,
                                maxNumberOfTenants, typeOfRent, roomStandard, poolArea, numOfFloor);

                        if (VillaToCsv.villaFile.length() > 0) {
                            villaMap = villaList.readDataFromFile();
                        }
                        villaMap.put(villa, 0);
                        villaList.writeToFile(villaMap);
                        break;
                    case 2:
                        String serviceHouseId = input.getInput(input.REGEX_HOUSE_ID);
                        String roomStandard1 = input.getInput(input.REGEX_CHECK_NAME);
                        String numOfFloor1 = input.getInput(input.REGEX_NUM_OF_FLOOR);
                        House house = new House(seviceName, serviceHouseId, area,
                                rentalCost, maxNumberOfTenants, typeOfRent, roomStandard1, numOfFloor1);
                        if (HouseToCsv.houseFile.length() > 0) {
                            houseMap = houseList.readDataFromFile();
                          }
                        houseMap.put(house, 0);
                        houseList.writeToFile(houseMap);
                        break;
                    case 3:
                        String serviceRoomId = input.getInput(input.REGEX_ROOM_ID);
                        System.out.println("Enter FreeService");
                        String promotionService = scanner.nextLine();
                        Room room = new Room(seviceName, serviceRoomId, area, rentalCost,
                                maxNumberOfTenants, typeOfRent, promotionService);
                        if (RoomToCsv.roomFile.length() > 0) {
                            roomMap = roomList.readDataFromFile();
                        }
                        roomMap.put(room, 0);
                        roomList.writeToFile(roomMap);
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Invalid input !");
                flag = true;
            }
        }
        show();
    }



    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }

    public void showMaintenanceList() {
        boolean flag = false;
        if ( VillaToCsv.villaFile.length() > 0) {
            Map<Villa, Integer> villaMap = villaList.readDataFromFile();
            for (Map.Entry<Villa, Integer> entry : villaMap.entrySet()) {
                if (entry.getValue() >= 5) {
                    System.out.println("Need to maintenance " + entry.getKey() + " exceed " + entry.getValue() + "times");
                    flag = true;
                }
            }
        }
        if (HouseToCsv.houseFile.length() > 0) {
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
