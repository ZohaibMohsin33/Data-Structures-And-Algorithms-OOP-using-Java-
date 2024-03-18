package oop.polymorphism;

public class Main {

    public static void main(String[] args) {

        //Working with the Method Overriding stuff.....
        Shapes shape = new Shapes();
        shape.area();

        Triangle anotherShape = new Triangle();
        anotherShape.area();

        Circle onceMore  = new Circle();
        onceMore.area();

        Shapes hybrid = new Circle();
        hybrid.area();

        //Working with the Method Overloading stuff.....

        Overloading one = new Overloading();
        one.printValues();

        Overloading two = new Overloading(7);
        two.printValues();

        Overloading three = new Overloading(3,7);
        three.printValues();

    }
}
