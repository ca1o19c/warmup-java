package optional;

import optional.domain.ProductCatalog;

import java.math.BigDecimal;

public class Optional {
    public static void main(String[] args) {
        var catalog = new ProductCatalog();

        BigDecimal price = catalog.priceSearch("Picanha 12Kg")
                .orElseThrow(() -> new RuntimeException("Price of product not found"));

        System.out.println(price);
    }
}
