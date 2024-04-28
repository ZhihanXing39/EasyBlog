<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>aside</title>
</head>
<body>
<aside>
    <ul>
        <li>
            <!-- 使用EL表达式获取session中的username -->
            <c:if test="${not empty sessionScope.username}">
                <p>欢迎您，${sessionScope.username}</p>
            </c:if>
        </li>
        <li>
            <p><a href="write.jsp">撰写博客</a></p>
        </li>
        <%--如果用户登录再显示其博客--%>
        <c:if test="${not empty sessionScope.username}">
            <li>
                <p><a href="/theBlog/myBlogServlet">我的博客</a></p>
            </li>
        </c:if>
        <!-- 使用EL表达式和JSTL标签判断username是否为root -->
        <c:if test="${not empty sessionScope.username and sessionScope.username == 'root'}">
            <li>
                <p><a href="/theBlog/isRoot">审核</a></p>
            </li>
        </c:if>
        <li>
            <p><a href="/theBlog/exitServlet">退出登录</a></p>
        </li>
    </ul>
</aside>
</body>
</html>