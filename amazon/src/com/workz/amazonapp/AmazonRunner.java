package com.workz.amazonapp;

import com.workz.amazonapp.amazon.Amazon;
import com.workz.amazonapp.amazon.impl.AmazonImpl;
import com.workz.amazonapp.product.Product;

public class AmazonRunner {
    public static void main(String[] args) {
        Product product = new Product();
        product.setProductId(12);
        product.setProductName("Mouse");
        product.setPrice(699);
        product.setProductType("Electronics");

        Amazon amazon = new AmazonImpl();
        amazon.addProduct(product);
        amazon.getProductDetails();

        amazon.updateProductDetails(799);
        amazon.getProductDetails();
    }
}
