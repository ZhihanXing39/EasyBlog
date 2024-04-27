package edu.zjku.controller;

import edu.zjku.bean.Blog;
import edu.zjku.service.BlogService;
import edu.zjku.service.BlogServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//这是删除博客的Servlet
@WebServlet("/deleteBlog")
public class DeleteBlog extends HttpServlet {
    private BlogService service= new BlogServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取删除的博客信息
        Integer pid=Integer.parseInt(req.getParameter("pid"));
        Blog blog = new Blog();
        blog.setPid(pid);

        //调用方法删除该博客
        service.delete(blog);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
