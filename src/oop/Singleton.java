package oop;

public class Singleton {

    private String name;
    private Singleton(String name){
        this.name = name;
        System.out.println(name);
    }
    private static Singleton instance;

    public static Singleton getts(String name){
        if(instance == null){
            instance = new Singleton(name);
        }

        return instance;
    }
}

class Accessor{
    public static void main(String[] args) {
        Singleton a = Singleton.getts("Zohaib");
        Singleton b = Singleton.getts("Nimra");


    }
}
