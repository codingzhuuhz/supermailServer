package com.testconnect.demo.service.impl;

import com.testconnect.demo.entity.Comment;
import com.testconnect.demo.mapper.CommentMapper;
import com.testconnect.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper ;
    @Override
    public List<Comment> getCommentBygid(int gid) {
        return commentMapper.getCommmetBygid(gid);
    }
}
