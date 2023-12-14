<%@ page import="edu.zjku.service.BlogService" %>
<%@ page import="edu.zjku.service.BlogServiceImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.zjku.bean.Blog" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的博客主页</title>
    <link rel="stylesheet" href="style/public.css">
    <link rel="stylesheet" href="style/index.css">
    <script src="script/ad.js" async></script>
</head>
<body>
<jsp:include page="header.jsp"/>
<jsp:include page="ad.jsp"/>
<div class="box">
    <%BlogService service = new BlogServiceImpl();%>
    <%List<Blog> blogs =service.selectPass();%>
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
