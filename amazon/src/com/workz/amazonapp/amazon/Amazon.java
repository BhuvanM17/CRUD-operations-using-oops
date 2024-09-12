package com.workz.amazonapp.amazon;

import com.workz.amazonapp.product.Product;

public interface Amazon {
        void addProduct(Product product);
        void getProductDetails();
        boolean updateProductDetails(double newPrice);
        boolean deleteProduct(Product product);
}
