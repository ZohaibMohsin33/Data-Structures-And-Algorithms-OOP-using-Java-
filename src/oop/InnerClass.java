package oop;

public class InnerClass {

    static class Inside{
        String name;
        int age;

        Inside(String name, int age){
            this.name = name;
            this.age  = age;
        }
    }

    public static void main(String[] args) {
        Inside a = new Inside("Hassan", 20);
        System.out.println(a.name);

        Inside b = new Inside("Hasaam", 50);
        System.out.println(b.name);
    }

}
