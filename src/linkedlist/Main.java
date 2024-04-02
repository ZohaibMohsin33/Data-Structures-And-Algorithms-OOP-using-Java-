package linkedlist;

public class Main {

    public static void main(String[] args) {
        CustomList list = new CustomList();
       list.insertFirst(3);
       list.insertFirst(2);
       list.insertFirst(1);
       list.insertFirst(0);
       list.recursionArguments(15,2);
       list.insertFirst(12);
//       list.insertLast(3);
//       list.insertLast(4);
//       list.insertFirst(5);
//       list.insertIndex(10,3);
//       list.insertLast(50);
//       list.insertFirst(15);
//       list.deleteFirst();
//       list.deleteLast();
//       System.out.println("The deleted index is " + list.deleteIndex(4));
       list.display();
//
//        System.out.println(list.size);

//        list.insertIndex(34,50);

        //Operations for the doubly linkedlist


    }
}
