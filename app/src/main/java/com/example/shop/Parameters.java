package com.example.shop;

public class Parameters {
    private long productNum;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getProductNum() {
        return productNum;
    }

    public void setProductNum(long productNum) {
        this.productNum = productNum;
    }

    public void deliver(){

    }

    public void Sell(){

    }

    public Parameters(long productNum, String color) {
        this.productNum = productNum;
        this.color = color;
    }
}
