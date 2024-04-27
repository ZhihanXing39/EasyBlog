package edu.zjku.mapper;

import edu.zjku.bean.Blog;

import java.util.List;

public interface BlogMapper {
    //根据用户名查询
    List<Blog> selectByUsername(String username);
    //查询博客数量
    int selectCount();
    //分页查询博客
    List<Blog> selectByPage(int pageNumber,int linesPerPage);
    //查询所有博客
    List<Blog> selectAll();
    //查询未通过审核的博客
    List<Blog> selectUnpass();
    //查询通过审核的博客
    List<Blog> selectPass();
    //根据id查询博客
    Blog selectById(String pid);
    //添加新博客
    void insert(Blog blog);
    //删除单篇博客
    void delete(Blog blog);
    //修改博客
    void update(Blog blog);
    //审核通过博客
    void allow(Blog blog);
}
