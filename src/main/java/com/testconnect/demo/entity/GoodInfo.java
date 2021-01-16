package com.testconnect.demo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GoodInfo implements Serializable {
    public Integer gid ;
    private String type ;
    public GoodInfo(){}
    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public double getGnewprice() {
        return gnewprice;
    }

    public void setGnewprice(double gnewprice) {
        this.gnewprice = gnewprice;
    }

    public Integer getGnum() {
        return gnum;
    }

    public void setGnum(Integer gnum) {
        this.gnum = gnum;
    }

    public String getGintroduce() {
        return gintroduce;
    }

    public void setGintroduce(String gintroduce) {
        this.gintroduce = gintroduce;
    }

    public String getGurl() {
        return gurl;
    }

    public void setGurl(String gurl) {
        this.gurl = gurl;
    }

    public double getGoldprice() {
        return goldprice;
    }

    public void setGoldprice(double goldprice) {
        this.goldprice = goldprice;
    }

    public String getTopimgurl() {
        return topimgurl;
    }

    public void setTopimgurl(String topimgurl) {
        this.topimgurl = topimgurl;
    }

    public Integer getSellnum() {
        return sellnum;
    }

    public void setSellnum(Integer sellnum) {
        this.sellnum = sellnum;
    }

    public Integer getStorenum() {
        return storenum;
    }

    public void setStorenum(Integer storenum) {
        this.storenum = storenum;
    }

    public String getIntroimgurl() {
        return introimgurl;
    }

    public void setIntroimgurl(String introimgurl) {
        this.introimgurl = introimgurl;
    }

    private String gname ;
    private double gnewprice ;
    private Integer gnum ;
    private String gintroduce ;
    private String gurl ;
    private double goldprice ;
    private String topimgurl ;
    private Integer sellnum ;
    private Integer storenum ;
    private String introimgurl ;


    public List<String> introurls = new ArrayList<>();
    public List<String> topurls = new ArrayList<>();
}
