
package Lec9_InertanceAndPolymarphism.Super.InstanceVariable;


public class Processor {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();                 
        System.out.println("Source: " + animal.source); 
    }
}
