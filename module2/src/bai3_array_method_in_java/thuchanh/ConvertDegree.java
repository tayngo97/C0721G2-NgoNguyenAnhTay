package bai3_array_method_in_java.thuchanh;

import java.util.Scanner;

public class ConvertDegree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice ;
        double F ;
        double C ;

        do {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0.Exit");
            System.out.print("Press your choice : ");
            choice = scanner.nextInt();
            if (choice == 1){
                System.out.println("Enter F!");
                F = scanner.nextDouble();
                System.out.println("F to C :" + FtoC(F));
            }   else if (choice==2){
                System.out.println("Enter C !");
                C = scanner.nextDouble();
                System.out.println("C to F : " + CtoF(C));
            }
        }while (choice != 0);
    }

    public static double CtoF(double C){
        double F = (9.0 / 5) * C + 32;
        return F;
    }
    public static double FtoC(double F){
        double C = (5.0 / 9) * (F - 32);
        return C;
    }
}
