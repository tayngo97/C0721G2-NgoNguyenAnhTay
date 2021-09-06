package bai3_array_method_in_java.baitap;

import java.util.Scanner;

public class FindSameChar {
    public static void main(String[] args) {
        String str = "abcdabcd" ;
        Scanner scanner = new Scanner(System.in);
//            char input = 'c';
            String input = scanner.nextLine();
        int count = 0 ;
        for (int i = 0 ; i<str.length();i++){
            if (str.charAt(i) == input.charAt(0) ){
                count++;
            }
        }
        System.out.println(" So lan xuat hien cua " + input + " trong  " + str + " la :" + count);
    }
}
