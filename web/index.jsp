<%@ page import="edu.zjku.service.BlogService" %>
<%@ page import="edu.zjku.service.BlogServiceImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.zjku.bean.Blog" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的博客主页</title>
    <link rel="stylesheet" href="style/public.css">
</head>
<body>
<jsp:include page="header.jsp"/>
<main></main>
<aside>
    <ul>
        <li>
            <p>欢迎您，Zhihan</p>
        </li>
        <li>
            <p><a href="write.jsp">撰写博客</a></p>
        </li>
        <li>
            <p>我的博客</p>
        </li>
        <li>
            <p><a href="/exitServlet"></a>退出登录</p>
        </li>
    </ul>
</aside>
<jsp:include page="footer.jsp"/>
</body>
</html>
