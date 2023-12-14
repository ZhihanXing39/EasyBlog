package edu.zjku.controller;

import edu.zjku.bean.Blog;
import edu.zjku.bean.User;
import edu.zjku.service.BlogService;
import edu.zjku.service.BlogServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//这是写入博客的Servlet
@WebServlet("/writeServlet")
public class WriteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BlogService service = new BlogServiceImpl();
        HttpSession session = req.getSession();
        Object username = session.getAttribute("username");
        if (username != null) {
            //获取前台输入的信息
            String title = req.getParameter("title");
            String text = req.getParameter("text");
            //从Session域读取username并转换成字符串
            String user = String.valueOf(username);
            Blog blog = new Blog();
            //封装数据
            blog.setTitle(title);
            blog.setText(text);
            blog.setUser(user);
            //写入数据库
            service.insert(blog);
            //显示提示信息
            resp.getWriter().write("保存成功！审核通过后显示");
            resp.setHeader("Refresh","2;URL=/theBlog/index.jsp");
        }else {
            resp.getWriter().write("请先登录！");
            resp.setHeader("Refresh","2;URL=/theBlog/index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
