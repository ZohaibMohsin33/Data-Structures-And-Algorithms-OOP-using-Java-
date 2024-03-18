package oop.encapsulation1;

public class Child extends UseGetSet{

    public static void main(String[] args) {

        UseGetSet obj = new UseGetSet();
        // obj.a;  Since it is a private member

        obj.setValues(2,3);
        obj.getValues();

    }
}
