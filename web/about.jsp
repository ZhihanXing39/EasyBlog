<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>关于我们</title>
    <link rel="stylesheet" href="style/about.css"/>
    <link rel="stylesheet" href="style/public.css">
</head>
<body>
<jsp:include page="header.jsp"/>
<main>
    <p>简单博客旨在搭建一个和睦友好的互联网交流平台。</p>
    <p>在这里，用户可以探讨计算机和互联网相关技术的知识，共同努力共同进步。我们也支持大家分享自己遇到的搞笑趣事，一同见证大千世界的奇妙时刻。</p>
    <p>这个博客它可能没有那么美观，可能很多功能还没有完善，但是随着站长技术能力的提升，相信此网站会越来越好的。</p>
    <p>本网站由HTML5搭建基本框架，CSS和Java Script负责排版美化和部分特效。后台使用Java在Intelli
        IDEA进行开发，由servlet获取前台所需要的数据并进行处理，使用Mybatis连接到MySQL进行后台数据存储。</p>
    <p>本网站的所有博客观点仅代表博主个人观点，与网站所有者无关！</p>
</main>
<jsp:include page="footer.jsp"/>
</body>
</html>
