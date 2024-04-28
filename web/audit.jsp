<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>审核博客</title>
    <link rel="stylesheet" href="style/public.css">
    <style>
        main .box {
            min-height: 200px;
        }

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
    <c:forEach var="blog" items="${unpassBlogs}">
        <div class="box">
            <p>${blog.title}</p>
            <p>${blog.text}</p>
            <p>作者：${blog.user}</p>
            <p>时间：${blog.time}</p>
            <button data-pid="${blog.pid}">通过</button>
        </div>
    </c:forEach>
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
                console.log(err.toJSON());
            })
            .finally(() => {
                location.href = "/theBlog/index.jsp";
            });
    }

    //循环添加事件
    for (let i = 0; i < buttons.length; i++) {
        buttons[i].addEventListener("click", allowBlog);
    }
</script>
</body>
</html>
