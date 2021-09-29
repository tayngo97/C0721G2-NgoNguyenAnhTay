package services;

import models.person.Customer;
import models.service.Facility;
import models.service.House;
import models.service.Room;
import models.service.Villa;
import services.exception_validate.ValidateFacility;

import java.io.*;
import java.util.*;

public class FacilityServiceImpl implements FacilityService,Serializable {
    public static File villaFile = new File("C:\\C0721G2_NgoNguyenAnhTay\\FuramaResort\\src\\data\\villa.csv");
    public static File houseFile = new File("C:\\C0721G2_NgoNguyenAnhTay\\FuramaResort\\src\\data\\house.csv");
    public static File roomFile = new File("C:\\C0721G2_NgoNguyenAnhTay\\FuramaResort\\src\\data\\room.csv");
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void showFacilityList() {
        if (villaFile.length()>0){
            Map<Facility,Integer> villaMap= readDataFromFile(villaFile);
            for (Map.Entry<Facility, Integer> entry : villaMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue() + "times");
            }
        }
        if (houseFile.length()>0){
            Map<Facility,Integer> houseMap= readDataFromFile(houseFile);
            for (Map.Entry<Facility, Integer> entry : houseMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue() + "times");
            }
        }
        if (roomFile.length()>0){
            Map<Facility,Integer> roomMap= readDataFromFile(roomFile);
            for (Map.Entry<Facility, Integer> entry : roomMap.entrySet()) {
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
                        Villa villa = new Villa(seviceName,serviceVillaId,area,rentalCost,maxNumberOfTenants,typeOfRent,roomStandard,poolArea,numOfFloor);
                        if (villaFile.length()>0){
                            facilityIntegerMap = readDataFromFile(villaFile);
                        }
                        facilityIntegerMap.put(villa,0);
                        writeToFile(facilityIntegerMap,villaFile);
                        break;
                    case 2:
                        String serviceHouseId = ValidateFacility.checkHouseId();
                        String roomStandard1 = ValidateFacility.checkRoomStandard();
                        String numOfFloor1 = ValidateFacility.checkNumOfFloor();
                        House house = new House(seviceName,serviceHouseId,area,rentalCost,maxNumberOfTenants,typeOfRent,roomStandard1,numOfFloor1);
                        if (houseFile.length()>0){
                            facilityIntegerMap = readDataFromFile(houseFile);
                        }
                        facilityIntegerMap.put(house,0);
                        writeToFile(facilityIntegerMap,houseFile);
                        break;
                    case 3:
                        String serviceRoomId = ValidateFacility.checkRoomId();
                        System.out.println("Enter FreeService");
                        String promotionService = scanner.nextLine();
                        Room room = new Room(seviceName, serviceRoomId,area,rentalCost,maxNumberOfTenants,typeOfRent,promotionService);
                        if (roomFile.length() > 0){
                            facilityIntegerMap = readDataFromFile(roomFile);
                        }
                        facilityIntegerMap.put(room, 0);
                        writeToFile(facilityIntegerMap,roomFile);
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
        if (villaFile.length()>0){
            Map<Facility,Integer> villaMap= readDataFromFile(villaFile);
            for (Map.Entry<Facility, Integer> entry : villaMap.entrySet()) {
                if (entry.getValue() >= 5) {
                    System.out.println("Need to maintenance " + entry.getKey() + " exceed " + entry.getValue() + "times");
                }
            }
        }
        if (houseFile.length()>0){
            Map<Facility,Integer> houseMap= readDataFromFile(houseFile);
            for (Map.Entry<Facility, Integer> entry : houseMap.entrySet()) {
                if (entry.getValue() >= 5) {
                    System.out.println("Need to maintenance " + entry.getKey() + " exceed " + entry.getValue() + "times");
                }
            }
        }
        if (roomFile.length()>0){
            Map<Facility,Integer> roomMap= readDataFromFile(roomFile);
            for (Map.Entry<Facility, Integer> entry : roomMap.entrySet()) {
                if (entry.getValue() >= 5) {
                    System.out.println("Need to maintenance " + entry.getKey() + " exceed " + entry.getValue() + "times");
                }
            }
        }
    }

    public static Map<Facility,Integer> readDataFromFile(File file) {
        Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            facilityIntegerMap = (Map<Facility,Integer>) ois.readObject();

            ois.close();
        } catch (Exception ex) {
//            System.err.println("Empty facility");
        }
        return facilityIntegerMap;
    }

    public static void writeToFile(Map<Facility,Integer> facilities,File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(facilities);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
