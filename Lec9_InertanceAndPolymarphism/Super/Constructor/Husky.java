package Lec9_InertanceAndPolymarphism.Super.Constructor;

public class Husky extends Dog {

    Husky() {
        super(); // goc ham khoi tao cua lop cha(dog)
        System.out.println("Husky's constructor is invoked");
    }
}
