package oop.interfaces;

public interface WorkingDefault {

    default void working(){
        System.out.println("Hey there i'm working");
    }
}
interface AnotherWorking{
    default void working(){
        System.out.println("Hey there i'm another working");
    }
}

 class check implements WorkingDefault,AnotherWorking{
    @Override
    public void working(){
        
    }
}
