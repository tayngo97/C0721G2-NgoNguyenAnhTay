package utils;

import java.util.Scanner;

public class GetChoiceInMenu {
    private static Scanner scanner = new Scanner(System.in);

    public static int getChoice(){
        boolean flag = true;
        int choice = 0;
        while (flag) {
            flag = false;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Invalid input,you have to enter a number");
                flag = true;
            }
        }
        return choice ;
    }
}
