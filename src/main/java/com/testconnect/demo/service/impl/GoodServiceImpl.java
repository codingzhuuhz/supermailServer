package com.testconnect.demo.service.impl;

import com.testconnect.demo.entity.Comment;
import com.testconnect.demo.entity.GoodInfo;
import com.testconnect.demo.entity.PageBean;
import com.testconnect.demo.entity.ShopInfo;
import com.testconnect.demo.mapper.CommentMapper;
import com.testconnect.demo.mapper.GoodInfoMapper;
import com.testconnect.demo.mapper.ShopMapper;
import com.testconnect.demo.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    CommentMapper commentMapper ;
    @Autowired
    GoodInfoMapper goodInfoMapper ;
    @Autowired
    ShopMapper shopMapper ;
    @Override
    public PageBean getGoodInfoByPageAndType(String type, int page) {
        int pageSize = 8 ;
        long totalSize = goodInfoMapper.getGoodInfoTotal(type) ;
        int start = (page-1)*pageSize ;
        List<GoodInfo> content = goodInfoMapper.getGoodInfoByLimit(type,start,pageSize) ;
        Double temp = Math.ceil(totalSize/pageSize) ;
        int totalPage = temp.intValue() ;
        if(page<=totalPage){
            PageBean pageBean = new PageBean();
            pageBean.setCurrentPage(page);
            pageBean.setPageSize(pageSize);
            pageBean.setTotalPage(totalPage);
            pageBean.setTotalSize(totalSize);
            pageBean.setContent(content);
            return pageBean;
        }else{
         return null;
        }
    }

    @Override
    public GoodInfo getGoodDetailInfoById(int id) {
        GoodInfo goodInfo = goodInfoMapper.getGoodDetailInfoById(id);
        String[] intros = goodInfo.getIntroimgurl().split("#") ;
        String[] tops = goodInfo.getTopimgurl().split("#") ;
        for (String intro:intros) {
            goodInfo.introurls.add(intro);
        }
        for (String top:tops) {
            goodInfo.topurls.add(top);
        }
        goodInfo.setTopimgurl(null);
        goodInfo.setIntroimgurl(null);
        return goodInfo ;
    }

    @Override
    public List<Comment> getCommentById(int gid) {
        return commentMapper.getCommmetBygid(gid);
    }

    @Override
    public ShopInfo getShopInfoBygid(int id) {
        return shopMapper.getShopInfoBygid(id);
    }
}
