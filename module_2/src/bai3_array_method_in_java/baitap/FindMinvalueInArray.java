package bai3_array_method_in_java.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinvalueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array"); // Người dùng nhập row và col của mảng
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Người dùng nhập element
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at index : " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Display arr : ");
        System.out.println(Arrays.toString(arr));

        // Tìm min value
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("The min value is : " + min + " at index " + index);

    }
}

