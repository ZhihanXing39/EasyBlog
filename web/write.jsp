<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>写博客</title>
    <link rel="stylesheet" href="style/public.css">
    <link rel="stylesheet" href="style/write.css"/>
</head>
<body>
<jsp:include page="header.jsp"/>
<main>
    <form action="/theBlog/writeServlet" method="get" autocomplete="off">
        <label for="title">标题：</label>
        <input type="text" name="title" id="title" required>
        <label for="blogText">内容：</label>
        <textarea name="text" id="blogText" required></textarea>
        <button type="submit">提交</button>
    </form>
</main>
<jsp:include page="footer.jsp"/>
</body>
</html>
