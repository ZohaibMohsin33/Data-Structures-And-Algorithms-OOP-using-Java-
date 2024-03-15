package oop;

public class StaticOne {

    public static void main(String[] args) {

        Human zohaib = new Human("Zohaib",66,true);
        System.out.println(zohaib.population);

        Human shoaib = new Human("Shoaib",6,false);
        System.out.println(shoaib.population);


    }
}

class Human{

    String name;
    int age;
    boolean isMarried;

    static long population;

    static{
        population = 0;
    }

    Human(String name, int age, boolean isMarried){
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;

        population += 1;

    }

    void message(){
        System.out.println("Saying hello to u");
    }

    static void reply(){
        System.out.println("Giving u the reply");
        Human a = new Human("Zohaib",66,true);
        a.message();
    }
}
