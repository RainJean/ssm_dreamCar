<%--
  Created by IntelliJ IDEA.
  User: 王大大
  Date: 2017/12/3
  Time: 11:22
  To change this template use File | Settings | File Templates.
-%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<%--<link type="text/css" rel="stylesheet" href="static/css/main.css"/>--%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>

    /*业务地址栏开始*/
    .mxzc_yewu{
        position: absolute;
        top: 30px;
        left: 260px;
    }
    .mxzc_yewu_ul{
        margin:0;
        padding:0;
        overflow:visible;
        height: 35px;
        background-color: #214282;
        list-style-type:none;
    }
    .mxzc_yewu_ul li{
        float:left;
    }
    .mxzc_yewu_ul a:link,.mxzc_yewu_ul a:visited{
        display:block;
        width:90px;
        height: 26px;
        padding: 6px;
        font-weight:bold;
        font-size: 17px;
        font-family: "楷体";
        color:white;
        text-align:center;
        text-decoration:none;
        text-transform:uppercase;
    }
    .mxzc_yewu_ul a:hover,.mxzc_yewu_ul a:active{
        background-color: #6666CC;
    }
    /*业务地址栏结束*/

    /*返回首页图标开始*/
    .mxzc_shouye_tubiao a{
        font-size: 36px;
        text-decoration:none;
        background-color: #26f3d9;
    }
    .mxzc_shouye_tubiao{
        position: absolute;
        top: 30px;
        left: 130px;
    }
    /*返回首页图标结束*/

    /*车型栏开始*/
    .mxzc_chexing{
        position: absolute;
        top: 93px;
        left: 260px;
        height: 30px;
        width: 900px;
        background-color: #cfcfcf;
    }
    .mxzc_chexing_ul{
        margin:0;
        padding:0;
        overflow:visible;
        list-style-type:none;
    }
    .mxzc_chexing_ul li{
        float: left;
    }
    .mxzc_chexing_ul a{
        display:block;
        padding: 4px;
        font-family: "楷体";
        color:black;
        text-align:center;
        text-decoration:none;
        text-transform:uppercase;
        margin-left:10px;
        margin-right:10px;
    }
    .mxzc_chexing_ul a:hover,.mxzc_chexing_ul a:active{
        background-color: #6666CC;
    }

    /*下拉框选项栏开始*/
    .mxzc_chexing_SUV{
        position: relative;
        display: inline-block;
    }
    .mxzc_chexing_SUV_div{
        display: none;
        position: absolute;
        left: -45px;
    }
    .mxzc_chexing_SUV_div li{
        list-style-type:none;
    }
    .mxzc_chexing_SUV_div .mxzc_chexing_SUV_ul a{
        list-style-type:none;
        background-color: lightgray;
        float: left;
        width: 80px;
    }
    .mxzc_chexing_SUV_div a:hover{
        background-color: #6666CC;
    }
    .mxzc_chexing_SUV:hover .mxzc_chexing_SUV_div{
        display: block;
    }
    /*下拉框选项栏结束*/
    /*车型栏结束*/


</style>


<body>
<div id="mxzc_head" class="mxzc_head" >
    <ul class="mxzc_head_ul" >
        <li class="mxzc_head_dizhi">北京</li>
        <li class="mxzc_head_qiehuan" id="mxzc_head_qiehuan"><a>切换</a>
            <div class="mxzc_head_qiehuan_div" id="mxzc_head_qiehuan_div">
                <ul class="mxzc_head_qiehuan_ul">
                    <c:forEach items="${zimu}" var="z" >
                        <li>
                            <span style="font-size: 13px;font-weight:bold;">${z.zZiMu}&nbsp;</span>
                            <c:forEach items="${shengfen}" var="s" >
                                <c:if test="${s.sZiMuId==z.zId}">
                                    <span class="sNameSpan">${s.sName}:</span>
                                    <c:forEach items="${chengshi}" var="c" >
                                        <c:if test="${c.cShengfenId==s.sId}">
                                            <span class="cNameA"><a id="qiehuan">${c.cName}</a></span>
                                        </c:if>
                                    </c:forEach>
                                    <br>&nbsp;&nbsp;
                                </c:if>
                            </c:forEach>
                        </li>
                        <hr/>
                    </c:forEach>
                </ul>
            </div>
        </li>
        <li class="mxzc_head_qitadizhi">| <a>查看其它地方车市</a></li>
        <li class="mxzc_head_denglu">您好!请 <a target="_blank" href="touserLogin">登录</a>
            或 <a target="_blank" href="touserAddInfo">注册</a></li>
    </ul>
</div>

<div id="mxzc_shouye_tubiao" class="mxzc_shouye_tubiao">
    <a target="_blank" href="todreamcar">&nbsp;Dream&nbsp;<br/>&nbsp;&nbsp;&nbsp;&nbsp;Car&nbsp;&nbsp;&nbsp;</a>
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
        <li><a target="_blank" href="" >新能源</a></li>
        <li><a target="_blank" href="" >微型车</a></li>
        <li><a target="_blank" href="" >小型车</a></li>
        <li><a target="_blank" href="" >紧凑型车</a></li>
        <li><a target="_blank" href="" >中型车</a></li>
        <li><a target="_blank" href="" >中大型车</a></li>
        <li><a target="_blank" href="" >大型车</a></li>
        <li class="mxzc_chexing_SUV"><a target="_blank" href="">SUV</a>
            <div class="mxzc_chexing_SUV_div">
                <ul class="mxzc_chexing_SUV_ul">
                    <li><a target="_blank" href="/">全部SUV</a></li>
                    <li><a target="_blank" href="/">小型SUV</a></li>
                    <li><a target="_blank" href="">紧凑型SUV</a></li>
                    <li><a target="_blank" href="">中型SUV</a></li>
                    <li><a target="_blank" href="">中大型SUV</a></li>
                    <li><a target="_blank" href="">大型SUV</a></li>
                </ul>
            </div>
        </li>
        <li><a target="_blank" href="">MPV</a></li>
        <li><a target="_blank" href="">跑车</a></li>
        <li><a target="_blank" href="">皮卡</a></li>
        <li><a target="_blank" href="">微面</a></li>
    </ul>
</div>

