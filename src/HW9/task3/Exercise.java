package HW9.task3;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise {
    public static void main(String[] args) {
        System.out.println(getExercise());
    }

    public static Set<String> getExercise() {
        Set<String> exercise = new HashSet<>();
        int min = 2;
        int max = 9;
        int size = 15;
        while (exercise.size() < size) {
            int first = ThreadLocalRandom.current().nextInt(min, max + 1);
            int second = ThreadLocalRandom.current().nextInt(min, max + 1);
            if (!exercise.contains(first + " * " + second) && (!exercise.contains(second + " * " + first))) {
                exercise.add(first + " * " + second + "\n");
            }
        }
        return exercise;
    }
}