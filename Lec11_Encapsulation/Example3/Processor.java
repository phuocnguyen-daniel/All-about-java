
package Lec11_Encapsulation.Example3;


public class Processor {
    public static void main(String[] args) {
        Product p = new Product();
        p.setPrice(500);     
        p.setPrice(2000);    
        System.out.println(p.getPrice());
    }
}
