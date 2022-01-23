package streams;

import streams.domain.Category;
import streams.domain.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.stream.Collectors;

import static streams.domain.Status.ACTIVE;
import static streams.domain.Status.INACTIVE;

public class MapCollect {
    public static void main(String[] args) {
        var beverageCategory = new Category("Bebidas");
        var meatCategory = new Category("Carnes");
        var othersCategory = new Category("Outros");

        var products = new ArrayList<Product>();

        products.add(new Product("Água 2L", ACTIVE, new BigDecimal("9.9"), beverageCategory));
        products.add(new Product("Picanha 1Kg", ACTIVE, new BigDecimal("109.5"), meatCategory));
        products.add(new Product("Carvão", INACTIVE, new BigDecimal("34.2"), othersCategory));
        products.add(new Product("Cerveja 600 ml", ACTIVE, new BigDecimal("8.4"), beverageCategory));
        products.add(new Product("Cupim 2Kg", ACTIVE, new BigDecimal("92"), meatCategory));

        var categories = products.stream()
                .filter(p -> p.getStatus().equals(ACTIVE))
                .map(Product::getCategory)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(categories);
    }
}
