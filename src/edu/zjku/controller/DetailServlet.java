package edu.zjku.controller;

import edu.zjku.bean.Blog;
import edu.zjku.bean.Comment;
import edu.zjku.service.BlogService;
import edu.zjku.service.BlogServiceImpl;
import edu.zjku.service.CommentService;
import edu.zjku.service.CommentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

//这是展示博客详情的Servlet
@WebServlet("/detailServlet")
public class DetailServlet extends HttpServlet {
    private BlogService service=new BlogServiceImpl();
    private CommentService commentService = new CommentServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //读取用户选择的博客
        String pid=req.getParameter("pid");

        //查询相应的博客和评论，存入会话域
        Blog blog =service.selectById(pid);
        List<Comment> commentList = commentService.selectById(pid);
        HttpSession session = req.getSession();
        session.setAttribute("blogDetail",blog);
        session.setAttribute("commentList",commentList);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
