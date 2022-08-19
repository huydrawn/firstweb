<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="show" modelAttribute="student">
		ID: <form:input path="ID" />
		<br>
		Name: <form:input path="name" />
		<br>
		<table>
			<tr>
				<td><b>Sex:</b></td>
				<td><form:radiobuttons path="sex" items="${sex}" /></td>
			</tr>
			<tr>
				<td><b>Pass: </b></td>
				<td><form:checkboxes items="${pass}" path="passSubject" /></td>

			</tr>
			<tr>

				<td>From: <form:select path="city">
						<form:options items="${city}" />
					</form:select></td>
			</tr>
		</table>
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>