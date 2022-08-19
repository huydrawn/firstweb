<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
b {
	color: green;
	size: 20px;
	text-decoration: underline;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Student :</h3>
	ID : ${student.ID}
	<br> Name :${student.name}
	<br> Sex : ${student.sex}
	<br> Subject:
	<c:forEach var="sub" items="${student.passSubject}">
		<b>${sub}</b>
	</c:forEach>
	<br> ${student.city}
</body>
</html>