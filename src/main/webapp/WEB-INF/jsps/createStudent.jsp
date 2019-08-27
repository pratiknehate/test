<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="addStudent" method="post">
<pre>
ID : <input type="text" name="id">
NAME : <input type="text" name="sname">
COURSE : <input type="text" name="scourse">
FEES : <input type="text" name="sfee">
<input type="submit" name="save">
</pre>
</form>
${msg}

<a href="displayEmployee">View Employees</a>
</body>
</html>