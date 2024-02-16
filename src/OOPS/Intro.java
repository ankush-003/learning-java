package OOPS;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] rollNumbers = new int[5];
        // store 5 names
        String[] names = new String[5];

        // data type, name, value
        Student ankush; // reference declaration
        ankush = new Student(); // object creation in heap memory
        System.out.println(ankush.rollNumber);

        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));

        // object creation using constructor
        Student rahul = new Student(2, "Rahul", 80.0f);
        System.out.println(rahul.rollNumber);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);

        // object creation using copy constructor
        Student rahulCopy = new Student(rahul);
        System.out.println(rahulCopy.rollNumber);
        System.out.println(rahulCopy.name);

        Student one = new Student(91, "Ankush", 90.0f);
        Student two = one;
        System.out.println(one.rollNumber);
        System.out.println(two.rollNumber);
        two.rollNumber = 92;
        System.out.println(one.rollNumber);
    }
}

class Student {
    int rollNumber;
    String name;
    float marks;
    // constructor
    Student() {
//        this.rollNumber = 1;
//        this.name = "Ankush";
//        this.marks = 90.0f;
        // calling parameterized constructor
        this(1, "Ankush", 90.0f);
    }
    Student(int rollNumber, String name, float marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }
    Student(Student student) {
        this.rollNumber = student.rollNumber;
        this.name = student.name;
        this.marks = student.marks;
    }


}