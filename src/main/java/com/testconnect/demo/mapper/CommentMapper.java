package com.testconnect.demo.mapper;

import com.testconnect.demo.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommentMapper {
    @Select("select * from comment where gid=#{gid}")
    public List<Comment> getCommmetBygid(int gid) ;
}
