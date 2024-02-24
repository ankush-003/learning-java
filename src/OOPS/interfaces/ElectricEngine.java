package OOPS.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine has started.");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine has stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Engine is accelerating.");
    }
}
