package bai10_dsa_danhsach.baitap.trienkhai_arraylist_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class MyListTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        MyList<String> list = new MyList<>();

        list.add(0,"Hello");
        list.add(1,"Good");
        list.add(2,"Sorry");
        list.add(2,"Hi");
        list.printMyList();


    }
}
