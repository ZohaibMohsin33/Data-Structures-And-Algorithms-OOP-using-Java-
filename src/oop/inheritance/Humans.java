package oop.inheritance;

public class Humans {

    String name;
    int age;

    Humans(){
        this.name = "Default";
        this.age  = 0;
    }
    Humans(String name, int age){
        this.name = name;
        this.age  = age;
    }

    Humans(Humans instance){
        this.name = instance.name;
        this.age  = instance.age;

    }
}

 class Gender extends Humans{

    boolean isMale;
    Gender(){
        this.isMale = false;
    }

    Gender(boolean isMale,String name, int age){
        super(name,age);
        this.isMale = isMale;

    }

    Gender(Gender box){
        super(box);
        this.isMale = box.isMale;
    }

}
