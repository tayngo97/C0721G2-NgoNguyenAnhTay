package bai3_array_method_in_java.baitap;

import java.util.Scanner;

public class Add_Element_In_Arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrNum ;//khai báo mảng


        System.out.println("Enter the number of length in array ! ");
        int N = scanner.nextInt();
        arrNum = new int[N];// khai báo kích thước của mảng

        for (int i = 0 ; i<arrNum.length;i++){
            System.out.println("Enter element of index " + i);
            arrNum[i] = scanner.nextInt();
        }// Nhập vào từng phần tử của mảng

        System.out.println("Display arrNum : ");
        for (int i = 0 ; i<arrNum.length;i++){
            System.out.print(arrNum[i] + " ");
        }//Hiển thị lại mảng sau khi thêm phần tử

        int[] newArr = new int[arrNum.length + 1];//Khai báo mảng mới với length + 1

        System.out.println("\n" + "Enter the number to add in arrNum !" );
        int X = scanner.nextInt();

        System.out.println("Enter the index need to add !");
        int index = scanner.nextInt();
        if (index == -1 || index >= arrNum.length ){ // Thêm phầm tử vào mảng
            System.out.println("Can not add the element into array !");
        } else {
            for (int i =0 ;  i<newArr.length;i++){
                if (index == i){
                    for (int j = 0;j<newArr.length;j++){
                        if (j==index){
                            newArr[j] = X;
                        }
                    }
                }else if (i<index){
                    newArr[i] = arrNum[i];
                }else newArr[i] = arrNum[i-1];
            }

            System.out.println("New array : ");
            for (int i = 0 ; i<newArr.length;i++){
                System.out.print(newArr[i] + " ");
            }
        }


    }
}
