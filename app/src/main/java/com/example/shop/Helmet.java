package com.example.shop;

public class Helmet extends Parameters {
    @Override
    public void setProductId(String productId) {
        super.setProductId (productId);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public Helmet(String productId, String color) {
        super(productId, color);
    }
}
