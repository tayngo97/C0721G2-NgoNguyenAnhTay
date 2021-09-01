package bai2_loop_in_java.thuchanh.interest_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = 1.0 ;
        int month = 1 ;
        double interestRate = 1.0 ;

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
