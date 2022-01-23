package optional.domain;

import java.math.BigDecimal;
import java.util.Objects;

import static optional.domain.Status.INACTIVE;

public class Product {

    private String name;
    private Status status;
    private BigDecimal price;

    public Product(String name, Status status, BigDecimal price) {
        this.name = name;
        this.status = status;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Product setStatus(Status status) {
        this.status = status;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Product setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && status == product.status && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, price);
    }

    public void inactivate() {
        System.out.printf("inactivating %s%n",  this.getName());

        this.status = INACTIVE;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", status=" + status +
                ", price=" + price +
                '}';
    }
}
