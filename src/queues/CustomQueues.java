package queues;

import stacks.CustomException;

public class CustomQueues {

    protected int[] data;
    protected static final int DEFAULT_SIZE = 3;
    protected int index = -1;
    CustomQueues(){
        data = new int[DEFAULT_SIZE];
    }

    CustomQueues(int size){
        data = new int[size];
    }

    public boolean insert (int val) throws CustomException {
        if(isFull()){
            throw new CustomException("This can't be added");
        }
        index++;
        data[index] = val;
        return true;
    }

    public int remove() throws CustomException{
        if(isEmpty()){
            throw new CustomException("This can't be popped out");
        }
        for(int i = 0; i<index; i++)
            data[i] = data[i+1];

        return data[index--];
    }

    public void display(){
        for(int i = 0; i <= index; i++){
            System.out.print(data[i] + " -> ");
        }
        System.out.println("");
    }
    public boolean isFull(){
        return index == data.length-1;
    }
    public boolean isEmpty(){
        return index == -1;
    }

}
