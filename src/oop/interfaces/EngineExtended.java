package oop.interfaces;

public class EngineExtended implements Engine {

    @Override
    public void start() {
        System.out.println("Engine Started");
    }

    @Override
    public void end() {
        System.out.println("Engine Stoped");
    }

    @Override
    public void acc() {
        System.out.println("Engine Accelerated");
    }
}
