package bai1_Introduction.Thuchanh.bmi_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Enter your weight!");
        weight = scanner.nextDouble();

        System.out.println("Enter your height!");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.println("Bmi : " + bmi);

        if (bmi < 18) {
            System.out.println("Underweight" + bmi);
        } else if (bmi < 25.0) {
            System.out.println("Normal" + bmi);
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }
}
