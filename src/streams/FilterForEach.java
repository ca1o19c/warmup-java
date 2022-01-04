package streams;

import streams.model.Product;
import streams.model.Status;

import java.math.BigDecimal;
import java.util.ArrayList;

import static streams.model.Status.ACTIVE;

public class FilterForEach {
    public static void main(String[] args) {
        var products = new ArrayList<Product>();

        products.add(new Product("Água 2L", ACTIVE, new BigDecimal("9.9")));
        products.add(new Product("Picanha 1Kg", ACTIVE, new BigDecimal("109.5")));
        products.add(new Product("Carvão", Status.INACTIVE, new BigDecimal("34.2")));
        products.add(new Product("Cerveja 600 ml", ACTIVE, new BigDecimal("8.4")));
        products.add(new Product("Cupim 2Kg", ACTIVE, new BigDecimal("92")));

        products.stream()
                .filter(p -> p.getName().startsWith("C"))
                .forEach(Product::inactivate);
    }
}
