package optional.test;

import optional.domain.ProductCatalog;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductCatalogTest {

    private final ProductCatalog productCatalog = new ProductCatalog();
    private static final String PRODUCT = "Picanha 12Kg";

    @Test
    void shouldFoundProduct() {
        var foundProduct = productCatalog.search(PRODUCT);

        assertThat(foundProduct).isNotNull();
        assertThat(foundProduct.getName()).isEqualTo(PRODUCT);
    }

    @Test
    void shouldNotFoundProduct() {
        var foundItem = productCatalog.search("");

        assertThat(foundItem).isNull();
    }

    @Test
    void shouldFoundProductWithOptional() {
        var foundProduct = productCatalog.optionalSearch(PRODUCT);

        assertThat(foundProduct).isNotEmpty();
    }

    @Test
    void shouldNotFoundProductWithOptional() {
        var foundProduct = productCatalog.optionalSearch("");

        assertThat(foundProduct).isEmpty();
    }

    @Test
    void shouldFoundPriceWithOptional() {
        var foundPrice = productCatalog.priceSearch(PRODUCT);

        assertThat(foundPrice).isNotEmpty();
    }

    @Test
    void shouldNotFoundPriceWithOptional() {
        var foundPrice = productCatalog.priceSearch("");

        assertThat(foundPrice).isEmpty();
    }
}