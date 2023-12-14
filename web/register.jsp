<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录和注册</title>
    <link rel="stylesheet" href="style/register.css"/>
    <script src="script/ad.js" async></script>
    <script src="script/confirm_password.js" async></script>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="box">
    <!-- 用来处理登录的信息 -->
    <div class="login">
        <p>在此登录</p>
        <form action="/theBlog/loginServlet" method="get" autocomplete="off">
            用户名：<input type="text" name="username" placeholder="请输入用户名" required><br> 密码：
            <input type="password" name="password" placeholder="请输入密码" required><br>
            <button type="submit">登录</button>
        </form>
    </div>
    <!-- 用来处理注册的信息 -->
    <div class="register">
        <p>没有账号？立即注册</p>
        <form action="/theBlog/registerServlet" method="get" autocomplete="off">
            用户名：<input type="text" name="username" placeholder="请输入用户名" required><br>
            密码：<input type="password" name="password" placeholder="请输入密码" id="password" required><br>
            确认密码：<input type="password" name="passwordc" placeholder="请确认密码" id="confirm_password" required><br>
            <button type="submit">注册</button>
        </form>
    </div>
</div>
<jsp:include page="ad.jsp"/>
<jsp:include page="footer.jsp"/>
</body>
</html>
