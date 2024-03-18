package oop.inheritance;

public class Main {

    public static void main(String[] args) {
        Gender man = new Gender(true,"Zohaib",22);
        System.out.println(man.isMale + " " + man.age + " " + man.name);

        Humans sapiens = new Gender(true,"Mohsin",54);
        System.out.println(sapiens.name + " " + sapiens.age);

//        Gender chromosome = new Humans(); // It will definately give an error.

        Gender newMan = new Gender(man);
        System.out.println(man.isMale + " " + man.age + " " + man.name);
    }
}
