<%@ page import="edu.zjku.bean.Blog" %>
<%@ page import="edu.zjku.service.BlogService" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.zjku.service.BlogServiceImpl" %><%--
  Created by IntelliJ IDEA.
  User: xing
  Date: 2023/12/16
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>审核博客</title>
    <link rel="stylesheet" href="style/public.css">
    <link rel="stylesheet" href="style/index.css">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="box">
    <%BlogService service = new BlogServiceImpl();%>
    <%List<Blog> blogs =service.selectUnpass();%>
    <%for(Blog blog:blogs){%>
    <table>
        <tr><td class="title"><%=blog.getTitle()%></td></tr>
        <tr><td class="text"><%=blog.getText()%></td></tr>
        <tr><td class="user"><%=blog.getUser()%></td></tr>
        <tr><td class="time"><%=blog.getTime()%></td></tr>
    </table>
    <%}%>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
