package OOPS.principles.inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        super();
        weight = 0;
    }

    BoxWeight(double l, double b, double h, double w) {
        super(l, b, h);
        weight = w;
    }
//
//    BoxWeight(double x, double w) {
//        super(x);
//        weight = w;
//    }
//
//    BoxWeight(BoxWeight ob) {
//        super(ob);
//        weight = ob.weight;
//    }

//    public void information() {
//        super.information();
//        System.out.println("Weight: " + weight);
//    }
}
