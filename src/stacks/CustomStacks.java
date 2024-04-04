package stacks;

public class CustomStacks {

    protected int[] data;
    protected static final int DEFAULT_SIZE = 3;
    protected int index = -1;
    CustomStacks(){
        data = new int[DEFAULT_SIZE];
    }

    CustomStacks(int size){
        data = new int[size];
    }

    public boolean push (int val) throws CustomException{
        if(isFull()){
            throw new CustomException("This can't be added");
        }
        index++;
        data[index] = val;
        return true;
    }

    public int pop() throws CustomException{
        if(isEmpty()){
            throw new CustomException("This can't be popped out");
        }
        return data[index--];
    }

    public boolean isFull(){
        return index == data.length-1;
    }
    public boolean isEmpty(){
        return index == -1;
    }
}
