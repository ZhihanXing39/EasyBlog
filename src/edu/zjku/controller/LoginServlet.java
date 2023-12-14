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

//这是处理登录的Servlet
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户登录的信息
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        //核实用户登录信息
        UserService service = new UserServiceImpl();
        List<User> list = service.selectAll();
        //下面是一个用来记录用户是否存在的变量
        boolean exist = false;
        for (User u : list
        ) {
            //判断数据库中是否存在用户名
            if (username.equals(u.getUsername())) {
                //若存在，判断密码是否正确
                exist = true;
                if (password.equals(u.getPassword())) {
                    resp.getWriter().write("欢迎登录，" + username + "！");
                    System.out.println("登录成功！");
                    resp.setHeader("Refresh","2;URL=/theBlog/index.jsp");
                    //将登录信息存入会话域
                    req.getSession().setAttribute("username", username);
                    break;
                } else {
                    resp.getWriter().write("密码错误！");
                    System.out.println("登录失败！");
                    resp.setHeader("Refresh","2;URL=/theBlog/index.jsp");
                    break;
                }
            }
        }
        //用户不存在，输出提示信息
        if (!exist){
            System.out.println("用户不存在！");
            resp.getWriter().write("该用户不存在！");
            resp.setHeader("Refresh","2;URL=/theBlog/index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
