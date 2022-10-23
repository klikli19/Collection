package HW10.task2;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        Map<String, List<Integer>> map = new HashMap<>(5);
        for (int i = 0; i < 5; i++) {
            List<Integer> list1 = new ArrayList<>();
            StringBuilder str = new StringBuilder("Строка" );
            for (int j = 0; j < 3; j++) {
                double random = Math.random() * 1000;
                list1.add((int) random);
            }
            map.put(str.append(i).toString(),list1);
        }
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println();
        Map<String, Integer> integerMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> stringListEntry : map.entrySet()) {
            integerMap.put(stringListEntry.getKey(), (stringListEntry.getValue().get(0) + stringListEntry.getValue().get(1)
                    + stringListEntry.getValue().get(2)));
        }
        for (Map.Entry<String, Integer> s : integerMap.entrySet()) {
            System.out.println(s);
        }

    }
}
