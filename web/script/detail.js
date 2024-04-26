/*
* 这个脚本的作用是通过Ajax将
* 用户选择的博客信息传递到会话域
* 这个过程是通过调用后台的detailServlet实现的
* */

//获取所有博客盒子元素
const boxes = document.querySelectorAll(".box");

//通过Ajax（axios）传递博客序号，调用Servlet
function detail(){
    axios.get("/theBlog/detailServlet?pid=" + this.getAttribute("data-pid"))
        .then(res => {
            console.log("传递成功！HTTP状态码：" + res.status);
            location.href = "/theBlog/detail.jsp";
        })
        .catch(err => {
            console.log("发生错误！HTTP状态码：" + err.response.status + " 详细信息：");
            console.log(err.toJSON());
        })
        .finally(() => {
            console.log("运行完毕！");
        });
}

//循环添加响应事件
for (let i = 0; i < boxes.length; i++) {
    boxes[i].addEventListener("click",detail);
}