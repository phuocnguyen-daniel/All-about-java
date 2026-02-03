
package Lec9_InertanceAndPolymarphism.Super.InstanceVariable;


public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Barks barks");
    }
    String source = "DaNang city";
}
