package OOPS.principles.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes s1 = new Shapes();
        Shapes s2 = new Circle();
        Shapes s3 = new Square();
        s1.draw();
        s2.draw();
        s3.draw();

        // compile time polymorphism
        Numbers n = new Numbers();
        n.add(10, 20);
        n.add(10, 20, 30);
        n.add(10.5, 20.5);

        // static with early binding
        s3.display(); // calls Shapes.display() as static methods are independent of objects
        Circle.display(); // calls Circle.display() as static methods are independent of objects
        Circle.display2(10); // calls Shapes.display2() as static methods are independent of objects, they can be inherited but not overridden
    }
}

class Sample {
    int a = 10;
    public void display() {
        System.out.println("Display from Sample");
    }

    @Override
    public String toString() {
        return "Sample class";
    }
}
