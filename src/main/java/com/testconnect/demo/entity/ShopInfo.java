package com.testconnect.demo.entity;

import java.util.List;

public class ShopInfo {
    private List<ShopScore> shopScore;
    private int shopId;

    @Override
    public String toString() {
        return "ShopInfo{" +
                "shopScore=" + shopScore +
                ", shopId=" + shopId +
                ", shopUrl='" + shopUrl + '\'' +
                ", shopName='" + shopName + '\'' +
                ", gid=" + gid +
                '}';
    }

    public List<ShopScore> getShopScore() {
        return shopScore;
    }

    public void setShopScore(List<ShopScore> shopScore) {
        this.shopScore = shopScore;
    }

    private String shopUrl ;

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    private String shopName ;
    private int gid ;
}
