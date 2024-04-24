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
<body>
<header>
    <nav>
        <ul>
            <li>
                <a href="index.jsp">首页</a>
            </li>
            <li>
                <a href="/theBlog/selectServlet">看博客</a>
            </li>
            <li>
                <a href="about.jsp">关于我们</a>
            </li>
            <%String username=(String) session.getAttribute("username");
            if (username==null){
            %>
            <li>
                <a href="register.jsp">注册</a>
            </li>
            <li>
                <a href="login.jsp">登录</a>
            </li>
            <%}%>
        </ul>
    </nav>
</header>
</body>
</html>
