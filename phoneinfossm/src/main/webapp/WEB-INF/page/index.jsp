<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/29 0029
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
    <title>Index</title>
</head>
<body>
<div class="wrapper">
    <p>手机资讯</p>
    <table class="list">
        <tr>
            <th>序号</th>
            <th>标题</th>
            <th>回复/查看</th>
            <th>发表时间</th>
            <th>最新回复</th>
        </tr>
        <c:forEach items="${informations}" var="info" >
            <tr>
                <td>${info.id}</td>
                <td><a href="/toMain.html?infoid=${info.id}">${info.title}</a></td>
                <td>${info.replycount}/${info.viewcount}</td>
                <td><fmt:formatDate value="${info.reporttime}" pattern="yyyy-MM-dd HH:mm"/></td>
                <td><fmt:formatDate value="${info.lastposttime}" pattern="yyyy-MM-dd HH:mm"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
