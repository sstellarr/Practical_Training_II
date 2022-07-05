<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<!doctype html>
<!DOCTYPE html>
<html>
<head>
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <meta charset="utf-8" />
    <title>添加床位页面</title>
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
            <a class="navbar-brand" href="index1.html">东软颐养中心</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse"
             id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="index1.html">主页
                    <span class="sr-only">(current)</span>
                </a></li>
                <li class="dropdown"><a href="#" class="dropdown-toggle"
                                        data-toggle="dropdown" role="button" aria-haspopup="true"
                                        aria-expanded="false">护理级别 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="addNursingLevel.jsp">添加护理级别</a></li>
                        <li><a href="/NursingLevelServlet/selectAll">查询护理级别</a></li>
                    </ul></li>
                <li class="dropdown"><a href="#" class="dropdown-toggle"
                                        data-toggle="dropdown" role="button" aria-haspopup="true"
                                        aria-expanded="false">护理记录 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="addNursingRecord.jsp">增加护理记录</a></li>
                        <li><a href="/NursingRecordServlet/selectAll">查询护理记录</a></li>
                    </ul>
                </li>

                <li class="dropdown"><a href="#" class="dropdown-toggle"
                                        data-toggle="dropdown" role="button" aria-haspopup="true"
                                        aria-expanded="false">床位管理 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="addBed.jsp">添加床位</a></li>
                        <li><a href="/BedServlet/selectAll">查询床位内容</a></li>
                    </ul>
                </li>

                <li class="dropdown"><a href="#" class="dropdown-toggle"
                                        data-toggle="dropdown" role="button" aria-haspopup="true"
                                        aria-expanded="false">膳食管理 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="addFoodRecord.jsp">增加膳食记录</a></li>
                        <li><a href="/FoodRecordServlet/selectAll">查询膳食记录</a></li>
                    </ul>
                </li>
                <li class="dropdown"><a href="#" class="dropdown-toggle"
                                        data-toggle="dropdown" role="button" aria-haspopup="true"
                                        aria-expanded="false">入住管理 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="addCustomerCheckIn.jsp">添加入住登记</a></li>
                        <li><a href="/CustomerCheckInServlet/selectAll">查询入住登记</a></li>
                    </ul>
                </li>
                <li class="dropdown"><a href="#" class="dropdown-toggle"
                                        data-toggle="dropdown" role="button" aria-haspopup="true"
                                        aria-expanded="false">退住管理 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="addCustomerCheckOut.jsp">添加退住登记</a></li>
                        <li><a href="/CustomerCheckOutServlet/selectAll">查询退住登记</a></li>
                    </ul>
                </li>
                <li class="dropdown"><a href="#" class="dropdown-toggle"
                                        data-toggle="dropdown" role="button" aria-haspopup="true"
                                        aria-expanded="false">外出管理 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="addCustomerGoOut.jsp">添加外出登记</a></li>
                        <li><a href="/CustomerGoOutServlet/selectAll">查询外出登记</a></li>
                    </ul>
                </li>







            </ul>


        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container-fluid -->
</nav>
<h3>修改外出信息</h3>
<form action="/CustomerGoOutServlet/update" method="post">

    <%--隐藏域，提交id--%>
    <input type="hidden" name="id" value="${customercheckgouout.id}">

        外出原因：<input name="outGoingReason" value="${customercheckgouout.outGoingReason}"><br>
        外出时间：<input name="outGoingTime" value="${customercheckgouout.outGoingTime}"><br>
        预期返回时间：<input name="expectedReturnTime" value="${customercheckgouout.expectedReturnTime}"><br>
        实际返回时间：<input name="actualReturnTime" value="${customercheckgouout.actualReturnTime}"><br>
        陪同人：<input name="escort" value="${customercheckgouout.escort}"><br>
        陪同人电话：<input name="escortTel" value="${customercheckgouout.escortTel}"><br>
        外出客户Id：<input name="customerId" value="${customercheckgouout.customerId}"><br>



        <input type="submit" value="提交">
</form>
</body>
</html>

