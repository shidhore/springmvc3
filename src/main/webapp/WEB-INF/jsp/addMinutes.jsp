<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!-- maven doen't go and download the tag library every time; rather it is available as part of spring webmvc jar -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Minutes Page</title>
</head>
<body>
	<h1>Add Minutes Page Displayed</h1>
	<!-- below is Spring form element, not standard HTML element -->
	<!-- use attribute commandName to bind to object - its value should be same as that in Controller -->
	<form:form commandName="exerciseBinding">
		<table>
			<tr>
				<td>Minutes Exercised today:</td>
				<td><form:input path="minutes" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Add Minutes">
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>