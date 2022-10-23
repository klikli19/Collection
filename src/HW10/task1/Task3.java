package HW10.task1;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Test test = new Test();
        test.add("str2",1);
        test.add("str2",3);
        test.add("str1",3);


        System.out.println(test);


    }
    public static class Test {
        private final Map<String, Integer> test = new HashMap<>();




        public void add(String a, Integer b) {
            if (!test.containsKey(a)) {
                test.put(a, b);
            } else if (test.containsKey(a) && !test.containsValue(b)) {
                test.put(a, b);
            } else {
                throw new RuntimeException("Значения совпадают");
            }
        }

        @Override
        public String toString() {
            return "Test{" +
                    "test=" + test +
                    '}';
        }
    }
}
