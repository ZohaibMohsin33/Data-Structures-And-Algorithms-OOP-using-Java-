package oop.encapsulation1;

public class Main {

    public static void main(String[] args) {

        //i'm going to use private and public members in the same pakage

        UseGetSet obj = new UseGetSet();
       // obj.a;  Since it is a private member

        obj.setValues(2,3);
        obj.getValues();

        //i'm going to use protected and default for further proceedings

        Humans obj2 = new Humans();
        System.out.println(obj2.name + " " + obj2.age);
    }
}
