<%@ page import="edu.zjku.bean.Blog" %>
<%@ page import="edu.zjku.service.BlogService" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.zjku.service.BlogServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>审核博客</title>
    <link rel="stylesheet" href="style/public.css">
    <script src="https://unpkg.zhimg.com/axios/dist/axios.min.js"></script>
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
        List<Blog> unpassBlogs = (List<Blog>) session.getAttribute("unpassBlogs");
        for (Blog blog : unpassBlogs) {
    %>
    <div class="box">
        <p><%=blog.getTitle()%>
        </p>
        <p><%=blog.getText()%>
        </p>
        <p><%=blog.getUser()%>
        </p>
        <p><%=blog.getTime()%>
        </p>
        <button data-pid="<%=blog.getPid()%>">通过</button>
    </div>
    <%}%>
</main>
<jsp:include page="footer.jsp"/>
<script>
    //通过ajax实现点击按钮通过审核功能
    let buttons = document.querySelectorAll(".box button");
    //审核通过函数
    function allowBlog() {
        axios.get("/theBlog/allowServlet?pid=" + this.getAttribute("data-pid"))
            .then(res => {
                console.log("传递成功！HTTP状态码：" + res.status);
            })
            .catch(err => {
                console.log("发生错误！HTTP状态码：" + err.response.status + " 详细信息：");
                console.log(error.toJSON());
            })
            .finally(() => {
                location.href = "/theBlog/index.jsp";
            });
    }

    //循环添加事件
    for (let i = 0; i < buttons.length; i++) {
        buttons[i].addEventListener("click",allowBlog);
    }
</script>
</body>
</html>
