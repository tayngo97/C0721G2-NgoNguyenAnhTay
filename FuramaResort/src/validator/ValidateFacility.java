package validator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateFacility {
    private static Scanner scanner = new Scanner(System.in);
    private static final String REGEX_SERVICE_NAME = "^[A-Z][a-z0-9]+$";
    private static final String REGEX_VILLA_ID = "^[S][V][V][L][-][0-9]{4}$";
    private static final String REGEX_HOUSE_ID = "^[S][V][H][O][-][0-9]{4}$";
    private static final String REGEX_ROOM_ID = "^[S][V][R][O][-][0-9]{4}$";
    private static final String REGEX_USABLE_AREA1 = "^[3-9]+\\d+\\.?\\d{0,3}\\.?\\d{0,3}$";
    private static final String REGEX_RENTAL_COST = "^([\\d]{1,3}\\.[\\d]{0,3})+$|^[\\d]+$";
    private static final String REGEX_MAXIMUML_TENANTS = "^[1]?[1-9]?$";
    private static final String REGEX_NUM_OF_FLOOR = "^[1-9]\\d*$";
    private static final String REGEX_ROOM_STANDARD = "^[A-Z][a-z0-9]+$";
    private static final String REGEX_TYPE_OF_RENT = "^[A-Z][a-z0-9]+$";
    private static final String REGEX_POOL_AREA = "^[3-9]+\\d+\\.?\\d{0,3}\\.?\\d{0,3}$";


    public static String checkServiceName() {
        String serviceName = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter service name :");
            serviceName = scanner.nextLine();
            Pattern pattern = Pattern.compile(REGEX_SERVICE_NAME);
            Matcher matcher = pattern.matcher(serviceName);
            if (matcher.matches()) {
                flag = false;
            } else System.err.println("Invalid input Ex: Villa1,House1,Room1,... ");
        }
        return serviceName;
    }

    public static String checkVillaId() {
        String serviceVillaId = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter Villa Id :");
            serviceVillaId = scanner.nextLine();
            Pattern pattern = Pattern.compile(REGEX_VILLA_ID);
            Matcher matcher = pattern.matcher(serviceVillaId);
            if (matcher.matches()) {
                flag = false;
            } else System.err.println("Invalid input Ex: SVVL-1234,SVVL-0001,... ");
        }
        return serviceVillaId;
    }

    public static String checkHouseId() {
        String serviceHouseId = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter House Id :");
            serviceHouseId = scanner.nextLine();
            Pattern pattern = Pattern.compile(REGEX_HOUSE_ID);
            Matcher matcher = pattern.matcher(serviceHouseId);
            if (matcher.matches()) {
                flag = false;
            } else System.err.println("Invalid input Ex: SVVL-1234,SVVL-0001,... ");
        }
        return serviceHouseId;
    }

    public static String checkRoomId() {
        String serviceRoomId = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter Room Id :");
            serviceRoomId = scanner.nextLine();
            Pattern pattern = Pattern.compile(REGEX_ROOM_ID);
            Matcher matcher = pattern.matcher(serviceRoomId);
            if (matcher.matches()) {
                flag = false;
            } else System.err.println("Invalid input Ex: SVVL-1234,SVVL-0001,... ");
        }
        return serviceRoomId;
    }

    public static String checkUsableArea() {
        String area = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter Area of facility :");
            area = scanner.nextLine();
            Pattern pattern = Pattern.compile(REGEX_USABLE_AREA1);
            Matcher matcher = pattern.matcher(area);
            if (matcher.matches()) {
                flag = false;
            } else System.err.println("Invalid input Ex: 30.5 , 40.0 ... ");
        }
        return area;
    }

    public static String checkPoolArea() {
        String poolArea = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter pool area :");
            poolArea = scanner.nextLine();
            Pattern pattern = Pattern.compile(REGEX_POOL_AREA);
            Matcher matcher = pattern.matcher(poolArea);
            if (matcher.matches()) {
                flag = false;
            } else System.err.println("Invalid input Ex: 30.5 , 40.0 ... ");
        }
        return poolArea;
    }

    public static String checkRentalCost() {
        String rentalCost = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter rental cost of facility :");
            rentalCost = scanner.nextLine();
            Pattern pattern = Pattern.compile(REGEX_RENTAL_COST);
            Matcher matcher = pattern.matcher(rentalCost);
            if (matcher.matches()) {
                flag = false;
            } else System.err.println("Invalid input Ex: 120.000, 300.000 ... ");
        }
        return rentalCost;
    }

    public static String checkMaximumTenants() {
        String maximumTenants = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter rental maximum tenants of facility :");
            maximumTenants = scanner.nextLine();
            Pattern pattern = Pattern.compile(REGEX_MAXIMUML_TENANTS);
            Matcher matcher = pattern.matcher(maximumTenants);
            if (matcher.matches()) {
                flag = false;
            } else System.err.println("Invalid input from (1-20) Ex: 1,2,6,9,19,... ");
        }
        return maximumTenants;
    }

    public static String checktypeOfRent() {
        String typeOfRent = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter type of rent :");
            typeOfRent = scanner.nextLine();
            Pattern pattern = Pattern.compile(REGEX_TYPE_OF_RENT);
            Matcher matcher = pattern.matcher(typeOfRent);
            if (matcher.matches()) {
                flag = false;
            } else System.err.println("Invalid input Ex: Month,Year,Hours... ");
        }
        return typeOfRent;
    }

    public static String checkNumOfFloor() {
        String numOfFloor = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter num of floor :");
            numOfFloor = scanner.nextLine();
            Pattern pattern = Pattern.compile(REGEX_NUM_OF_FLOOR);
            Matcher matcher = pattern.matcher(numOfFloor);
            if (matcher.matches()) {
                flag = false;
            } else System.err.println("Invalid input Ex: 1,2,5... ");
        }
        return numOfFloor;
    }

    public static String checkRoomStandard() {
        String roomStandard = "";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter room standard:");
            roomStandard = scanner.nextLine();
            Pattern pattern = Pattern.compile(REGEX_ROOM_STANDARD);
            Matcher matcher = pattern.matcher(roomStandard);
            if (matcher.matches()) {
                flag = false;
            } else System.err.println("Invalid input Ex: Deluxe,Family... ");
        }
        return roomStandard;
    }


}
