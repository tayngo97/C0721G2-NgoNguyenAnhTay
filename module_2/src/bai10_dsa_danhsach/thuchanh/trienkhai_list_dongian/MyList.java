package bai10_dsa_danhsach.thuchanh.trienkhai_list_dongian;

import java.util.Arrays;

public class MyList<dataType> {
    private int size = 0;
    private final static int DEFAULT_CAPALITY = 10;
    public Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPALITY];
    }

    private void  ensureCapa(){
        elements = Arrays.copyOf(elements,elements.length*2);
    }

    public void add(dataType e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public dataType get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (dataType) elements[i];
    }
}
