package heaps;

import java.util.ArrayList;

public class Heap {

    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.addElem(5);
        heap.addElem(7);
        heap.addElem(3);
        heap.addElem(11);
        heap.addElem(2);

        heap.display();


    }

    ArrayList<Integer> arr;
    int index = 0;
    Heap(){
        arr = new ArrayList<Integer>();
    }

    public int addElem(int element){
        arr.add(element);
        index++;

        int copy = index;
        if(!arr.isEmpty() && arr.get(index-1)<arr.get(0)){
            while(copy-1>0){
                swap(copy-1,copy/2-1,arr);
                copy=copy/2;
            }
        }


        return index;
    }

    public void swap(int index,int index2,ArrayList<Integer> arr){
        int temp = arr.get(index);
        arr.set(index,arr.get(index2));
        arr.set(index2,temp);
    }

    public void display(){
        for(int i = 0; i<arr.size();i++){
            System.out.print(arr.get(i));
        }
    }

    public int removeElem(){
        int send = arr.get(0);
        arr.set(0,arr.size()-1);
        arr.remove(arr.size()-1);


        return send;
    }
}
