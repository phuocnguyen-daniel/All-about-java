package Lec6ArrayMANG;

import java.util.*;

public class THOITIET {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("HOw many days temperatures:");
        int day = scan.nextInt();
        int[] number = new int[day]; //tao mang 
        int sum = 0;
        for (int i = 0; i < day; i++) {
            System.out.print("Day" + (i + 1) + "s high temp:"); //DUNG de nhap nhiet do tung ngay
            number[i] = scan.nextInt();
            sum += number[i];

        }
        for(int i = 0 ; i <day;i++){
            System.out.print("nhiet do:"+number[i]+ " ");
        }
        double trungbinh = (double) sum / day;
        int dem = 0;
        for (int i = 0; i < day; i++) {
            if (number[i] > trungbinh) {
                dem++;
            }

        }
        System.out.println();
        System.out.println("Nhiet do trung binh:" + trungbinh);
        System.out.println(dem + "day above average");

    }
}
