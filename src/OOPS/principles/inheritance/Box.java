package OOPS.principles.inheritance;

public class Box {
    double l;
    double b;
    double h;
    int type = 10;

    Box() {
        l = 0;
        b = 0;
        h = 0;
    }
    // cube
    Box(double x) {
        l = b = h = x;
    }

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    // copy constructor
    Box(Box ob) {
        l = ob.l;
        b = ob.b;
        h = ob.h;
        this.type = ob.type;
    }

    public void information() {
        System.out.println("Running from Box class");
        System.out.println("Length: " + l + " Breadth: " + b + " Height: " + h);
    }

}
