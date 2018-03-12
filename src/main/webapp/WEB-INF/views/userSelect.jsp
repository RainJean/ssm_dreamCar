<%--
  Created by IntelliJ IDEA.
  User: Ry
  Date: 2017/11/26
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
<table border="1">
    <h2>用户信息列表</h2>
    <tr>
        <td colspan="10" align="right"><a href="todreamcar">返回首页</a></td></tr>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>密码</td>
        <td>性别</td>
        <td>联系电话</td>
        <td>常住地址</td>
        <td>出生日期</td>
        <td>身份证号</td>
        <td>Email</td>
        <td>操作</td>
    <tr/>

    <c:forEach items="${userList}" var="u">
        <tr>
            <td>${u.uId}</td>
            <td>${u.uName}</td>
            <td>${u.uPassWord}</td>
            <td>${u.gender.gName}</td>
            <td>${u.uPhone}</td>
            <td>${u.uAddress}</td>
            <td>${u.uBornDate}</td>
            <td>${u.uIdentityCard}</td>
            <td>${u.uEmail}</td>
            <td><a href="" onclick="return confirm('确定要删除ID为:${u.uId}的数据吗？')">删除</a>
                <input type="hidden" id="uid" name="uid" value="${u.uId}"/>
                <a href="touserUpdate">修改</a>
            </td>
        </tr>
    </c:forEach>

</table>

</center>
</body>
</html>
