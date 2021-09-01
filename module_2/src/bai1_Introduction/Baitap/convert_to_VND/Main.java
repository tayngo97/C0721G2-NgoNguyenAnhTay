package bai1_Introduction.Baitap.convert_to_VND;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rate = 23000 ;
        System.out.println("Enter USD amounts");
        int usd = scanner.nextInt();

        int convert_To_VND = rate * usd ;
        System.out.println("Usd to VND is : " + convert_To_VND + " vnd");
    }
}
