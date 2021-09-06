package bai3_array_method_in_java.baitap;

import java.util.Scanner;

public class Sum_Duongcheo_Mang2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row of array"); // Người dùng nhập row và col của mảng
        int rowArr = scanner.nextInt();
        System.out.println("Enter col of array");
        int colArr = scanner.nextInt();
        int[][] arr = new int[rowArr][colArr];

        while (rowArr != colArr){
            System.out.println("Enter row !");
             rowArr = scanner.nextInt();
            System.out.println("Enter col = row !");
             colArr = scanner.nextInt();
        }

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

        // tinh tong 2 duong cheo chinh va phu
        int sum = 0 ;
        int sum1 = 0;
        for (int i =0;i<arr.length;i++){
            for (int k = 0 ; k < arr.length;k++){
                if (i == k){
                    sum += arr[i][k];
                }
                if (i + k == arr.length-1 ){ // Đường chéo phụ
                    sum1 += arr[i][k];
                }
            }
        }

        System.out.println("Tong duong cheo chinh : " + sum);
        System.out.println("Tong duong cheo phu : " + sum1);
    }
}
