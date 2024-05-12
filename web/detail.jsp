<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>博客详情</title>
    <link rel="stylesheet" href="style/public.css"/>
    <link rel="stylesheet" href="style/form.css">
    <script src="https://cdn.jsdelivr.net/npm/marked/marked.min.js"></script>
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
    <%--获取博客及其评论--%>
    <div class="blog">
        <h2>${sessionScope.blogDetail.title}</h2>
        <p id="content">${sessionScope.blogDetail.text}</p>
        <p>${sessionScope.blogDetail.user}</p>
        <p>${sessionScope.blogDetail.time}</p>
    </div>
    <div class="container">
        <form action="/theBlog/addCommentServlet" method="get" autocomplete="off">
            <input type="text" name="content" placeholder="请输入评论" required>
            <button type="submit">提交</button>
        </form>
    </div>
    <c:forEach var="comment" items="${commentList}">
        <div class="comment">
            <p>${comment.content}</p>
            <p>用户：${comment.username}</p>
            <p>时间：${comment.time}</p>
        </div>
    </c:forEach>
</main>
<jsp:include page="aside.jsp"/>
<jsp:include page="footer.jsp"/>
<script>
    //获取博客内容，使用markedjs替换成markdown
    const blogContent = document.getElementById("content");
    let blogHTML = blogContent.innerText;
    function markdownContent(){
        let blogMarkdown = marked.parse(blogHTML);
        blogContent.innerHTML = blogMarkdown;
    }
    markdownContent();
</script>
</body>
</html>
