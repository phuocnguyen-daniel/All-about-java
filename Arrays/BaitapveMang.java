package Lec6ArrayMANG;

import java.util.*;

public class BaitapveMang {

    static void hienThiMang(int[] a) {
        System.out.print("Mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void daoNguocMang(int[] a) {
        System.out.print("Mang dao nguoc: ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void hienThiSoChan(int[] a) {
        System.out.print("Cac so chan: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    static int tongChiaHet3Va5(int[] a) {
        int tong = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0 && a[i] % 5 == 0) {
                tong += a[i];
            }
        }
        return tong;
    }

    static void sapXepTangDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    static void sapXepGiamDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("Mang giam dan: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        hienThiMang(a);
        daoNguocMang(a);
        hienThiSoChan(a);

        System.out.println("Tong chia het cho 3 va 5 = " + tongChiaHet3Va5(a));

        sapXepTangDan(a);
        sapXepGiamDan(a);
    }
}
