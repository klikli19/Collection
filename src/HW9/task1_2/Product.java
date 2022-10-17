package HW9.task1_2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Product {
    private final String productsName;
    private double price;
    private Double weight;
    private Set<Product> productSet;


    public Product(String productsName, Double price, Double weight) {
        if (productsName == null || productsName.isBlank()) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.productsName = productsName;}
        this.price = price;
        this.weight = weight;
        this.productSet = new HashSet<>();
    }


    public String getProductsName() {
        return productsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price == null || price < 0) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.price = price;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        if (weight == null || weight < 0) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.weight = weight;
        }
    }


    @Override
    public boolean equals(Object o) {
        throw new RuntimeException("Есть такой продукт в списке покупок");

    }

    @Override
    public int hashCode() {
        return Objects.hash(productsName, price, weight);
    }

    @Override
    public String toString() {
        return "{ Список продуктов:" +
                "наименование = " + productsName + '\'' +
                ", цена = " + price +
                ", вес = " + weight +
                '}' + "\n";
    }
}
