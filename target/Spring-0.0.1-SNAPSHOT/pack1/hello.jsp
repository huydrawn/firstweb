<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
a {
	color: blue;
	size: 18px;
}

a:hover {
	color: red;
}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>this is hello page</h1>
	<br> ${huy}
	<br> ${tuyen }
	<br>
	<% this.log("name"); %>
	<abbr title="enter into this to come back index.jsp"><a
		href="index.jsp">come back</a></abbr>
</body>
</html>