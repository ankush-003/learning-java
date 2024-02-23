package OOPS.principles.polymorphism;

public class Circle extends Shapes {
    @Override // annotation
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    static void display() {
        System.out.println("Display from Circle");
    }
}
