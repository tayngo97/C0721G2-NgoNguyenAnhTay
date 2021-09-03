package bai3_array_method_in_java.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArr {
    public static void main(String[] args) {
        int[] numbers = {2,3,4,5,1,2};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to delete !");
        int X = scanner.nextInt();

        int count = 0;

        for (int i = 0 ; i < numbers.length  ;i++){
            if (X == numbers[i]){
                count ++;
            }
        }
//        System.out.println(count);
        int[]  newarr = new int[numbers.length - count];
//        System.out.println(newarr.length);

//             Cách 1 sử dụng duyệt song song mảng
        for (int i = 0, j = 0 ; i < numbers.length || j < newarr.length   ;i++){
            if (X != numbers[i]){
                newarr[j] = numbers[i];
                j++;
            }
        }

//        // Cách 2 :
//        for (int i = 0; i < numbers.length   ;i++){
//            if (X != numbers[i] ){
//                for (int j = 0; j < newarr.length   ;j++){
//                    if (newarr[j] == 0 ) {
//                        newarr[j] = numbers[i];
//                        break;
//                    }
//                }
//            }
//        }
        System.out.println("Display new arr : ");
        System.out.println(Arrays.toString(newarr));

//        for (int  j = 0 ;  j < newarr.length  ;j++){
//            System.out.println(newarr[j]);
//        }

    }
}
