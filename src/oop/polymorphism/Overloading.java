package oop.polymorphism;

public class Overloading {

    int len;
    int wid;

    Overloading(int a, int b){
        this.len = a;
        this.wid = b;
    }

    Overloading(int a){
        this.len = a;
        this.wid = a;
    }

    Overloading(){
        this.len = -1;
        this.wid = -1;
    }

    void printValues(){
        System.out.println("The length is like " + this.len + "The width is like" + this.wid);
    }
}
