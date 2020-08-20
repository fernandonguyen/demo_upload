<%--
  Created by IntelliJ IDEA.
  User: kiennt50
  Date: 8/14/20
  Time: 2:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Pass</th>
        <th>Address</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th><a href="/customers/${customer.getId()}"><c:out value="${customer.getId()}"/></a></th>
        <th><c:out value="${customer.getUser_name()}"/></th>
        <th><c:out value="${customer.getPass_word()}"/></th>
        <th><c:out value="${customer.getAddress()}"/></th>
    </tr>
    </tbody>
</table>
</body>
</html>
