package AGGSINGMENT6;

import java.util.*;

public class CountOddandEvenNumbers {

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        int n = 15;
        int OddCount = 0;
        int EvenCount = 0;

        for (int i = 1; i <= n; i++) {
            int value = rand.nextInt(50) + 1;
            numbers.add(value);
            if (value % 2 == 0) {
                EvenCount++;
            } else {
                OddCount++;
            }

        }
        System.out.println("Cac so:" + numbers);
        System.out.println("dem so le:" + OddCount);
        System.out.println("dem so chan:" + EvenCount);
    }
}
