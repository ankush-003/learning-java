package OOPS.interfaces;

public interface ModerEngine extends Engine{
    void stopEngine();
    void updateEngine(Engine engine);

    default void info() { // default methods can cause ambiguity if overridden in the implementing class by the same name
        System.out.println("This is a modern engine.");
    }
}
