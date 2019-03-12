package com.example.shop;

public class Boots extends Parameters {
    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setProductId(String productId) {
        super.setProductId(productId);
    }

    public Boots(String productId, String color) {
        super(productId, color);
    }
}
