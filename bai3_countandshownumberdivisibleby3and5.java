package Lec6_ArrayList;

import java.util.*;

public class bai3_countandshownumberdivisibleby3and5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        int dem = 0;

        System.out.println("Cac so chia het cho 3 va 5 tu 1 den " + n + " la:");

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
                dem++;
            }
        }

        System.out.println("\nSo luong: " + dem);
    }
}
