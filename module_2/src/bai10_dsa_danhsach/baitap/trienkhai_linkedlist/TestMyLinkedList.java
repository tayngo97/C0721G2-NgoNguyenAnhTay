package bai10_dsa_danhsach.baitap.trienkhai_linkedlist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedListInteger = new MyLinkedList<>();
        linkedListInteger.addFirst(1);
        linkedListInteger.addLast(2);
        linkedListInteger.addLast(3);
        linkedListInteger.addLast(4);
        linkedListInteger.addLast(5);
        System.out.println(linkedListInteger.get(2));
        System.out.println(linkedListInteger.contains(3));
        linkedListInteger.remove(2);
    }
}
