package bai2_loop_in_java.baitap.draw_menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice ;

        do {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle ");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice!");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Enter the width!");
                int width = input.nextInt();
                System.out.println("Enter the height!");
                int height = input.nextInt();
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j < height; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
            }

            if (choice == 2) {
                for (int i = 1; i <= 10; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            if (choice == 3) {
                for (int i = 1; i <= 10; i++) {
                    for (int j = 10; j > i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        } while (choice != 4);
    }
}
