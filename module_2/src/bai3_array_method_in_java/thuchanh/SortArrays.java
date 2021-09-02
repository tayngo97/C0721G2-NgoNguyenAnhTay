package bai3_array_method_in_java.thuchanh;

import java.util.Scanner;

public class SortArrays {
    public static void main(String[] args) {
        int size ;
        int[] array ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size of array , size does not exceed 20 !");
            size = scanner.nextInt();
        }while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter element " + (i + 1) );
            array[i] = scanner.nextInt();
            i++ ;
        }

        System.out.println("Element in array : ");
        for (int j =0 ;j<array.length;j++ ){
            System.out.print(array[j] + "\t");
        }
        System.out.println("\n");

        for (int j =0 ;j<array.length/2;j++){
            int temp = array[j];
            array[j] = array[size - j -1];
            array[size - j -1] = temp ;
        }

        System.out.print("Reverse array is :" + "\n");
        for (int j =0 ;j<array.length;j++ ){
            System.out.print(array[j] + "\t");
        }

    }
}
