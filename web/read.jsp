<%@ page import="java.util.List" %>
<%@ page import="edu.zjku.bean.Blog" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>看博客</title>
    <link rel="stylesheet" href="style/public.css">
    <style>
        main .box{
            height: 100px;
        }
    </style>
</head>
<body>
<jsp:include page="header.jsp"/>
<main>
    <%
        //从会话域获取所有博客
        List<Blog> blogs = (List<Blog>) session.getAttribute("blogs");
        //循环显示所有博客
        for (Blog blog : blogs) {%>
    <div class="box">
        <p><%=blog.getText()%>
        </p>
    </div>
    <%}%>
</main>
<jsp:include page="aside.jsp"/>
<jsp:include page="footer.jsp"/>
</body>
</html>
