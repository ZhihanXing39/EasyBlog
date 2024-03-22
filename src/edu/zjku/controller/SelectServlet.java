package edu.zjku.controller;

import edu.zjku.bean.Blog;
import edu.zjku.service.BlogService;
import edu.zjku.service.BlogServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

//这是查询所有博客的Servlet
@WebServlet("/selectServlet")
public class SelectServlet extends HttpServlet {
    private BlogService service = new BlogServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //读取数据并封装
        List<Blog> blogs = null;
        blogs=service.selectPass();
        //存入会话域给看博客页面使用
        HttpSession session= req.getSession();
        session.setAttribute("blogs",blogs);
        //跳转到看博客页面
        resp.sendRedirect("/theBlog/read.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
