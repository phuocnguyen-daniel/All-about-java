
package Lec11_Encapsulation.Example3;


public class Product {
     private int price;

    public void setPrice(int price) {
        if (price > 1000) {
            this.price = price;
        } else {
            System.out.println("Price must be greater than 1000");
        }
    }

    public int getPrice() {
        return price;
    }
    
}
