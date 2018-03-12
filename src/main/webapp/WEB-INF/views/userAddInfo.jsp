<%--
  Created by IntelliJ IDEA.
  User: Ry
  Date: 2018/1/11
  Time: 21:59
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
    <h2>添加会员信息</h2>
    <form action="userAdd" method="post">
        <table border="1" >
            <tr>
                <td align="right">真实姓名：</td>
                <td>
                    <input name="uName" id="uName">
                </td>
            </tr>
            <tr>
                <td align="right">请输入密码：</td>
                <td>
                    <input name="uPassWord" type="password">
                </td>
            </tr>
            <tr>
                <td align="right">请再次输入密码：</td>
                <td>
                    <input name="uPassWord" type="password">
                </td>
            </tr>
            <tr>
                <td align="right">性别：</td>
                <td>
                    <select name="genderId">
                        <option >请选择</option>
                        <c:forEach items="${genders}" var="g" >
                            <option value="${g.gId}">
                                    ${g.gName}
                            </option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td align="right">联系电话：</td>
                <td>
                    <input name="uPhone">
                </td>
            </tr>
            <tr>
                <td align="right">常住地址：</td>
                <td>
                    <input name="uAddress">
                </td>
            </tr>
            <tr>
                <td align="right">出生日期：</td>
                <td>
                    <input name="uBornDate" type="date">
                </td>
            </tr>

            <tr>
                <td align="right">Email：</td>
                <td>
                    <input name="uEmail">
                </td>
            </tr>
            <tr>
                <td align="right">身份证号：</td>
                <td>
                    <input name="uIdentityCard">
                </td>
            </tr>

            <tr><td colspan="2" align="center">
                <input type="submit" value="确定">
                <input type="button" onclick="location.href='todreamcar';" value="返回">
            </td></tr>
        </table>
    </form>
</center>
</body>
</html>
