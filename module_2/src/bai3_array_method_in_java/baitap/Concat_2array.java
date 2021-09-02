package bai3_array_method_in_java.baitap;

import java.util.Scanner;

public class Concat_2array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            int[] arrNum = new int[3];
            int[] arrNum1 = new int[4];

            for (int i =0;i<arrNum.length;i++){
                System.out.println("Enter the element " + i);
                arrNum[i] = scanner.nextInt();
            }

            for (int i =0;i<arrNum1.length;i++){
            System.out.println("Enter the element in Arr2 " + i);
            arrNum1[i] = scanner.nextInt();
            }

            System.out.println("Display arrNum :");
            for (int element : arrNum){
                System.out.print(element);
            }

            System.out.println("\n"+"Display arrNum1");
            for (int element : arrNum1){
            System.out.print(element);
            }

            int lengthArr2 = arrNum.length + arrNum1.length;
            int[] arrNum2 = new int[lengthArr2];

            int count = 0;
            for (int element : arrNum){
                arrNum2[count] = element ;
                count ++ ;
            }

            for (int element : arrNum1){
                arrNum2[count] = element ;
                count ++ ;
            }

            System.out.println( "\n" + "New array : ");
            for (int element : arrNum2){
                System.out.print(element + " ");
            }
    }
}
