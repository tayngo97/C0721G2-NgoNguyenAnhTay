package bai3_array_method_in_java.thuchanh;

import java.util.Scanner;

public class findMaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arrayNum;

        System.out.println("Enter the number of Array!");
        size = scanner.nextInt();

        while (size > 10) {
            System.out.println("Array of index can not be exceed 10,please enter again!");
            size = scanner.nextInt();
        }

        arrayNum = new int[size];

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println("Enter the element " + (i + 1) + " of array!");
            arrayNum[i] = scanner.nextInt();
        }

        System.out.println("arrayNum is :");
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + "\t");
        }

        int max = arrayNum[0];
        for (int i = 1; i < arrayNum.length; i++) {
            if (max < arrayNum[i]) {
                max = arrayNum[i];
            }
        }
        System.out.println("\n" + "The max value is :" + max);
    }
}
