package oop.encapsulation1;

public class UseGetSet {

    private int a;
    private int b;

    public void getValues(){
        System.out.println("Value of a is : " + a + " Value of b is : " + b);
    }
    public void setValues(int a, int b){
        //I have used private members in the same class
        this.a = a;
        this.b = b;
    }
}
