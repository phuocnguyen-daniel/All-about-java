package Lec6ArrayMANG;

import java.util.*;

public class baividu {

    public static void main(String[] args) {

        int[] number = new int[10]; //khoi tao mang

        for (int i = 0; i < 8; i++) {
            number[i] = 2 * i;
        }
        System.out.println("dang cap" + Arrays.toString(number));
    }
}
