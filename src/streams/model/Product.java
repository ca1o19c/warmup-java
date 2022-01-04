package streams.model;

import java.math.BigDecimal;

public class Product {

    private String name;
    private Status status;
    private BigDecimal price;
    private Category category;

    public Product(String name, Status status, BigDecimal price) {
        this.name = name;
        this.status = status;
        this.price = price;
    }

    public Product(String name, Status status, BigDecimal price, Category category) {
        this.name = name;
        this.status = status;
        this.price = price;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public Product setCategory(Category category) {
        this.category = category;
        return this;
    }

    public void inactivate() {
        System.out.printf("inactivating %s%n",  this.getName());

        this.status = Status.INACTIVE;
    }
}
