<%--
  Created by IntelliJ IDEA.
  User: JinYuQiong
  Date: 2018/3/6
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link type="text/css" rel="stylesheet" href="static/css/dreamcar.css"/>

<style>



</style>
<html>
<head>
    <title>梦想之车</title>
</head>
<body>
<div id="mxzc_head" class="mxzc_head" >
    <ul class="mxzc_head_ul" >
        <li class="mxzc_head_dizhi"><span id="mxzc_head_dizhi_p">
            <c:choose>
            <c:when test="${cName!=null}">
                ${cName}
            </c:when>
            <c:otherwise>
                北京
            </c:otherwise>
            </c:choose>
        </span></li>
        <li class="mxzc_head_qiehuan" id="mxzc_head_qiehuan"><a>切换</a>
            <div class="mxzc_head_qiehuan_div" id="mxzc_head_qiehuan_div">
                <ul class="mxzc_head_qiehuan_ul">
                    <c:forEach items="${zimu}" var="z" >
                        <c:if test="${z.zId==2||z.zId==7||z.zId==8||z.zId==10||z.zId==16||z.zId==21||z.zId==22}">
                            <li>
                                <span><strong>${z.zZiMu}</strong></span>
                                <c:forEach items="${shengfen}" var="s" >
                                    <c:if test="${s.sZiMuId==z.zId}">
                                        <span class="sNameSpan">${s.sName}:</span>
                                        <c:forEach items="${chengshi}" var="c" >
                                                <c:if test="${c.cShengfenId==s.sId}">
                                                    <span class="cNameA"><a href="shouye?cName=${c.cName}" id="chengshi" onclick="demo()">${c.cName}</a></span>
                                                </c:if>
                                            </c:forEach>
                                        <br>&nbsp;
                                    </c:if>
                                </c:forEach>
                            </li>
                            <hr>
                        </c:if>
                    </c:forEach>
                </ul>
            </div>
        </li>
        <li class="mxzc_head_qitadizhi">| <a href="shouye">查看其它地方车市</a></li>
        <li class="mxzc_head_denglu">您好!请&nbsp;<a target="_blank" href="touserLogin">登录</a>&nbsp;或&nbsp;<a target="_blank" href="touserAddInfo">注册</a></li>
        <li class="mxzc_head_yingyong">&nbsp;更多应用 ></li>
    </ul>
</div>
<div id="mxzc_shouye_tubiao" class="mxzc_shouye_tubiao">
    <a href="shouye"><img src="../image/DreamCar.png" alt="首页" width="100px" height="100px"></a>
</div>

<div id="mxzc_yewu" class="mxzc_yewu">
    <ul class="mxzc_yewu_ul" id="mxzc_yewu_ul">
        <li><a target="_blank" href="todreamcar">首页</a></li>
        <li><a target="_blank" href="shanzu.jsp">闪租</a></li>
        <li><a target="_blank" href="shangmen.jsp">上门取送</a></li>
        <li><a target="_blank" href="daodian.jsp">到店取还</a></li>
        <li><a target="_blank" href="duanqi.jsp">短期租车</a></li>
        <li><a target="_blank" href="changqi.jsp">长期租车</a></li>
        <li><a target="_blank" href="qiye.jsp">企业用车</a></li>
        <li><a target="_blank" href="shunfeng.jsp">顺风车</a></li>
        <li><a target="_blank" href="huodong.jsp">活动</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
    </ul>
</div>

<div id="mxzc_chexing" class="mxzc_chexing">
    <ul class="mxzc_chexing_ul">
        <li class="mxzc_chexing_ul_li"><a target="_blank" href="" >新能源</a></li>
        <li class="mxzc_chexing_ul_li"><a target="_blank" href="" >微型车</a></li>
        <li class="mxzc_chexing_ul_li"><a target="_blank" href="" >小型车</a></li>
        <li class="mxzc_chexing_ul_li"><a target="_blank" href="" >紧凑型车</a></li>
        <li class="mxzc_chexing_ul_li"><a target="_blank" href="" >中型车</a></li>
        <li class="mxzc_chexing_ul_li"><a target="_blank" href="" >中大型车</a></li>
        <li class="mxzc_chexing_ul_li"><a target="_blank" href="" >大型车</a></li>
        <li class="mxzc_chexing_ul_SUV"><a target="_blank" href="">SUV</a>
            <div class="mxzc_chexing_SUV_div">
                <dl class="mxzc_chexing_SUV_dl">
                    <dd><a target="_blank" href="/">全部SUV</a></dd>
                    <dd><a target="_blank" href="/">小型SUV</a></dd>
                    <dd><a target="_blank" href="">紧凑型SUV</a></dd>
                    <dd><a target="_blank" href="">中型SUV</a></dd>
                    <dd><a target="_blank" href="">中大型SUV</a></dd>
                    <dd><a target="_blank" href="">大型SUV</a></dd>
                </dl>
            </div>
        </li>
        <li class="mxzc_chexing_ul_li"><a target="_blank" href="">MPV</a></li>
        <li class="mxzc_chexing_ul_li"><a target="_blank" href="">跑车</a></li>
        <li class="mxzc_chexing_ul_li"><a target="_blank" href="">皮卡</a></li>
        <li class="mxzc_chexing_ul_li"><a target="_blank" href="">微面</a></li>
    </ul>
</div>


</body>
</html>
