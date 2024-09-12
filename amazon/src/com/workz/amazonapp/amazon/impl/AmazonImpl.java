package com.workz.amazonapp.amazon.impl;

import com.workz.amazonapp.amazon.Amazon;
import com.workz.amazonapp.product.Product;



public class AmazonImpl implements Amazon {

   Product product;
    @Override
    public void addProduct(Product product) {
        System.out.println("add product started");
        if(product!= null){
            this.product= product;

        }else System.out.println("enter a valid name");
        System.out.println("add product ended");
    }

    @Override
    public void getProductDetails() {
        System.out.println(product);

    }

    @Override
    public boolean updateProductDetails(double newPrice) {
        System.out.println("update product started");
    boolean isUpdated = false;
    if(product!=null) {
        product.setPrice(newPrice);
        isUpdated=true;
    }else System.out.println("improper data found");

    System.out.println("update product ended");
return isUpdated;
    }

    @Override
    public boolean deleteProduct(Product product) {
        System.out.println("delete product started");
        boolean isProductDeleted=false;
        if (product!=null) {
            this.product = null;
            isProductDeleted=true;


        }
        else System.out.println("no data to delete");

        System.out.println("delete product ended");
    return isProductDeleted;
    }
}
