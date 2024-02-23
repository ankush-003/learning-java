package OOPS.principles.polymorphism;

public class Shapes {
  public void draw() {
    System.out.println("Drawing a Shape");
  }
  static void display() {
    System.out.println("Display from Shapes");
  }

  static void display2(int a) {
    System.out.println("Display from Shapes");
  }
// early binding
//  final void draw() {
//    System.out.println("Drawing a Shape with a");
//  }
}
