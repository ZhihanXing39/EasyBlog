<%@ page import="java.util.List" %>
<%@ page import="edu.zjku.bean.Blog" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的博客</title>
    <link rel="stylesheet" href="style/public.css">
    <style>
        .container{
            white-space: pre-wrap;
            background-color: teal;
            margin-bottom: 30px;
            padding: 20px;
            border-radius: 20px;
            color: white;
        }
    </style>
</head>
<body>
<jsp:include page="header.jsp"/>
<main>
    <%List<Blog> myBlogs = (List<Blog>) session.getAttribute("myBlogs");
    for(Blog blog:myBlogs){%>
    <div class="container">
        <p><%=blog.getText()%></p>
        <p><%=blog.getTime()%></p>
    </div>
    <%}%>
</main>
<jsp:include page="aside.jsp"/>
<jsp:include page="footer.jsp"/>
</body>
</html>
