package OOPS.interfaces;

public class CDPlayer implements Media {
    @Override
    public void play() {
        System.out.println("CD is playing.");
    }

    @Override
    public void pause() {
        System.out.println("CD is paused.");
    }

    @Override
    public void stop() {
        System.out.println("CD has stopped.");
    }
}
