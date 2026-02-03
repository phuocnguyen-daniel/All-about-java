package lec8_ObjectandClasses.MethodOverloading.Order;
//Overloading theo Order(thu tu tham so)
public class OverLoadingExample3 {

    public static void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void printInfo(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }

}
