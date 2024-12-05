package com.myn;

import com.google.common.collect.ImmutableList;
import com.myn.model.*;

import java.util.List;

public class WorkingWithFlatmap {
    public static void main(String[] args) {

        // One Level of Nesting
        final List<LeavePlan> leavePlans = getLeavePlans();
        List<String> leaves = leavePlans.stream()
                .flatMap(leavePlan -> leavePlan.getLeaves().stream())
                .map(Leave::getLeaveTypeLabel)
                .toList();
        System.out.println("All Leaves: " + leaves);



        // Two Level of Nesting
        final List<ProductCatalog> catalogs = createProductCatalogs();
        final List<String> products = catalogs.stream()
                .flatMap(catalog -> catalog.getCategories().stream())
                .flatMap(category -> category.getProducts().stream())
                .map(Product::getName)
                .toList();
        System.out.println("All products: " + products);

        final List<ProductCatalog> catalogs2 = createProductCatalogs();
        final List<String> products2 = catalogs2.stream()
                .flatMap(catalog -> catalog.getCategories().stream()
                        .flatMap(category -> category.getProducts().stream()))
                .map(Product::getName)
                .toList();
        System.out.println("All products2: " + products2);


        // Three Level of Nesting








    }

    private static List<LeavePlan> getLeavePlans() {
        Leave leave1 = new Leave("sick", "Sick", 10.0, "days");
        Leave leave2 = new Leave("casual", "Casual", 12.0, "days");
        Leave leave3 = new Leave("floating", "Floating", 5.0, "days");

        LeavePlan leavePlan1 = new LeavePlan("voluntary_holiday", "Voluntary Holiday", ImmutableList.of(leave1, leave2));
        LeavePlan leavePlan2 = new LeavePlan("floating_holiday", "Floating Holiday", ImmutableList.of(leave3));

        return ImmutableList.of(leavePlan1, leavePlan2);
    }

    private static List<ProductCatalog> createProductCatalogs() {
        // Create products for first category
        Product product1 = new Product("P1", "Laptop", 1000.00);
        Product product2 = new Product("P2", "Mouse", 20.00);

        // Create products for second category
        Product product3 = new Product("P3", "Smartphone", 700.00);
        Product product4 = new Product("P4", "Headphones", 150.00);
        Product product5 = new Product("P5", "Charger", 25.00);

        // Create categories
        ProductCategory category1 = new ProductCategory("C1", "Electronics", List.of(product1, product2));
        ProductCategory category2 = new ProductCategory("C2", "Gadgets", List.of(product3, product4, product5));

        // Create catalog and add categories
        ProductCatalog catalog1 = new ProductCatalog("Tech Catalog", List.of(category1, category2));

        // Create second catalog with similar structure
        Product product6 = new Product("P6", "Smartwatch", 250.00);
        Product product7 = new Product("P7", "Keyboard", 50.00);
        Product product8 = new Product("P8", "Tablet", 400.00);
        Product product9 = new Product("P9", "Speakers", 60.00);

        ProductCategory category3 = new ProductCategory("C3", "Accessories", List.of(product6, product7));
        ProductCategory category4 = new ProductCategory("C4", "Mobile Devices", List.of(product8, product9));

        ProductCatalog catalog2 = new ProductCatalog("Gadget Catalog", List.of(category3, category4));

        return ImmutableList.of(catalog1, catalog2);
    }
}
