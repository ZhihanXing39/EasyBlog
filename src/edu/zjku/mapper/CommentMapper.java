package edu.zjku.mapper;

import edu.zjku.bean.Comment;

import java.util.List;

public interface CommentMapper {
    //查询所有评论
    List<Comment> select();
    //查询指定博客评论
    List<Comment> selectById(String id);
    //填加评论
    void insert(Comment comment);
}
