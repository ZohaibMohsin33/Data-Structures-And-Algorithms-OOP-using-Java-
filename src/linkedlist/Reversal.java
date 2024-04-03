package linkedlist;

import java.util.LinkedList;

public class Reversal {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        reversing(list);
        System.out.println(list);

    }

    static void reversing(LinkedList<Integer> list){
        if(list.isEmpty()){
            return ;
        }
        Integer toAdd = list.removeFirst();

        reversing(list);
        list.addLast(toAdd);

    }
}
