package bai3_array_method_in_java.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_In_Colum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row of array"); // Người dùng nhập row và col của mảng
        int rowArr = scanner.nextInt();
        System.out.println("Enter col of array");
        int colArr = scanner.nextInt();
        int[][] arr = new int[rowArr][colArr];

        // Người dùng nhập element
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.println("Enter the element at row " + row + " columm " +column );
                arr[row][column] = scanner.nextInt();
            }
        }

        System.out.println("Display arr : ");
        System.out.println(Arrays.deepToString(arr)) ;

//        System.out.println("Display arr : ");
//        for (int row = 0; row < arr.length; row++) {
//            for (int column = 0; column < arr[row].length; column++){
//                System.out.print(arr[row][column] + "\t");
//            }
//            System.out.println();
//        }

        int sumColum = 0 ;
        System.out.println("Enter the collum to Sum !");
        int inputCol = scanner.nextInt();
        int col = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (column == inputCol){
                    sumColum += arr[row][column];
                    col = column ;
                }
            }
        }


        System.out.println("Tong cac phan tu o cot " + col + " la : " + sumColum);
    }
}
