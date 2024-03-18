package oop.encapsulation2;

import oop.encapsulation1.UseGetSet;

public class OpenWorldForPrivate {



        public static void main(String[] args) {
            UseGetSet obj = new UseGetSet();
//        int all =  obj.a;  Since it is a private member

            obj.setValues(2,3);
            obj.getValues();


    }
}
