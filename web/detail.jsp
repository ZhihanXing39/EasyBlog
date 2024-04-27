<%@ page import="java.util.List" %>
<%@ page import="edu.zjku.bean.Comment" %>
<%@ page import="edu.zjku.bean.Blog" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>博客详情</title>
    <link rel="stylesheet" href="style/public.css"/>
    <link rel="stylesheet" href="style/form.css">
    <style>
        .blog{
            white-space: pre-wrap;
        }
        .comment {
            display: flex;
            align-items: center;
            margin: 20px auto;
            padding-left: 20px;
            width: 100%;
            height: 50px;
            color: #fff;
            line-height: 50px;
            text-align: center;
            background: teal;
            clip-path: polygon(0 0, 88% 0, 88% 35%, 95% 50%, 88% 65%, 88% 100%, 0 100%);
            border: 1px solid teal;
        }
    </style>
</head>
<body>
<jsp:include page="header.jsp"/>
<main>
    <%--    从会话域获取博客及其评论--%>
    <%
        Blog blog = (Blog) session.getAttribute("blogDetail");
        List<Comment> commentList = (List<Comment>) session.getAttribute("commentList");%>
    <div class="blog">
        <h2><%=blog.getTitle()%>
        </h2>
        <p><%=blog.getText()%>
        </p>
        <p><%=blog.getUser()%>
        </p>
        <p><%=blog.getTime()%>
        </p>
    </div>
    <div class="container">
        <form action="/theBlog/addCommentServlet" method="get" autocomplete="off">
            <input type="text" name="content" placeholder="请输入评论" required>
            <button type="submit">提交</button>
        </form>
    </div>
    <%
        for (Comment comment : commentList) {
    %>
    <div class="comment">
        <p><%=comment.getContent()%>
        </p>
        <p><%=comment.getUsername()%>
        </p>
        &nbsp;
        <p><%=comment.getTime()%>
        </p>
    </div>
    <%}%>
</main>
<jsp:include page="aside.jsp"/>
<jsp:include page="footer.jsp"/>
</body>
</html>
