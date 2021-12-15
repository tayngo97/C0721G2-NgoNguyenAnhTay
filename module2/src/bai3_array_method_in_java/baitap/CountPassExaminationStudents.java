package bai3_array_method_in_java.baitap;

import java.util.Scanner;

public class CountPassExaminationStudents {
    public static void main(String[] args) {
        int[] score ;
        Scanner scanner = new Scanner(System.in);
        int size = 0 ;

        do {
            System.out.println("Enter size of array score,the size cannot exceed 30 !");
            size = scanner.nextInt();
        }while (size >30);

        score = new int[size];

        for (int i =0 ; i< score.length;i++){
            System.out.println(" Nhap diem cua sinh vien thu " + (i + 1 ));
            score[i] = scanner.nextInt();
        }

        int count = 0;
        System.out.println(" Hien thi bang diem cua sinh vien ! ");
        for (int element : score){
            System.out.print(element + " ");
        }


        for (int element : score){
            if (element>5){
                count++ ;
            }
        }
        System.out.println( "\n" +"So luong sinh vien da thi dau la :" + count);
    }
}
