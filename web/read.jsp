<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.zjku.bean.Blog" %>

<html>
<head>
    <title>看博客</title>
    <link rel="stylesheet" href="style/public.css">
    <link rel="stylesheet" href="style/read.css">
    <script src="https://unpkg.zhimg.com/axios/dist/axios.min.js"></script>
    <script src="script/detail.js" async></script>
</head>
<body>
<jsp:include page="header.jsp"/>
<main>
    <!-- 使用c:forEach标签循环显示博客 -->
    <c:forEach var="blog" items="${sessionScope.blogs}">
        <div class="box" data-pid="${blog.pid}">
                ${blog.text}
        </div>
    </c:forEach>
</main>
<jsp:include page="aside.jsp"/>
<jsp:include page="footer.jsp"/>
</body>
</html>