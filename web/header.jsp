<%--
  Created by IntelliJ IDEA.
  User: xing
  Date: 2023/10/22
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://unpkg.zhimg.com/axios/dist/axios.min.js"></script>
    <style>
        * {
            padding: 0;
            margin: 0;
            box-sizing: border-box;
        }

        header {
            height: 100px;
            background-color: #3498db;
            font-size: .16rem;
        }

        header .logo {
            margin: 0 auto;
            height: 70px;
            aspect-ratio: 10/7;
        }

        header .logo img {
            width: 100%;
        }

        header nav {
            height: 30px;
            display: flex;
            justify-content: center;
            background-color: #2c3e50;
        }

        header nav a {
            color: white;
            text-decoration: none;
        }

        header nav a:hover {
            color: deepskyblue;
            font-weight: 600;
        }

        header nav ul {
            height: 30px;
            display: flex;
            align-items: center;
            gap: 20px;
        }

        header nav ul li {
            list-style: none;
        }

        header nav ul li img {
            width: 20px;
            height: 20px;
        }
    </style>
<body>
<header>
    <div class="logo"><img src="images/logo.png" alt=""></div>
    <nav>
        <ul>
            <li>
                <a href="index.jsp"><img src="images/index.png" alt="" class="navpic">首页</a>
            </li>
            <li>
                <img src="images/read.png" alt=""><a href="/theBlog/selectServlet">看博客</a>
            </li>
            <li>
                <a href="write.jsp"><img src="images/write.png" alt="" class="navpic">写博客</a>
            </li>
            <li>
                <a href="about.jsp"><img src="images/about.png" alt="" class="navpic">关于我们</a>
            </li>
            <li>
                <a href="register.jsp"><img src="images/register.png" alt="" class="navpic">登录/注册</a>
            </li>
            <li>
                <a href="/theBlog/isRoot"><img src="images/audit.png" alt="">审核</a>
            </li>
            <li>
                <a href="/theBlog/exitServlet">退出</a>
            </li>
        </ul>
    </nav>
</header>
</body>
</html>
