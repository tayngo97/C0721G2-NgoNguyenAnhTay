package bai10_dsa_danhsach.thuchanh.trienkhai_linkedlist_dongian;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
//
        ll.add(9,2);
        ll.printList();
//        System.out.println( "\n" +ll.size());

        System.out.println(ll.contains(19) );
        System.out.println(ll.size());
    }
}
