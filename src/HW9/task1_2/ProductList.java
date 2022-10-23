package HW9.task1_2;

import java.util.*;

public class ProductList {
    private final Map<Product, Double> productSet;

    public ProductList() {
        productSet = new HashMap<>();

    }


    public void addProduct(Product product) throws ProductException {
        if (productSet.containsValue(product)) {
            throw new ProductException("В списке уже есть продукт - " + product.getProductsName());

        } else {
            productSet.put(product, product.getWeight());
        }
    }

    public void delProduct(Product product) {
        productSet.remove(product);
    }
    public Double sumPriceProduct(){
        double sum = 0;
        for (Map.Entry<Product, Double> productDoubleEntry : productSet.entrySet()) {
            sum += (productDoubleEntry.getKey().getPrice() * productDoubleEntry.getValue()) ;
        }

        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductList that = (ProductList) o;
        return Objects.equals(productSet, that.productSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productSet);
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "productSet=" + productSet +
                '}';
    }
}
