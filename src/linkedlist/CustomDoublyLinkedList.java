package linkedlist;

public class CustomDoublyLinkedList {

    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.previous = null;
        if(head != null){
            head.previous = node;
        }
        head = node;

    }
    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        Node node = new Node(val);


            temp.next = node;
            node.previous = temp;
            node.next = null;

    }

    public void insertAfter(int val,int after){
        Node node = new Node(val);
        Node temp = head;
        boolean found = false;
        while(temp != null){
            if(temp.value == after){
                found = true;
                break;
            }
                temp = temp.next;
        }
        if(found){
            node.next = temp.next;
            temp.next = node;
            node.previous = temp;
            if(temp.next != null){
                temp.next.previous = node;
            }
            return;
        }
        System.out.println("Value not found");
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("FINISH");
    }
    class Node{
        int value;
        Node next;
        Node previous;

        Node(int value){
            this.value = value;
        }
        Node(int value, Node next, Node previous){
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
