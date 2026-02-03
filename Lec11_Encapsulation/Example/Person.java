
package Lec11_Encapsulation.Example;

public class Person {
    public String name;
    private double weight;
    public void setWeight(double weight){
        if(this.weight<0)
            System.out.println("Weigth cannot negative");
        else
            this.weight = weight;
    }
}
