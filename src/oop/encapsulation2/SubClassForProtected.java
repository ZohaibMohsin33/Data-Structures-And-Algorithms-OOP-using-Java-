package oop.encapsulation2;

import oop.encapsulation1.Humans;

public class SubClassForProtected extends Humans {

    public static void main(String[] args) {
        Humans obj = new Humans();
//        System.out.println(obj.name); //unable to do bcz i'm not creating any subclasss instance

        SubClassForProtected obj2 = new SubClassForProtected();
        System.out.println(obj2.name);
    }

}
