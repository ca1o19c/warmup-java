package streams;

import streams.domain.Product;

import java.math.BigDecimal;
import java.util.ArrayList;

import static java.math.BigDecimal.ZERO;
import static streams.domain.Status.*;
import static streams.domain.Status.ACTIVE;

public class Reduce {
    public static void main(String[] args) {
        var products = new ArrayList<Product>();

        products.add(new Product("Água 2L", ACTIVE, new BigDecimal("9.9")));
        products.add(new Product("Picanha 1Kg", ACTIVE, new BigDecimal("109.5")));
        products.add(new Product("Carvão", INACTIVE, new BigDecimal("34.2")));
        products.add(new Product("Cerveja 600 ml", ACTIVE, new BigDecimal("8.4")));
        products.add(new Product("Cupim 2Kg", ACTIVE, new BigDecimal("92")));

        var total = products.stream()
                .filter(p -> p.getStatus().equals(ACTIVE))
                .map(Product::getPrice)
                .reduce(ZERO, BigDecimal::add);

        System.out.println(total);
    }
}
