package com.testconnect.demo.mapper;

import com.testconnect.demo.entity.ShopInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopMapper {
//    @Select("Select * from shopinfo si join shopscore ss on gid=#{gid} where si.shopId = ss.shopId ")
    ShopInfo getShopInfoBygid(int gid) ;
}
