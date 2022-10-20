package HW9.task1_2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ProductList {
    private final Set<Product> productSet;

    public ProductList() {
        productSet = new HashSet<>();
    }

    public void addProduct(Product product) throws ProductException {
        if (productSet.contains(product)) {
            throw new ProductException("В списке уже есть продукт - " + product.getProductsName());

        } else {
            productSet.add(product);
        }
    }

    public void delProduct(Product product) {
        productSet.remove(product);
    }
    public Double sumPriceProduct(){
        double sum = 0;
        for (Product product : productSet) {
            sum += (product.getPrice() * product.getWeight());
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
        return "Список продуктов {" + "\n" +
                productSet +
                '}';
    }
}
