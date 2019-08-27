<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Employees:
<table>
<tr>
<th>ID</th>
<th>NAME</th>
<th>CITY</th>
<th>SALARY</th>
</tr>
<c:forEach items="${employees}" var="employees">
<tr>
<td>${employees.id}</td>
<td>${employees.name}</td>
<td>${employees.location}</td>
<td>${employees.sal}</td>
<td><a href="deleteEmployee?id=${employees.id}">delete</a></td>
</tr>
</c:forEach>
</table>
<a href="addEmp">add new employee</a>
</body>
</html>