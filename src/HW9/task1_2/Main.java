package HW9.task1_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Product> product1 = new HashSet<>();
        product1.add(new Product("Колбаса", 250.0, 0.5));
        product1.add(new Product("Сыр", 170.0, 0.25));
        product1.add(new Product("Огурцы", 100.0, 0.3));


        System.out.println(product1);
    }
}
