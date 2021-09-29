package services.exception_validate;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckValidTime implements Serializable {
    protected static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    protected static Scanner scanner = new Scanner(System.in);

    public static Date checkValidTime(){
        String date ;
        Date date1 = null;
        boolean flag = true;
        while (flag) {
            flag = false;
            try {
                Date time1 = dateFormat.parse(scanner.nextLine());
                date = dateFormat.format(time1);
                date1 = dateFormat.parse(date);
            } catch (Exception e) {
                flag = true;
                System.err.println("Invalid date ,dd-MM-yyyy");
            }
        } return date1;
    }
}
