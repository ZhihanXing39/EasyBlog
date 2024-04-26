<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>写博客</title>
    <link rel="stylesheet" href="style/public.css">
    <style>
        .container {
            margin: 0 auto;
            width: 600px;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .container input[type="text"],
        .container input[type="password"],
        .container textarea{
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
            margin-bottom: 15px;
            transition: border 0.3s;
        }

        .container input[type="text"]:focus,
        .container input[type="password"]:focus {
            border: 1px solid #5cb85c;
        }
        .container textarea{
            height: 300px;
        }
        .container button {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .container button:hover {
            background-color: #45a049;
        }

        .container .error {
            color: red;
            font-size: 14px;
            margin-top: 5px;
        }
    </style>
</head>
<body>
<jsp:include page="header.jsp"/>
<main>
    <div class="container">
        <form action="/theBlog/writeServlet" method="get" autocomplete="off">
            <label for="title">标题：</label>
            <input type="text" name="title" id="title" required>
            <label for="blogText">内容：</label>
            <textarea name="text" id="blogText" required></textarea>
            <button type="submit">提交</button>
        </form>
    </div>
</main>
<jsp:include page="footer.jsp"/>
</body>
</html>
