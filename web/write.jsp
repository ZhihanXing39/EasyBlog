<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>写博客</title>
    <link rel="stylesheet" href="style/write.css"/>
    <script src="script/ad.js" async></script>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="box">
    <form action="/theBlog/writeServlet" method="get" autocomplete="off">
        标题：<input type="text" name="title" required><br> 内容：
        <textarea name="text" id="" cols="30" rows="10" required></textarea>
        <button type="submit">提交</button>
    </form>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
