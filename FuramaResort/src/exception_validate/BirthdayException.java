package exception_validate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class BirthdayException {
    protected static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    protected static SimpleDateFormat getMonth = new SimpleDateFormat("MM");
    protected static SimpleDateFormat getYear = new SimpleDateFormat("yyyy");
    protected static SimpleDateFormat getDate = new SimpleDateFormat("dd");
    protected static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        while (true) {
            Date birthdays = null;
            try {
                System.out.println("Enter you birthday dd-MM-yyyy");
                birthdays = dateFormat.parse(scanner.nextLine());
            } catch (ParseException e) {
                System.err.println("Birthday following the format dd-MM-yyyy");
                continue;
            }

            String year1 = getYear.format(birthdays);
            int year2 = Integer.parseInt(year1);

            String month1 = getMonth.format(birthdays);
            int month2 = Integer.parseInt(month1);

            String date1 = getDate.format(birthdays);
            int date2 = Integer.parseInt(date1);

            LocalDate start = LocalDate.of(year2, month2, date2);
            LocalDate end = LocalDate.now();
            long years = ChronoUnit.YEARS.between(start, end);

            if (years < 18 || years > 100) {
                System.err.println("Enter again your age !");
            } else {
                System.out.println("Your age : " + years);
                break;
            }
        }
    }
}
