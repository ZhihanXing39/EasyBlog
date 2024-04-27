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

//这是展示单个用户所有博客的Servlet
@WebServlet("/myBlogServlet")
public class MyBlogServlet extends HttpServlet {
    private BlogService service = new BlogServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户信息
        HttpSession session = req.getSession();
        String username = (String) session.getAttribute("username");

        //调用service方法，获取当前用户博客并存入会话域
        List<Blog> myBlogs = service.selectByUsername(username);
        session.setAttribute("myBlogs",myBlogs);

        resp.sendRedirect("/theBlog/myBlogs.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
