//这是更改评论盒子背景色的脚本
document.addEventListener('DOMContentLoaded', function() {
    let box = document.querySelectorAll(".comment");
    for (let i = 0; i < box.length; i++) {
        setRandomBackgroundColor(box[i]);
    }
});

//随机背景色函数
function setRandomBackgroundColor(element) {
    let letters = '0123456789ABCDEF';
    let color = '#';
    for (let i = 0; i < 6; i++) {
        color += letters[Math.floor(Math.random() * 16)];
    }
    element.classList.add(".comment-random-bg");
    element.style.backgroundColor = color;
}