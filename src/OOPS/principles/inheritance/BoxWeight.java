package OOPS.principles.inheritance;

public class BoxWeight extends Box {
    double weight;
    int type = 20;

    BoxWeight() {
        super();
        weight = 0;
    }

    BoxWeight(double l, double b, double h, double w) {
        // calls default constructor of Box if not called explicitly
        // super has to be the first statement in the constructor
        super(l, b, h);
        weight = w;
        System.out.println("Type: " + type);
        System.out.println("Type (of parent) : " + super.type);
    }

    BoxWeight(BoxWeight ob) {
        // super can take an object of type BoxWe
        super(ob);
        weight = ob.weight;
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
