package streams;

import streams.model.Category;
import streams.model.Product;
import streams.model.Status;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MapCollect {
    public static void main(String[] args) {
        var beverageCategory = new Category("Bebidas");
        var meatCategory = new Category("Carnes");
        var othersCategory = new Category("Outros");

        var products = new ArrayList<Product>();

        products.add(new Product("Água 2L", Status.ACTIVE, new BigDecimal("9.9"), beverageCategory));
        products.add(new Product("Picanha 1Kg", Status.ACTIVE, new BigDecimal("109.5"), meatCategory));
        products.add(new Product("Carvão", Status.INACTIVE, new BigDecimal("34.2"), othersCategory));
        products.add(new Product("Cerveja 600 ml", Status.ACTIVE, new BigDecimal("8.4"), beverageCategory));
        products.add(new Product("Cupim 2Kg", Status.ACTIVE, new BigDecimal("92"), meatCategory));

        var categories = products.stream()
                .filter(p -> p.getStatus().equals(Status.ACTIVE))
                .map(Product::getCategory)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(categories);
    }
}
