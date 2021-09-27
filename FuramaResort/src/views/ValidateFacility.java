package views;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateFacility {
    private static final  String REGEX_VILLA_ID = "^[S][V][V][L][-][0-9]{4}$";
    private static final  String REGEX_HOUSE_ID = "^[S][V][H][O][-][0-9]{4}$";
    private static final  String REGEX_ROOM_ID = "^[S][V][R][O][-][0-9]{4}$";
    private static final  String REGEX_SERVICE_NAME = "^[A-Z][a-z0-9]+$";
    private static final  String REGEX_USABLE_AREA1 = "^[3-9]+\\d+\\.?\\d{0,3}\\.?\\d{0,3}$";
    private static final  String REGEX_RENTAL_COST = "^([\\d]{1,3}\\.[\\d]{0,3})+$|^[\\d]+$";
    private static final  String REGEX_MAXIMUML_TENANTS = "^[1]?[\\d]?$";
    private static final  String REGEX_NUM_OF_FLOOR = "^[1-9]\\d*$";



    public static boolean checkVillaId(String serviceID){
        Pattern pattern = Pattern.compile(REGEX_VILLA_ID);
        Matcher matcher = pattern.matcher(serviceID);
        return matcher.matches();
    }

    public static boolean checkHouseId(String serviceID){
        Pattern pattern = Pattern.compile(REGEX_HOUSE_ID);
        Matcher matcher = pattern.matcher(serviceID);
        return matcher.matches();
    }

    public static boolean checkRoomId(String serviceID){
        Pattern pattern = Pattern.compile(REGEX_ROOM_ID);
        Matcher matcher = pattern.matcher(serviceID);
        return matcher.matches();
    }

    public static boolean checkServiceName(String serviceID){
        Pattern pattern = Pattern.compile(REGEX_SERVICE_NAME);
        Matcher matcher = pattern.matcher(serviceID);
        return matcher.matches();
    }

    public static boolean checkUsableArea(String usableArea){
        Pattern pattern = Pattern.compile(REGEX_USABLE_AREA1);
        Matcher matcher = pattern.matcher(usableArea);
        return matcher.matches();
    }

    public static boolean checkRentalCost(String rentalCost){
        Pattern pattern = Pattern.compile(REGEX_RENTAL_COST);
        Matcher matcher = pattern.matcher(rentalCost);
        return matcher.matches();
    }

    public static boolean checkMaximumTenants(String maximumTenants){
        Pattern pattern = Pattern.compile(REGEX_MAXIMUML_TENANTS);
        Matcher matcher = pattern.matcher(maximumTenants);
        return matcher.matches();
    }

    public static boolean checkNumOfFloor(String numOfFloor){
        Pattern pattern = Pattern.compile(REGEX_NUM_OF_FLOOR);
        Matcher matcher = pattern.matcher(numOfFloor);
        return matcher.matches();
    }
}
