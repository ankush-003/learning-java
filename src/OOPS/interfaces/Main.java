package OOPS.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        car.accelerate();
        car.play();
        car.pause();
        car.apply();
        car.release();

        Engine v12 = new Car();
        v12.start();
        v12.stop();
        v12.accelerate();
        // v12.play(); -> cannot access play() method as methods to run are decided by the reference type

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.stopEngine();
        niceCar.play();
        niceCar.pause();
        niceCar.stopMedia();
        niceCar.updateEngine(new ElectricEngine());
        niceCar.start();
//        niceCar.getEngine().info(); -> cannot access info from object but only Interace
        Engine.info();
    }
}
