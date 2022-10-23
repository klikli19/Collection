package HW9.task1_2;

import java.util.Objects;


public class Product {
    private final String productsName;
    private double price;
    private Double weight;


    public Product(String productsName, Double price, Double weight) throws ProductException {
        if (productsName == null || productsName.isBlank()) {
            throw new ProductException("Заполните карточку товара полностью");
        } else {
            this.productsName = productsName;}
        setPrice(price);
        setWeight(weight);
    }
    public String getProductsName() {
        return productsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) throws ProductException {
        if (price == null || price < 0) {
            throw new ProductException("Заполните карточку товара полностью");
        } else {
            this.price = price;
        }
    }


    public Double getWeight() {
        return weight;
    }

    public double setWeight(Double weight) {
        if (weight == null) {
            this.weight = 1.0;
        } else {
            this.weight = weight;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(productsName, product.productsName) && Objects.equals(weight, product.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsName, price, weight);
    }

    @Override
    public String toString() {
        return "{" + productsName +
                ", цена = " + price +
                ", вес = " + weight +
                '}' + "\n";
    }
}
