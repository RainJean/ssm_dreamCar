<%--
  Created by IntelliJ IDEA.
  User: Ry
  Date: 2017/11/29
  Time: 22:00
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
    <form action="userUpdate" method="post">
        <table border="1" >
            <tr>
                <td align="right">编号：</td>
                <td>
                    <input name="uId" id="uId" value="${users.uId}">
                </td>
            </tr>
            <tr>
                <td align="right">真实姓名：</td>
                <td>
                    <input name="uName" id="uName" value="${users.uName}">
                </td>
            </tr>
            <tr>
                <td align="right">密码：</td>
                <td>
                    <input name="uPassWord" value="${users.uPassWord}">
                </td>
            </tr>
            <tr>
                <td align="right">确认密码：</td>
                <td>
                    <input name="uPassWord" value="${users.uPassWord}">
                </td>
            </tr>
            <tr>
                <td align="right">性别：</td>
                <td>
                    <select name="genderId">
                        <option >${users.gender.gName}</option>
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
                    <input name="uPhone" value="${users.uPhone}">
                </td>
            </tr>
            <tr>
                <td align="right">常住地址：</td>
                <td>
                    <input name="uAddress" value="${users.uAddress}">
                </td>
            </tr>
            <tr>
                <td align="right">出生日期：</td>
                <td>
                    <input name="uBornDate" value="${users.uBornDate}" type="date">
                </td>
            </tr>

            <tr>
                <td align="right">Email：</td>
                <td>
                    <input name="uEmail" value="${users.uEmail}">
                </td>
            </tr>
            <tr>
                <td align="right">身份证号：</td>
                <td>
                    <input name="uIdentityCard" value="${users.suIdentityCard}">
                </td>
            </tr>

            <tr><td colspan="2" align="center">
                <input type="submit" value="修改">
                <input type="button" onclick="location.href='touserSelect';" value="返回">
            </td></tr>
        </table>
    </form>
</center>
</body>
</html>
