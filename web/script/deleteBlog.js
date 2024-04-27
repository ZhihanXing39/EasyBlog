//这是通过AJAX调用删除博客的脚本
let buttons = document.querySelectorAll(".container button");

//通过AJAX调用Servlet的函数
function deleteBlog() {
    axios.get("/theBlog/deleteBlog?pid=" + this.getAttribute("data-pid"))
        .then(res => {
            console.log("传递成功！HTTP状态码：" + res.status);
            location.href="/theBlog/index.jsp";
        })
        .catch(err => {
            console.log("发生错误！HTTP状态码：" + err.response.status + " 详细信息：");
            console.log(err.toJSON());
        })
        .finally(() => {
            console.log("执行完毕！");
        });
}

//添加响应事件
for (let i = 0; i < buttons.length; i++) {
    buttons[i].addEventListener("click",deleteBlog);
}