package Lec6ArrayMANG;

import java.util.*;

public class taovanhapmang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n::");
        int value = scanner.nextInt();
        System.out.println("Nhap gia tri tuong ung o nho");
        int[] number = new int[value];
        for (int i = 0; i < value; i++) {
            number[i] = scanner.nextInt();
        }
        System.out.println("Mang vua nhap la:");
        for (int i = 0; i < value; i++) {
            System.out.print(number[i] + " ");
        }

    }
}
