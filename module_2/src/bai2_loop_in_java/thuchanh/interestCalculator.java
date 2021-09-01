package bai2_loop_in_java.thuchanh;

import java.util.Scanner;

public class interestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money  ;
        int month  ;
        double interestRate  ;

        System.out.println("Enter investment amounts!");
        money = input.nextDouble();

        System.out.println("Enter month !");
        month = input.nextInt();

        System.out.println("Enter interestRate");
        interestRate = input.nextDouble();

        double totalInterest = 0 ;

        for (int i=0;i<month;i++){
            totalInterest += money * (interestRate/100)/12 * month ;
        }

        System.out.println("Total of interest: " + totalInterest);

    }
}
