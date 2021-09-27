package views;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateFacility {
    private static final  String REGEX_VILLA_ID = "^[S][V][V][L][-][0-9]{4}$";
    private static final  String REGEX_HOUSE_ID = "^[S][V][H][O][-][0-9]{4}$";
    private static final  String REGEX_ROOM_ID = "^[S][V][R][O][-][0-9]{4}$";
    private static final  String REGEX_SERVICE_NAME = "^[A-Z][a-z0-9]+$";



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



    public static void main(String[] args) {
        String str = "SVVL-1230";
    }
}
