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
</head>
<body>
<jsp:include page="header.jsp"/>
<main>
    <%
        int pageNum = 1;
        int linesPerPage = 3;
    %>
    <%BlogService service = new BlogServiceImpl();%>
    <%List<Blog> blogs = service.selectByPage(pageNum,linesPerPage);%>
    <table>
    <%for (Blog blog : blogs) {%>
        <tr>
            <td class="title"><%=blog.getTitle()%>
            </td>
        </tr>
        <tr>
            <td class="text"><%=blog.getText()%>
            </td>
        </tr>
        <tr>
            <td class="user"><%=blog.getUser()%>
            </td>
        </tr>
        <tr>
            <td class="time"><%=blog.getTime()%>
            </td>
        </tr>
    <%}%>
    </table>
    <div class="page">
        <a href="">上一页</a>
        <span><%=pageNum%></span>
        <a href="<%pageNum += 1;%>">下一页</a>
    </div>
</main>
<jsp:include page="footer.jsp"/>
</body>
</html>
