package OOPS.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine has started.");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine has stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("Power Engine is accelerating.");
    }
}
