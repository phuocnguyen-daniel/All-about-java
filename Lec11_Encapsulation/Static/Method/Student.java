
package Lec11_Encapsulation.Static.Method;


public class Student {
      int rollno;
    String name;
    static String college = "DTU";

    // static method
    static void change() {
        college = "BBDIT";
    }

    // constructor
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]) {
        Student.change();   // call static method

        Student s1 = new Student(111, "Trang");
        Student s2 = new Student(222, "Duong");

        s1.display();
        s2.display();
    }
}
