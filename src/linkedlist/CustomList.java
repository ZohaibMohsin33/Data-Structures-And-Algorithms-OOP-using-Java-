package linkedlist;

public class CustomList {

    CustomList(){
        this.size = 0;
    }
    private Node head;
    private Node tail;
     int size;
    private class Node{
        private int value;
        private Node next;

        Node(int val){
            this.value = val;

        }

        Node(int val,Node next){
            this.value = val;
            this.next = next;
        }

    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null)
            tail = head;
        size++;

    }
    public void insertLast(int val){

        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertIndex(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        if(index<0 || index>size){
            System.out.println("Index Out Of Bound");
            return;
        }
        Node temp = head;
        for(int i =0; i<index-1;i++){
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);

        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        Node temp = head;
        head = temp.next;
        if(head == null)
            tail = null;
        size--;

        return val;
    }
    public int deleteLast(){
        if(size<=1)
            return deleteFirst();
        int val = tail.value;
        Node temp = head;
        for(int i =1; i<size-1; i++){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteIndex(int index){
        if(index == 0)
            return deleteFirst();

        if(index == size-1)
            return deleteLast();

        if(index<0 || index>size-1){
            System.out.println("Index not found");
            return -1;
        }

        Node temp = head;
        for(int i = 1;i<index;i++ ){
            temp = temp.next;
        }
       int val = temp.next.value;

        temp.next = temp.next.next;
        size--;
        return val;
    }

    public Node getWithValue(int val){
        Node temp = head;
        while(temp != null){
            if (temp.value == val)
                return temp;
            temp = temp.next;
        }
        return null;
    }
    public Node getWithIndex(int index){
        Node temp = head;
        for(int i =0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }

    }
}
