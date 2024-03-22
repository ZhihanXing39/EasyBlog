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

//这是验证用户是否是管理员的Servlet
@WebServlet("/isRoot")
public class IsRoot extends HttpServlet {
    private BlogService service = new BlogServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Object username = session.getAttribute("username");
        if (username != null) {
            if (username.equals("root")) {
                //读取未通过审核的博客并存入会话域
                List<Blog> list = null;
                list=service.selectUnpass();
                session.setAttribute("unpassBlogs",list);
                //是管理员，跳转到审查页面
                resp.sendRedirect("/theBlog/audit.jsp");
            } else {
                //非管理员，强制返回首页
                resp.getWriter().write("权限不足！2秒后返回首页");
                resp.setHeader("Refresh", "2;URL=/theBlog/index.jsp");
            }
        } else {
            //非管理员，强制返回首页
            resp.getWriter().write("权限不足！2秒后返回首页");
            resp.setHeader("Refresh", "2;URL=/theBlog/index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
