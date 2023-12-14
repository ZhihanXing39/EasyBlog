package edu.zjku.mapper;

import edu.zjku.bean.Blog;

import java.util.List;

public interface BlogMapper {
    //查询所有博客
    List<Blog> selectAll();
    //查询通过审核的博客
    List<Blog> selectPass();
    //添加新博客
    void insert(Blog blog);
    //删除单篇博客
    void delete(Blog blog);
    //修改博客
    void update(Blog blog);
}
