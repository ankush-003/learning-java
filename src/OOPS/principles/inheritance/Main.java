package OOPS.principles.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 30);
        Box box2 = new Box(10);
        Box box3 = new Box(box1);
        box1.information();
        box2.information();
        box3.information();

        BoxWeight boxWeight1 = new BoxWeight();
        boxWeight1.information(); // parent class method

        Box box5 = new BoxWeight(10, 20, 30, 40);
        // System.out.println(box5.weight); -> error because weight is not a member of Box class
        // BoxWeight box6 = new Box(); -> error because Box is not a subclass of BoxWeight, properties of subclass not available in superclass
        box5.information();

    }
}
