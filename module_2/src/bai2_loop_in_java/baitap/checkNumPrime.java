package bai2_loop_in_java.baitap;

import java.util.Scanner;

public class checkNumPrime {
    public static void main(String[] args) {
        int n = 2 ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of quality to check !");
        int q = sc.nextInt();
        while (n < q){
            if (isPrime(n)){
                System.out.print(n + " ");
            }
            n++;
        }
    }
    public static boolean isPrime(int num){
        for (int i =2 ; i< num;i++){
            if (num%i==0){
                return false ;
            }
        }
        return true;
    }
}