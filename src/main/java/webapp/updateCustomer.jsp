<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <meta charset="utf-8" />
    <title>护理等级增添页面</title>
    <!--可写在html中任何地方-->
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>

    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
          crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed"
                    data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
                    aria-expanded="false">
                <span class="sr-only">Toggle navigation</span> <span
                    class="icon-bar"></span> <span class="icon-bar"></span> <span
                    class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index2.html">东软颐养中心</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse"
             id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="index2.html">主页
                    <span class="sr-only">(current)</span>
                </a></li>
                <li class="dropdown"><a href="#" class="dropdown-toggle"
                                        data-toggle="dropdown" role="button" aria-haspopup="true"
                                        aria-expanded="false">用户管理 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="addCustomer.jsp">添加用户</a></li>
                        <li><a href="/CustomerServlet/selectAll">查询用户</a></li>
                    </ul></li>
                <li class="dropdown"><a href="#" class="dropdown-toggle"
                                        data-toggle="dropdown" role="button" aria-haspopup="true"
                                        aria-expanded="false">员工管理 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="addStaff.jsp">添加员工</a></li>
                        <li><a href="/StaffServlet/selectAll">查询员工</a></li>
                    </ul>
                </li>








            </ul>


        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container-fluid -->
</nav>
<h3>修改客户信息</h3>
<form action="/CustomerServlet/update" method="post">

    <%--隐藏域，提交id--%>
    <input type="hidden" name="id" value="${customer.id}">


        姓名：<input name="name" value="${customer.name}"><br>
        性别：<input name="gender" value="${customer.gender}"><br>
        年龄：<input name="age" value="${customer.age}"><br>
        电话：<input name="tel" value="${customer.tel}"><br>
        身份证号：<input name="idCardNumber" value="${customer.idCardNumber}"><br>
        档案编号：<input name="fileNumber" value="${customer.fileNumber}"><br>
        用户名：<input name="account" value="${customer.account}"><br>
        密码：<input name="password" value="${customer.password}"><br>
        身高：<input name="height" value="${customer.height}"><br>
        生日：<input name="birthday" value="${customer.birthday}"><br>





    <input type="submit" value="提交">
</form>
</body>
</html>

