<%@ page import="edu.zjku.bean.Blog" %>
<%@ page import="edu.zjku.service.BlogService" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.zjku.service.BlogServiceImpl" %>
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
    <%--    判断用户是否为管理员--%>
    <%
        Object username = session.getAttribute("username");
        if (username != null) {
            if (username.equals("root")) {
                //展示审核内容，执行操作
                BlogService service = new BlogServiceImpl();
                List<Blog> blogs = service.selectUnpass();
                for (Blog blog : blogs) {%>
    <table>
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
    </table>
    <%
                }
            } else {
                //非管理员，强制返回首页
                response.getWriter().write("权限不足！2秒后返回首页");
                response.setHeader("Refresh", "2;URL=/theBlog/index.jsp");
            }
        }
    %>

</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
