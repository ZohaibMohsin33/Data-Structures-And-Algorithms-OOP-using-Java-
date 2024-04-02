package linkedlist;

public class CircularList {

    Node head;
    Node tail;

    void insert(int val){
        Node node = new Node(val);
        if (tail == null || head == null){
            tail = node;
            head = node;
            return ;
        }


        tail.next = node;
        node.next = head;
        tail = node;

    }

    void delete(int val){
        Node node = head;

        if(node == null)
            return;

        if(node.value == val){
            head = node.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.value == val){
                node.next = n.next;
                return;
            }
            node = node.next;
        }
        while(node != head);
    }

    void display(){
        Node temp = head;
        if(temp != null){
            do{
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            while(temp != head);
        }
    }
    CircularList(){
        this.head = null;
        this.tail = null;
    }
    private class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }
}
