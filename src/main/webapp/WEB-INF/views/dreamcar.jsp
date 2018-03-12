<%--
  Created by IntelliJ IDEA.
  User: Ry
  Date: 2018/1/6
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>梦想租车 一家专做私家车租赁的网站</title>
</head>
<style>
    .mdzc_xc{
        position: relative;
        left: 300px;
        top: 1000px;
    }
</style>
<body>
<div class="mdzc_xc">

    <span id="s_quche">取车</span>
    <select name="shengfenId">
        <option>请选择</option>
        <c:forEach items="${shengfen}" var="s" >
            <option value="${s.sId}">
                    ${s.sName}
                &nbsp;&nbsp;&nbsp;&nbsp;
                    ${s.sPinyin}
            </option>
        </c:forEach>
    </select>
    <select name="chengshiId">
        <option >请选择</option>
        <c:forEach items="${chengshi}" var="c" >
            <option value="${c.cId}">
                    ${c.cName}
                &nbsp;&nbsp;&nbsp;&nbsp;
                    ${c.cPinyin}
            </option>
        </c:forEach>
    </select>
    <input id="quche" value="">
    <br/>

    <span id="s_huanche">还车</span>
    <select name="shengfenId">
        <option>请选择</option>
        <c:forEach items="${shengfen}" var="s" >
            <option value="${s.sId}">
                    ${s.sName}
                        &nbsp;&nbsp;&nbsp;&nbsp;
                    ${s.sPinyin}
            </option>
        </c:forEach>
    </select>
    <select name="chengshiId">
        <option >请选择</option>
        <c:forEach items="${chengshi}" var="c" >
            <option value="${c.cId}">
                    ${c.cName}
                        &nbsp;&nbsp;&nbsp;&nbsp;
                    ${c.cPinyin}
            </option>
        </c:forEach>
    </select>
    <input id="huanche" value="">
    <br/>

    <span id="s_zuqi">租期</span><input id="zhuche_riqi" type="date">
    --至--
    <input id="huanche_riqi" type="date">
    <br/>
    <input id="xuanche" type="submit" value="立即选车">
</div>
</body>
</html>
