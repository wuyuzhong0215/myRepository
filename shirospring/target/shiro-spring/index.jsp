<%@ page pageEncoding="utf-8" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h2>Index Page</h2>
<br>
<shiro:hasRole name="超级管理员">
    <a href="manager">超管功能</a>
</shiro:hasRole>
<br>
<shiro:hasPermission name="sys:user:save">
    <a href="save">新增功能</a>
</shiro:hasPermission>
<br>
<shiro:hasPermission name="sys:user:list">
    <a href="save">查看功能</a>
</shiro:hasPermission>
<a href="logout">安全退出</a>

</body>
</html>
