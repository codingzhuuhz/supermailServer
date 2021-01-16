package com.testconnect.demo.service;

import com.testconnect.demo.entity.Comment;

import java.util.List;

public interface CommentService {
    public List<Comment> getCommentBygid(int gid) ;
}
