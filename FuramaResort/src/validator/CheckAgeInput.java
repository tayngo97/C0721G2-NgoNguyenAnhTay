package validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class CheckAgeInput {
    protected static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    protected static SimpleDateFormat getMonth = new SimpleDateFormat("MM");
    protected static SimpleDateFormat getYear = new SimpleDateFormat("yyyy");
    protected static SimpleDateFormat getDate = new SimpleDateFormat("dd");
    protected static Scanner scanner = new Scanner(System.in);


    public static String checkAgeInput(){
        String age ;
        while (true) {
            Date birthdays ;
            try {
                System.out.println("Enter you birthday dd-MM-yyyy");
                birthdays = dateFormat.parse(scanner.nextLine());
            } catch (ParseException e) {
                System.err.println("Birthday following the format dd-MM-yyyy");
                continue;
            }

            age = dateFormat.format(birthdays);

            String year1 = getYear.format(birthdays);
            int year2 = Integer.parseInt(year1);

            String month1 = getMonth.format(birthdays);
            int month2 = Integer.parseInt(month1);

            String date1 = getDate.format(birthdays);
            int date2 = Integer.parseInt(date1);

            LocalDate start = LocalDate.of(year2, month2, date2);
            LocalDate end = LocalDate.now();
            int years = (int) ChronoUnit.YEARS.between(start, end);

            if (years < 18 || years > 100) {
                System.err.println("The age can not be under 18 and exceed 100 ");
            } else {
                break;
            }
        }
        return age;
    }
}