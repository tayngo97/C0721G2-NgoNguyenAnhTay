package validator;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckValidTime implements Serializable {
    protected static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    protected static Scanner scanner = new Scanner(System.in);

    public static String checkValidTime(){
        String date = "";

        boolean flag = true;
        while (flag) {
            flag = false;
            try {
                Date time = dateFormat.parse(scanner.nextLine());
                date = dateFormat.format(time);
            } catch (Exception e) {
                flag = true;
                System.err.println("Invalid date ,dd-MM-yyyy");
            }
        } return date;
    }
}
