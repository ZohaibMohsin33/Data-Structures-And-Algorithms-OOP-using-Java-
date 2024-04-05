package queues;

import stacks.CustomException;

public class CircularQueue {

    protected int[] data;
    protected int end = 0;
    protected int start = 0;

    protected int size = 0;
    protected static final int DEFAULT_SIZE = 3;
    CircularQueue(){
        data = new int[DEFAULT_SIZE];
    }

    CircularQueue(int size){
        data = new int[size];
    }

    public boolean insert (int val) throws CustomException {
        if(isFull()){
            throw new CustomException("This can't be added");
        }
        data[end++] = val;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws CustomException{
        if(isEmpty()){
            throw new CustomException("This can't be popped out");
        }
        int removed = data[start++];
        start = start % data.length;
        size--;
        return removed;
    }

    public void display() throws CustomException{
        if(isEmpty()) {
          throw new CustomException("Queue is empty");
        }
        int i = start;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");

    }
    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }

}
