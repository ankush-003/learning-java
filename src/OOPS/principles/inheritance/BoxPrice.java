package OOPS.principles.inheritance;

public class BoxPrice extends BoxWeight{
    double price;
    int type = 30;

    BoxPrice() {
        super();
        price = 0;
    }

    BoxPrice(double l, double b, double h, double w, double p) {
        super(l, b, h, w);
        price = p;
    }

    BoxPrice(BoxPrice ob) {
        super(ob);
        price = ob.price;
    }

    public void information() {
        super.information();
        System.out.println("Price: " + price);
    }
}
