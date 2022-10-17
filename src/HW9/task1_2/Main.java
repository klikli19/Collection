package HW9.task1_2;

import java.util.HashSet;
import java.util.Set;
import HW9.task1_2.Product;

public class Main {
    public static void main(String[] args) {

        Set<Product> product1 = new HashSet<>();
        product1.add(new Product("Колбаса", 250.0, 0.5));
        product1.add(new Product("Сыр", 170.0, 0.25));
        product1.add(new Product("Огурцы", 100.0, 0.3));
        product1.add(new Product("Помидоры", 90.0, 0.4));
        product1.add(new Product("Картофель", 50.0, 0.6));
        product1.add(new Product("Горошек", 60.0, 0.3));
        product1.add(new Product("Яйца", 85.0, 0.55));

        Set<Product> product2 = new HashSet<>();
        product2.add(new Product("Макарошки", 70.0, 0.4));
        product2.add(new Product("Морковь", 40.0, 0.15));
        product2.add(new Product("Фарш", 255.0, 0.4));
        product2.add(new Product("Лук", 30.0, 0.1));

        Set<Recipes> recipes1 = new HashSet<>();
        recipes1.add(new Recipes("Оливьеха",  product1));
        recipes1.add(new Recipes("Макароны по-флотски", product2));
        recipes1.add(new Recipes("Салат",  product1));
        System.out.println(recipes1);



    }

}
