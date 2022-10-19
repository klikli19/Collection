package HW9.task1_2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipes {
    private final String recipesName;
    private  Double recipesPrice;
    private final ProductList productList;;

    public Recipes(String recipesName, ProductList productList) {
        if (recipesName == null || recipesName.isBlank()) {
            this.recipesName = "Не указано название";
        } else {
            this.recipesName = recipesName;
        }
        this.productList = productList;
        recipesPrice = productList.sumPriceProduct();
    }


    public String getRecipesName() {
        return recipesName;
    }

    public Double getRecipesPrice() {
        return recipesPrice;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Objects.equals(recipesName, recipes.recipesName) && Objects.equals(recipesPrice, recipes.recipesPrice) && Objects.equals(productList, recipes.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipesName, recipesPrice, productList);
    }

    @Override
    public String toString() {
        return "Рецепт {" +
                "назввание ='" + recipesName + '\'' +
                ", цена =" + recipesPrice +
                ", ингредиенты =" + productList +
                '}';
    }
}

