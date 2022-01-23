package optional.core;

import optional.domain.Product;

import java.math.BigDecimal;
import java.util.Optional;

public interface ProductSearch {

    Product search(String name);
    Optional<Product> optionalSearch(String name);
    Optional<BigDecimal> priceSearch(String name);
}
