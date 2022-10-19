package HW9.task1_2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws ProductException {


        Product kolbasa = new Product("Колбаса", 250.0, 0.5);
        Product cheese = new Product("Сыр", 170.0, 0.25);
        Product cucumbers = new Product("Огурцы", 100.0, 0.3);
        Product tomatoes = new Product("Помидоры", 90.0, 0.4);
        Product potato = new Product("Картофель", 50.0, 0.6);
        Product peas = new Product("Горошек", 60.0, 0.3);
        Product eggs = new Product("Яйца", 85.0, 0.55);

        ProductList product1 = new ProductList();
        product1.addProduct(potato);
        product1.addProduct(kolbasa);
        product1.addProduct(peas);
        product1.addProduct(tomatoes);
        product1.addProduct(cheese);
//        System.out.println(product1);
//        product1.delProduct(peas);
//        System.out.println(product1);

        Product pasta = new Product("Макарошки", 70.0, 0.4);
        Product carrot = new Product("Морковь", 40.0, 0.15);
        Product groundMeat = new Product("Фарш", 255.0, 0.4);
        Product onion = new Product("Лук", 30.0, 0.1);
        ProductList product2 = new ProductList();
        product2.addProduct(pasta);
        product2.addProduct(carrot);
        product2.addProduct(groundMeat);
        product2.addProduct(onion);


        Recipes recipes = new Recipes("Салат", product1);
        Recipes recipes0 = new Recipes("Салат", product2);
        Recipes recipes1 = new Recipes("Макарошки по-флотски", product2);
        RecipesBook recipesBook = new RecipesBook();
        recipesBook.addRecipes(recipes);
        recipesBook.addRecipes(recipes1);
        recipesBook.addRecipes(recipes0);
        System.out.println(recipesBook);





    }

}
