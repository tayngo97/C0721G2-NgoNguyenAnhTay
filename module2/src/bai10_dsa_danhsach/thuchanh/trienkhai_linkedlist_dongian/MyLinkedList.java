package bai10_dsa_danhsach.thuchanh.trienkhai_linkedlist_dongian;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int numNodes = 0;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    //class Node
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public int size() {
        return numNodes  ;
    }


    public void add(Object data,int index) { //index = 2 ; data = 9
        Node temp = head;
        Node holder;

        for (int i = 0; i < index -1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public boolean contains(Object element) {
        Node temp = head;
        boolean flag = false;
        while (temp != null) {
            if (temp.data.equals(element)) {
                flag = true ;
                break;
            } temp = temp.next;
        }
        return flag ;
    }
}
