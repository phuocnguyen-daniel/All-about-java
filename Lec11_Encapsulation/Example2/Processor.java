
package Lec11_Encapsulation.Example2;


public class Processor {
     public static void main(String[] args) {
        Product p = new Product();
        p.price = -100;   // ❌ Possible, but NOT logical
        System.out.println(p.price);
    }
}
