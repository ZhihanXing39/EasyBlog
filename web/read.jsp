<%@ page import="java.util.List" %>
<%@ page import="edu.zjku.bean.Blog" %><%--
  Created by IntelliJ IDEA.
  User: xing
  Date: 2024/3/20
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>看博客</title>
    <link rel="stylesheet" href="style/public.css">
    <style>
        .box p:nth-of-type(1) {
            text-align: center;
        }

        .box p:nth-of-type(2) {
            white-space: pre-wrap;
        }

        .box p:nth-of-type(3),
        .box p:nth-of-type(4) {
            text-align: right;
        }
    </style>
</head>
<body>
<jsp:include page="header.jsp"/>
<main>
    <%
        //从会话域获取所有博客
        List<Blog> blogs = (List<Blog>) session.getAttribute("blogs");
        //循环显示所有博客
        for (Blog blog : blogs) {%>
    <div class="box">
        <p><%=blog.getTitle()%>
        </p>
        <p><%=blog.getText()%>
        </p>
        <p><%=blog.getUser()%>
        </p>
        <p><%=blog.getTime()%>
        </p>
    </div>
    <%}%>
    <%--        这是控制分页的控件--%>
    <div class="page">
        <button class="prev">上一页</button>
        <button class="next">下一页</button>
    </div>
</main>
<jsp:include page="footer.jsp"/>
<script>
    //这是控制分页的JS
    //获取分页控件
    let prev = document.querySelector(".page .prev");
    let next = document.querySelector(".page .next");

    //传递分页信息
    let pageNumber = 1;
    let linesPerPage = 2;

    function prevPage() {
        pageNumber -= 1;
        let url = `/theBlog/selectServlet?pageNumber=${pageNumber}&linesPerPage=${linesPerPage}`;
        axios.get(url)
            .then(function (response) {
                console.log(response);
            })
            .catch(function (error) {
                console.log(error);
            })
            .finally(function () {
                console.log("运行结束！");
            })
    }

    function nextPage() {
        pageNumber += 1;
        let url = `/theBlog/selectServlet?pageNumber=${pageNumber}linesPerPage=${linesPerPage}`;
        axios.get(url)
            .then(function (response) {
                console.log(response);
            })
            .catch(function (error) {
                console.log(error);
            })
            .finally(function () {
                console.log("运行结束！");
            })
    }

    //添加响应事件
    prev.addEventListener("click", prevPage);
    next.addEventListener("click", nextPage);
</script>
</body>
</html>
