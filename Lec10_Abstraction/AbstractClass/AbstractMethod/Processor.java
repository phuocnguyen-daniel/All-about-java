package Lec10_Abstraction.AbstractClass.AbstractMethod;

public class Processor {

    public static void main(String[] args) {
        Square square = new Square(2);
        System.out.println("Area of the square: " + square.calculateArea());
    }
}
//Là method không có body

//Chỉ được khai báo trong abstract class

//Class con bắt buộc override
