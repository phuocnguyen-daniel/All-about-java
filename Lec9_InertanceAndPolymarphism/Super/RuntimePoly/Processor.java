package Lec9_InertanceAndPolymarphism.Super.RuntimePoly;

public class Processor {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}
