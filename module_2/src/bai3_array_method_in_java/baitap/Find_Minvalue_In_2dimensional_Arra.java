package bai3_array_method_in_java.baitap;

import java.util.Scanner;

public class Find_Minvalue_In_2dimensional_Arra {
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
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++){
                System.out.print(arr[row][column] + "\t");
            }
            System.out.println();
        }

        // Tìm min value
        int min = arr[0][0] ;
        int row = 0 ;
        int col = 0 ;
        for (int i =0 ;i<arr.length;i++){
            for (int j = 0 ; j < arr[i].length;j++){
                if (min > arr[i][j]){
                    min = arr[i][j];
                    row = i ;
                    col = j ;
                }
            }
        }
        System.out.println("The min value is : " +  min + " at row " + row + " col " + col);
    }
}
