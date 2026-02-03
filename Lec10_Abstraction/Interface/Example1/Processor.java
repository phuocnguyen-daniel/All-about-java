package Lec10_Abstraction.Interface.Example1;

public class Processor {

    public static void main(String[] args) {
        Animal a = new Dog();   // interface reference
        a.makeSound();
    }
}
