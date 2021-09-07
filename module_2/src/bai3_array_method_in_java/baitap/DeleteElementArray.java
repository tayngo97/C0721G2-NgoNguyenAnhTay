package bai3_array_method_in_java.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        // C1: dung 1 mang
//        int[] a = new int[100];
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input len: "); // 4
//        int len = scanner.nextInt();
//
//        System.out.println("Input element: "); // 9 8 7 6
//        for (int i = 0; i < len; i++) {
//            a[i] = scanner.nextInt();
//        }
//
//        System.out.println("Input pos: "); // 2
//        int pos = scanner.nextInt();
//
//        for (int i = pos; i < len; i++) {
//            a[i] = a[i + 1];
//        }
//        len--;
//
//        System.out.println("Output: ");
//        for (int i = 0; i < len; i++) {
//            System.out.print(a[i] + " ");
//        }

        // C2: array 1 (len) -> array 2 (len - 1)
        Scanner scanner = new Scanner(System.in);
        int[] a = {5, 4, 9, 8, 10};

        System.out.println("Input value: ");
        int value = scanner.nextInt();

        int count = 0;
        // 5, 4, 9, 12, 8
        // a.length = 6, count = 1
        for (int i = 0; i < a.length - count; i++) {
            if (a[i] == value) {
                int pos = i;

                // pos = 3, a.length = 6, count = 0
                for (int j = pos; j < a.length - count - 1; j++) {
                    a[j] = a[j + 1];
                }
                count++;
            }
        }

//        int[] b = new int[a.length - 1];
        int[] b = Arrays.copyOf(a, a.length - count);
        System.out.println(Arrays.toString(b));
    }
}
