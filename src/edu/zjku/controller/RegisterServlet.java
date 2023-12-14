package edu.zjku.controller;

import edu.zjku.bean.User;
import edu.zjku.service.UserService;
import edu.zjku.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//这是注册用的Servlet
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取前端信息
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        //判断该用户名是否被占用
        UserService service = new UserServiceImpl();
        List list=service.selectName();
        if (list.contains(username)){
            System.out.println("该用户名已被占用！");
            resp.getWriter().write("用户名"+username+"已被占用！<br>");
            resp.getWriter().write("2秒后返回注册页面");
            resp.setHeader("Refresh","2;URL=/theBlog/register.jsp");
        }else {
            service.insert(user);
            System.out.println("注册成功！");
            resp.getWriter().write("注册成功！2秒后返回首页");
            resp.setHeader("Refresh","2;URL=/theBlog/index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
