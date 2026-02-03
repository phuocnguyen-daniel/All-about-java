
package Lec10_Abstraction.AbstractClass.NonAbstractMethod;


public class Processor {
    public static void main(String[] args) {
        Square s = new Square(3);
        s.display();                     // gọi non-abstract method
        System.out.println(s.calculateArea());
    }
}
