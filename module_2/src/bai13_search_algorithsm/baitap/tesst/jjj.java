package bai13_search_algorithsm.baitap.tesst;

import java.util.Random;

public class jjj {
    public static void main(String[] args) {
        Random random = new Random() ;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
            System.out.print(arr[i] + " ");
        }


    }
}
