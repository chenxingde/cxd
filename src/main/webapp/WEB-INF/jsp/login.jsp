<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <link href="../../plug/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css">

    <link href="../../css/login.css" rel="stylesheet" type="text/css">
    <script src="../../plug/jQuery/jquery-1.8.3.min.js" type="text/javascript" ></script>
    <script src="../../js/login.js" type="text/javascript"></script>
    <style type="text/css">
        #yzmCode {
            position:absolute;
            bottom:0;
            right:60px;
            border:1px solid #d9d9d9;
            height: 40px;
            width: 100px;
            background: #f2f2f2;
        }
    </style>
   <script>
       function checkInput() {
            var chenName = $("#chenName").val();
            var zhuName = $("#zhuName").val();
            var yzmCode = $("#yzmCode").val();
            if(chenName == null || chenName == ""){
                alert("请填写陈兴德的手机号");
                return false;
            }
           if(zhuName == null || zhuName == ""){
               alert("请填写祝玉娇的手机号");
               return false;
           }
           if(yzmCode == null || yzmCode == ""){
               alert("请填验证码");
               return false;
           }else if(yzmCode != love){
               alert("验证码有误");
               return false;
           }
       }
       function getCode() {
           alert("love");
       }
   </script>
    <title>陈兴德祝玉姣爱的秘笈登陆</title>
</head>
<body>
<div class="content">
    <form action="/dologin.html" onsubmit="return checkInput();" method="post">
        <input type="hidden" id="code" name = "code">
        <div class="loginbox">
            <div class="leftpart">
                <img src="../images/psb.png" class="loginbg">
                <div class="colorlayer"></div>
                <!--                 <img src="../images/indexlogo.png" class="loginlogo"> -->
<%--                <p class="firstline">欢迎进入</p>--%>
<%--                <p class="secondline"><span style="color: royalblue;">陈兴德祝玉娇管理中心</span></p>--%>
                <p class="thirdline"></p>
            </div>
            <div class="rightpart">
                <h3 class="logintitle">陈兴德祝玉姣爱的秘笈</h3>
                <div class="box">
                    <span>陈兴德</span><input type="text" id="chenName" name="chenName" placeholder="请输入陈兴德手机号" class="username" style="color: rebeccapurple">
                </div>
                <div class="box">
                    <span>祝玉姣</span><input type="password" id="zhuName" name="zhuName" placeholder="请输入祝玉姣手机号" class="userpass" style="color: rebeccapurple">
                </div>
                <div style="position: relative;" class="box">
                    <span>验证码</span><input type="button" value = "获取验证码" onclick="getCode()" id = "yzmCode" class="get">
                    <input type="text" id="registCode" name="yzm" placeholder="请填写验证码" class="username" oninput="checkCode()" style="color: rebeccapurple">
                </div>
                <p class="red">${msg }</p>
                <input type="submit" value="登    录" class="loginbtn" id="smt">
            </div>
        </div>
    </form>
</div>
</body>
</html>
