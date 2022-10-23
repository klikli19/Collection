package HW10.task2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Васька", 5);
        map.put("Мурзик", 8);
        map.put("Рыжик", 12);
        map.put("Барсик", 5);
        map.put("Тошка", 4);
        map.put("Пушок", 2);
        map.put("Снежок", 9);
        map.put("Пусик", 7);
        map.put("Мурка", 11);
        map.put("Кнопка", 1);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }




    }
}
