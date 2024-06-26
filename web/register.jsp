<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <link rel="stylesheet" href="style/public.css">
    <link rel="stylesheet" href="style/form.css">
    <script src="script/confirm_password.js" async></script>
</head>
<body>
<jsp:include page="header.jsp"/>
<main>
    <!-- 用来处理注册的信息 -->
    <div class="container">
        <h2>注册</h2>
        <form action="/theBlog/registerServlet" method="post" autocomplete="off" accept-charset="UTF-8">
            <label for="username">用户名：</label>
            <input type="text" name="username" placeholder="请输入用户名" id="username" required>
            <label for="password">密码：</label>
            <input type="password" name="password" placeholder="请输入密码" id="password" required>
            <label for="confirm_password">确认密码：</label>
            <input type="password" name="passwordc" placeholder="请确认密码" id="confirm_password" required>
            <button type="submit">注册</button>
        </form>
    </div>
</main>
<jsp:include page="footer.jsp"/>
</body>
</html>
