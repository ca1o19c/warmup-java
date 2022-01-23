package streams;

import streams.domain.Product;
import streams.domain.Status;

import java.math.BigDecimal;
import java.util.ArrayList;

import static streams.domain.Status.ACTIVE;

public class AnyMatch {
    public static void main(String[] args) {
        var products = new ArrayList<Product>();

        products.add(new Product("Água 2L", ACTIVE, new BigDecimal("9.9")));
        products.add(new Product("Picanha 1Kg", ACTIVE, new BigDecimal("109.5")));
        products.add(new Product("Carvão", Status.INACTIVE, new BigDecimal("34.2")));
        products.add(new Product("Cerveja 600 ml", ACTIVE, new BigDecimal("8.4")));
        products.add(new Product("Cupim 2Kg", ACTIVE, new BigDecimal("92")));

        var doYouHaveSteak = products.stream()
                .anyMatch(p -> p.getName().equals("Picanha 1Kg"));

        System.out.println(doYouHaveSteak);
    }
}
