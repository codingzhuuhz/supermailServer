package com.testconnect.demo.mapper;

import com.testconnect.demo.entity.GoodInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GoodInfoMapper {
    @Select("select sum(1) from goodinfo where type=#{type}")
    public long getGoodInfoTotal(String type) ;
    @Select("select gid,gname,gnewprice,gurl,type from goodInfo where type=#{type} limit #{start},#{size}")
    public List<GoodInfo> getGoodInfoByLimit(String type,int start,int size) ;

    @Select("select * from goodinfo where gid = #{gid}")
    public GoodInfo getGoodDetailInfoById(int gid) ;
    @Delete("delete from goodinfo where gid= #{gid}")
    public int deleteGoodInfo(int gid) ;
    @Options(useGeneratedKeys = true,keyProperty = "gid")// 指定主键
    @Insert("insert into goodinfo(gname,gnewprice,gintroduce,gurl,type,goldprice,topimgurl,sellnum,storenum,introimgurl) " +
            "value(#{gname},#{gnewprice},#{gintroduce},#{gurl},#{type},#{goldprice},#{topimgurl},#{sellnum},#{storenum},#{introimgurl})")
    public int insertGoodInfo(GoodInfo goodInfo) ;
}
