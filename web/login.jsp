<%--
  Created by IntelliJ IDEA.
  User: xing
  Date: 2024/4/23
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="style/public.css">
    <link rel="stylesheet" href="style/form.css">
</head>
<body>
<jsp:include page="header.jsp"/>
<main>
    <div class="container">
        <h2>登录</h2>
        <form action="/theBlog/loginServlet" method="post" autocomplete="off" accept-charset="UTF-8">
            <label for="username">用户名：</label>
            <input type="text" name="username" placeholder="请输入用户名" id="username" required>
            <label for="password">密码：</label>
            <input type="password" name="password" placeholder="请输入密码" id="password" required>
            <button type="submit">登录</button>
        </form>
    </div>
</main>
<jsp:include page="footer.jsp"/>
</body>
</html>
