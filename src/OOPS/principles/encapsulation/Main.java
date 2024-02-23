package OOPS.principles.encapsulation;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.setLength(10);
        box.setBreadth(20);
        box.setHeight(30);
        System.out.println("Volume of the box: " + box.getVolume());
    }
}

class Box {
    private int length; // data hiding
    private int breadth;
    private int height;

    public void setLength(int length) { // encapsulation (sub process of data hiding)
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume() {
        return length * breadth * height;
    }
}
