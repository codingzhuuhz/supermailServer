package com.testconnect.demo.entity;

public class ShopScore {
    public int id;
    private boolean isBetter ;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isBetter() {
        return isBetter;
    }

    public void setBetter(boolean better) {
        isBetter = better;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    private double score;
    private int shopId ;
}
