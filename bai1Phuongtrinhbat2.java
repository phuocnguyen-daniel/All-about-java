package Lec6_ArrayList;

import java.util.*;

public class bai1Phuongtrinhbat2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = scanner.nextInt();
        System.out.println("Nhap b:");
        int b = scanner.nextInt();
        System.out.println("Nhap c:");
        int c = scanner.nextInt();

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Ptrinh vo nghiem");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Ptrinh co nghiem kep" + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);

        }
    }
}

