package oop.interfaces;

public class MediaExtended implements Media{

    @Override
    public void start() {
        System.out.println("media of the car started");
    }

    @Override
    public void end() {
        System.out.println("Media of the car stopped");
    }
}
