package OOPS.interfaces;

public class NiceCar {
    private Engine engine;
    private Media media;
    public NiceCar() {
        this.engine = new PowerEngine();
        this.media = new CDPlayer();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop(); // in car class stop was using engine.stop()
    }

    public void stopMedia() {
        media.stop();
    }

    public void play() {
        media.play();
    }

    public void pause() {
        media.pause();
    }

    public void updateEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

}
