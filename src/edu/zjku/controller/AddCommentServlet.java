package edu.zjku.controller;

import edu.zjku.bean.Blog;
import edu.zjku.bean.Comment;
import edu.zjku.service.CommentService;
import edu.zjku.service.CommentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//这是添加评论的Servlet
@WebServlet("/addCommentServlet")
public class AddCommentServlet extends HttpServlet {
    private CommentService service = new CommentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        //判断用户是否登录
        Object user = session.getAttribute("username");
        if (user != null) {
            //获取评论信息
            Blog blog = (Blog) session.getAttribute("blogDetail");
            Integer id = blog.getPid();
            String content = req.getParameter("content");
            String username = blog.getUser();

            //封装信息
            Comment comment = new Comment();
            comment.setId(id);
            comment.setContent(content);
            comment.setUsername(username);

            //调用service方法存入数据库
            service.insert(comment);

            //提示信息
            resp.getWriter().write("添加成功！");
            resp.setHeader("Refresh", "2;URL=/theBlog/detail.jsp");
        }else {
            resp.getWriter().write("请登录！");
            resp.setHeader("Refresh", "2;URL=/theBlog/detail.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
