<%--
  Created by IntelliJ IDEA.
  User: Ry
  Date: 2018/1/8
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录</title>
</head>
<body>
<center>
    <form action="adminLogin" method="post">
        <table>
            <tr>
                <td>账号：</td>
                <td><input type="text" name="aName"/></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="aPassWord"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input value="登录" type="submit"/>
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
