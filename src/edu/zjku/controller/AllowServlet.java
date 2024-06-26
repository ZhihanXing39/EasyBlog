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

@WebServlet("/allowServlet")
public class AllowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取博客ID
        String blogId = req.getParameter("pid");
        //修改相应博客审核状态
        BlogService service = new BlogServiceImpl();
        Blog blog = service.selectById(blogId);
        service.allow(blog);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
