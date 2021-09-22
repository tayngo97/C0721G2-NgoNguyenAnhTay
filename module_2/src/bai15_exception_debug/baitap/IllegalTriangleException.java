package bai15_exception_debug.baitap;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {

    public static void checkTriangle() throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size a");
        int a = scanner.nextInt();
        System.out.println("Enter size b");
        int b = scanner.nextInt();
        System.out.println("Enter size a");
        int c = scanner.nextInt();

        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException();
        } else if (a + b < c || b + c < a || c + a < b) {
            throw new IllegalTriangleException();
        } else System.out.println(" a=" + a + " b="+ b + " c=" + c + " la 3 canh cua tam giac");
    }

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            flag = false;
            try {
                checkTriangle();
            } catch (IllegalTriangleException e) {
                flag = true ;
                e.printStackTrace();
            }
        }
    }
}
