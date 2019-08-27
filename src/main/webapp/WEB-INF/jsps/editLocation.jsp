<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="editLoc" method="post">
<pre>
ID : <input type="text" name="id" value="${location.id} " readonly>
code : <input type="text" name="code" value="${location.code}">
name : <input type="text" name="name" value="${location.name}">
Type : Urban <input type="radio" name="type" value="Urban">
	   Rural <input type="radio" name="type" value="Rural">
<input type="submit" name="save">
</pre>
</form>
${msg}

<a href="displayLocation">View Location</a>
</body>
</html>