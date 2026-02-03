package Lec9_InertanceAndPolymarphism.Super.MethodOveride;

public class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meows meows");
    }
}
