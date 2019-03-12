package com.example.shop;

public class Scooter extends Parameters {

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setProductId (String productId) {
        super.setProductId (productId);
    }

    public Scooter(String productId, String color) {
        super(productId, color);
    }

    public void make(){

    }
}
