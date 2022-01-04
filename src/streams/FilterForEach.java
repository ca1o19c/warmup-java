package streams;

import streams.model.Product;
import streams.model.Status;

import java.math.BigDecimal;
import java.util.ArrayList;

public class FilterForEach {
    public static void main(String[] args) {
        var products = new ArrayList<Product>();

        products.add(new Product("Água 2L", Status.ACTIVE, new BigDecimal("9.9")));
        products.add(new Product("Picanha 1Kg", Status.ACTIVE, new BigDecimal("109.5")));
        products.add(new Product("Carvão", Status.INACTIVE, new BigDecimal("34.2")));
        products.add(new Product("Cerveja 600 ml", Status.ACTIVE, new BigDecimal("8.4")));
        products.add(new Product("Cupim 2Kg", Status.ACTIVE, new BigDecimal("92")));

        products.stream()
                .filter(p -> p.getName().startsWith("C"))
                .forEach(Product::inactivate);
    }
}
