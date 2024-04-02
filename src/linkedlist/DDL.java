package linkedlist;

public class DDL {

    public static void main(String[] args) {
        CustomDoublyLinkedList list = new CustomDoublyLinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertFirst(0);
        list.display();
        list.insertAfter(10,1);
        list.display();
        list.insertAfter(20,2);
        list.display();
    }
}
