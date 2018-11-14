<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FirstServlet</title>
</head>
<body>
Get User Details
<form action="FirstServlet" method="get">
Username: <input type="text" name="uname"><br/>
Email ID: <input type="text" name="email"><br/>
<input type="submit"> <br/>
</form>
<br/>
<br/>
<br/>
<br/>
User Registration
<form action="FirstServlet" method="post">
Username: <input type="text" name="uname"><br/>
Email ID: <input type="text" name="email"><br/>
<input type="submit"> <br/>

</form>
<br/>
<br/>
</body>
</html>