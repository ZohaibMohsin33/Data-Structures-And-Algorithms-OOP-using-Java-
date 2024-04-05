package queues;

import stacks.CustomException;

public class Main {

    public static void main(String[] args) throws CustomException {
//        CustomQueues list = new CustomQueues();
//
//        list.insert(3);
//        list.insert(2);
//        list.insert(5);
//
//        list.display();
//
//        list.remove();
//
//        list.display();

        CircularQueue body = new CircularQueue(3);
        body.insert(3) ;
        body.insert(4);
        body.insert(5);
        body.remove();
        body.insert(6);
        body.display();

    }
}
