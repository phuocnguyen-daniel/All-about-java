
package Lec9_InertanceAndPolymarphism.Super.RuntimePoly;


public class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meows meows");
    }
}
