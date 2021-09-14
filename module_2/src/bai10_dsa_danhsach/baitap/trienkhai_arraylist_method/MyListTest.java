package bai10_dsa_danhsach.baitap.trienkhai_arraylist_method;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println(listInteger);
        listInteger.add(4,5);

    }
}
