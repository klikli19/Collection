package HW9.task1_2;

import java.util.*;

public class Number {
    public static void main(String[] args) {
        System.out.println(randomNumbers());
    }

    public static Set<Integer> randomNumbers() {
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            double random = Math.random() * 1000;
            integers.add((int) random);
        }
        integers.removeIf(integer -> integer %2 == 0);
        return integers;
    }

}
