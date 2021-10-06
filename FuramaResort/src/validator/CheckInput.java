package validator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInput {
    private static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_CHECK_NAME = "^[A-Z][a-z0-9]+$";
    public static final String REGEX_VILLA_ID = "^SVVL-[0-9]{4}$";
    public static final String REGEX_HOUSE_ID = "^SVHO-[0-9]{4}$";
    public static final String REGEX_ROOM_ID = "^SVRO-[0-9]{4}$";
    public static final String REGEX_RENTAL_COST = "^([\\d]{1,3}\\.[\\d]{0,3})+$|^[\\d]+$";
    public static final String REGEX_MAXIMUML_TENANTS = "^[1-9]|[1][0-9]$";
    public static final String REGEX_NUM_OF_FLOOR = "^[1-9]\\d*$";
    public static final String REGEX_AREA = "^[3-9]+\\d+\\.?\\d{0,3}\\.?\\d{0,3}$";


    public static String getInput(String regex) {
        String input = "";
        boolean flag = true;
        while (flag) {
            getMessage(regex);
            input = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                System.out.println("------------------");
                flag = false;
            } else {
                System.err.println("Invalid input , please try again !");
            }
        }
        return input;
    }

    public static void getMessage(String regex) {
        switch (regex) {
            case REGEX_CHECK_NAME:
                System.out.print("You must capitalize the first character \n=>");
                break;
            case REGEX_VILLA_ID:
                System.out.print("Enter villa Id : \nEx : SVVL-0001,SVVL-0123,...\n=>");
                break;
            case REGEX_HOUSE_ID:
                System.out.print("Enter house Id : \nEx : SVHO-0001,SVHO-0123,...\n=>");
                break;
            case REGEX_ROOM_ID:
                System.out.print("Enter room Id : \nEx : SVRO-0001,SVRO-0123,...\n=>");
                break;
            case REGEX_RENTAL_COST:
                System.out.print("Enter rental cost Id :  \nEx : 10000,10.000,...\n=>");
                break;
            case REGEX_MAXIMUML_TENANTS:
                System.out.print("Enter number of tenants : \nEx : 1,18,19...\n=>");
                break;
            case REGEX_NUM_OF_FLOOR:
                System.out.print("Enter number of floor : \nEx : 1,2,3,4,9...\n=>");
                break;
            case REGEX_AREA:
                System.out.print("Ex : 30,35,40,...\n=>");
                break;
        }
    }
}
