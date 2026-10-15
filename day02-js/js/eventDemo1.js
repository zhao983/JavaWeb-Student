//想要导入其他js文件需要import来导入

//click鼠标点击事件

import {printLog} from "./utils.js";

document.querySelector('#b2').addEventListener('click', () => {
    printLog('点击事件触发')

});

//mouseenter鼠标移入
document.querySelector('#last').addEventListener('mouseenter', function () {
    this.style.backgroundColor = '#b0c9ed';
})

//mouseleave鼠标移除
document.querySelector('#last').addEventListener('mouseleave', function () {
    this.style.backgroundColor = '#fff';
})

//keydown某个按键被按下
document.querySelector('#username').addEventListener('keydown', function () {
    console.log('按键按下');
})

//keyup某个按键被抬起
document.querySelector('#username').addEventListener('keyup', function () {
    console.log('按键抬起');
})

//blur失去焦点
document.querySelector('#age').addEventListener('blur', function () {
    console.log('失去焦点');
})

//focus获得焦点
document.querySelector('#age').addEventListener('focus', function () {
    console.log('获得焦点');
})

//input用户输入时触发
document.querySelector('#age').addEventListener('input', function () {
    console.log('用户输入了');
})

//submit提交表单事件 提交的为整个表单，所以对象应该为form
// submit 事件是绑定在 <form> 表单元素上的，而不是绑定在 <input type="submit"> 按钮上的。
document.querySelector('form').addEventListener('submit', function () {
    alert('表单提交了');
})