package com.example.shop;

public class Parameters {
    private String productId;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void deliver(){

    }

    public void sell(){

    }

    public Parameters(String productId, String color) {
        this.productId = productId;
        this.color = color;
    }
}
