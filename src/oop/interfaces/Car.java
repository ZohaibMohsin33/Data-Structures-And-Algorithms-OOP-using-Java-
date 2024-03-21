package oop.interfaces;

public class Car {

    private MediaExtended media = new MediaExtended();
    private BrakeExtended breaks = new BrakeExtended();
    private EngineExtended engine = new EngineExtended();

    public void startMedia(){
        media.start();
    }
    public void endMedia(){
        media.end();
    }

    public void startEngine(){
        engine.start();
    }
    public void endEngine(){
        engine.end();
    }
    public void accEngine(){
        engine.acc();
    }
    public void appBreak(){
        breaks.apply();
    }
}
