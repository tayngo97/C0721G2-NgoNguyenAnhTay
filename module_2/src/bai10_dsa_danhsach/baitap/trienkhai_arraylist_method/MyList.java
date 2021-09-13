package bai10_dsa_danhsach.baitap.trienkhai_arraylist_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] element;

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }


    public int getSize() {
        return size;
    }

    public MyList(int capacity) {
        element = new Object[capacity];
    }

    private void ensureCapa() {
        element = Arrays.copyOf(element, element.length +1);
    }

    public void add(int index, E e) {
        if (size == element.length) {
            ensureCapa();
        }
        if (index < 0 || index > this.size)
            throw new IndexOutOfBoundsException(" Exception index " + index);
        for (int i = 0; i < element.length; i++) {
            if (index == i) {
                element[i] = e;
            } else if (index < i) {
                element[i] = element[i];
            } else element[i] = element[i-1];
            size++;
        }
    }

    public void printMyList(){
        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i] + " ");
        }
    }
}
