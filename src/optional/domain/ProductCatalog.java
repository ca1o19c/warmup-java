package optional.domain;

import optional.core.ProductSearch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static optional.domain.Status.ACTIVE;
import static optional.domain.Status.INACTIVE;

public class ProductCatalog implements ProductSearch {

    private List<Product> products = new ArrayList<>();

    public ProductCatalog() {
        products.add(new Product("Água 2L", ACTIVE, new BigDecimal("9.9")));
        products.add(new Product("Picanha 12Kg", ACTIVE, new BigDecimal("109.5")));
        products.add(new Product("Carvão", INACTIVE, new BigDecimal("34.2")));
        products.add(new Product("Cerveja 600 ml", ACTIVE, new BigDecimal("8.4")));
        products.add(new Product("Cupim 2Kg", ACTIVE, new BigDecimal("92")));
    }

    @Override
    public Product search(String name) {
        for (var product : this.products) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

    @Override
    public Optional<Product> optionalSearch(String name) {
        return this.products.stream()
                .filter(p -> p.getName().equals(name)).findFirst();
    }

    @Override
    public Optional<BigDecimal> priceSearch(String name) {
        return this.products.stream()
                .filter(p -> p.getName().equals(name))
                .map(Product::getPrice)
                .findFirst();
    }
}
