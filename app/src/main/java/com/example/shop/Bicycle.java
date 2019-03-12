package com.example.shop;

public class Bicycle extends Parameters {

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setProductId(String productId) {
        super.setProductId(productId);
    }

    public Bicycle(String productId, String color) {
        super(productId, color);
    }

    public void make(){

    }
}
