
package Lec10_Abstraction.Interface.Example2;


public class Duck implements Flyable, Swimable {
    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }
}
