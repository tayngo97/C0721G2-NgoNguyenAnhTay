package bai15_exception_debug.baitap;

import java.util.Scanner;

public class CheckSizeTriangle {
    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException();
        } else if (a + b < c || b + c < a || c + a < b) {
            throw new IllegalTriangleException();
        } else System.out.println(" a=" + a + " b=" + b + " c=" + c + " la 3 canh cua tam giac");
    }

}
