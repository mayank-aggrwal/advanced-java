package com.myn.model;

import java.util.List;

public class ProductCategory {
    private final String categoryId;
    private final String categoryName;
    private final List<Product> products;

    public ProductCategory(final String categoryId, final String categoryName, final List<Product> products) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.products = products;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<Product> getProducts() {
        return products;
    }
}
