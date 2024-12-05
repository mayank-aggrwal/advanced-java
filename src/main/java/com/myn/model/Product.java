package com.myn.model;

public class Product {
    private final String productId;
    private final String name;
    private final Double price;

    public Product(final String productId, final String name, final Double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getProductId() {
        return productId;
    }

    public Double getPrice() {
        return price;
    }
}
