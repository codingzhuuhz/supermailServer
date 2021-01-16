package com.testconnect.demo.entity;

public class Comment {
    private int commentId ;
    private String commentName ;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getCommentName() {
        return commentName;
    }

    public void setCommentName(String commentName) {
        this.commentName = commentName;
    }

    public String getCommentImgUrl() {
        return commentImgUrl;
    }

    public void setCommentImgUrl(String commentImgUrl) {
        this.commentImgUrl = commentImgUrl;
    }

    public String getCommentVideoUrl() {
        return commentVideoUrl;
    }

    public void setCommentVideoUrl(String commentVideoUrl) {
        this.commentVideoUrl = commentVideoUrl;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    private String commentImgUrl ;
    private String commentVideoUrl ;
    private int gid ;
    private String commentContent ;
}
