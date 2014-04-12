package io.cristiano.angularjs.service;

import io.cristiano.angularjs.domain.Product;

public class ProductService {

    public static Product getProduct() {
        final Product product = new Product();

        product.setCode("100");
        product.setDescription("New product on sale.");
        product.setDiscount(0.0d);
        product.setPrice(120d);
        product.setTitle("New Product");

        return product;
    }
}
