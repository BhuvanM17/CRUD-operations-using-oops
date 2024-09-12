package com.workz.amazonapp.product;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class Product {
    private int productId;
    private String productName;
    private double price;
    private String productType;
}
