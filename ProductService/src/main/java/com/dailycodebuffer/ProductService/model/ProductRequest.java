package com.dailycodebuffer.ProductService.model;

import lombok.Data;

@Data
public class ProductRequest {

    private long quantity;

    private String name;

    private long price;
}
