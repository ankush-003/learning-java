package OOPS.interfaces;

public class Car implements Engine, Media, Brake {
    @Override
    public void start() {
        System.out.println("Car has started.");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    public void play() {
        System.out.println("Media is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Media is paused.");
    }

    @Override
    public void apply() {
        System.out.println("Brake is applied.");
    }

    @Override
    public void release() {
        System.out.println("Brake is released.");
    }

}
