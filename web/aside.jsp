<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>aside</title>
</head>
<body>
<aside>
    <ul>
        <li>
            <%String username=(String) session.getAttribute("username");
            if (username!=null){
            %>
            <p>欢迎您，<%=username%></p>
            <%}%>
        </li>
        <li>
            <p><a href="write.jsp">撰写博客</a></p>
        </li>
        <li>
            <p><a href="/theBlog/myBlogServlet">我的博客</a></p>
        </li>
        <%if (username!=null){
            if (username.equals("root")){%>
        <li>
            <p><a href="/theBlog/isRoot">审核</a></p>
        </li>
        <%}}%>
        <li>
            <p><a href="/theBlog/exitServlet">退出登录</a></p>
        </li>
    </ul>
</aside>
</body>
</html>
