package AGGSINGMENT6;

import java.util.*;

public class RemoveanElement {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(random.nextInt(100) + 1);
        }
        System.out.println("Random numbers" + numbers);
        numbers.remove((3));
        System.out.println("Update numbers" + numbers);

    }
}
