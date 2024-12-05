package com.myn.model;

import java.util.List;

public class ProductCatalog {
    private final String catalogName;
    private final List<ProductCategory> categories;

    public ProductCatalog(final String catalogName, final List<ProductCategory> categories) {
        this.catalogName = catalogName;
        this.categories = categories;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public List<ProductCategory> getCategories() {
        return categories;
    }
}
