<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/29 0029
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:useBean id="Timestamp" class="java.util.Date"/>
<html>

<head>
    <title>Main</title>
    <script type="text/javascript" src="js/jquery-1.11.3.js"></script>
    <script type="text/javascript" src="js/main.js"></script>
</head>
<body>
<h1>${info.title}</h1>
<p1>发表于：${info.lastposttime}</p1><br/>
<br>
<p2>${info.content}</p2>
<h1>读者回应</h1>
<ul class="replylist">
    <c:forEach items="${replylist}" var="rep">
        <li>发表于：<fmt:formatDate value="${rep.replytime}" pattern="yyyy-MM-dd HH:mm:ss"/></li>
        <li>${rep.content}</li>
        <br>
    </c:forEach>
</ul>

<div id="page_navigation">
    <button onclick="changePage(false)">上一页</button>
    <button onclick="changePage(true)">下一页</button>
</div>

<br>
    <p>快速回复（200字以内）：</p>
    <input placeholder="请填写回复内容" type="text" name="content" id="replytext" style="width:200px;height: 75px;" value="">
    <br>
    <button id="btn_addMsg" onclick="addMsg()" value="${info.id}">回复</button>
    <a href="toIndex.html">返回首页</a>

</body>
</html>
