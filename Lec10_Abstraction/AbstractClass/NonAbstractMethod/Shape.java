
package Lec10_Abstraction.AbstractClass.NonAbstractMethod;

public abstract class Shape {
     public abstract double calculateArea();

    // non-abstract method
    public void display() {
        System.out.println("This is a shape");
    }
}
