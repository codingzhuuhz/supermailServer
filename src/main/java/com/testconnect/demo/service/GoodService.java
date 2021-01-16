package com.testconnect.demo.service;

import com.testconnect.demo.entity.Comment;
import com.testconnect.demo.entity.GoodInfo;
import com.testconnect.demo.entity.PageBean;
import com.testconnect.demo.entity.ShopInfo;

import java.util.List;

public interface GoodService {
    PageBean getGoodInfoByPageAndType(String type, int page);

    GoodInfo getGoodDetailInfoById(int id);

    List<Comment> getCommentById(int id);
    ShopInfo getShopInfoBygid(int id) ;
}
