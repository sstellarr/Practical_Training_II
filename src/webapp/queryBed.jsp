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

<table border="1" cellspacing="0" width="500">
<tr>
    <th>序号</th>
    <th>房间号</th>
    <th>所在建筑</th>
    <th>是否可用</th>
    <th>使用者编号</th>
    <th>状态</th>
    <th>操作</th>

</tr>

    <c:forEach items="${beds}" var="bed" varStatus="bedstatus">
    <tr >

    <td>${bedstatus.count}</td>
    <td>${bed.roomId}</td>
    <td>${bed.buildingId}</td>
    <td>${bed.userId}</td>
    <c:if test="${bed.isAvailable == 1}">
        <td>启用</td>
    </c:if>
    <c:if test="${bed.isAvailable != 1}">
        <td>禁用</td>
    </c:if>

    <td><a href="/BedServlet/selectById?id=${bed.id}">修改</a>
        <a href="/BedServlet/deleteById?id=${bed.id}">删除</a></td>
    </tr>
    </c:forEach>
    </table>


</body>
</html>