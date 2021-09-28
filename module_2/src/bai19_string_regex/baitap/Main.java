package bai19_string_regex.baitap;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(1996, 2, 29);
        LocalDate end = LocalDate.now(); // use for age-calculation: LocalDate.now()
        long years = ChronoUnit.YEARS.between(start, end);
        System.out.println(years); //
    }
}
