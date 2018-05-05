<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- maven doesn't go and download the tag library every time; rather it is available as part of spring webmvc jar -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Minutes Page</title>
</head>
<body>
	<h1>Add Minutes Page Displayed</h1>
	<!-- intercepting language using servlet-config mvc:interceptors element and p:paramName attribute of bean -->
	Language : <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>
	<!-- below is Spring form element, not standard HTML element -->
	<!-- use attribute commandName to bind to object - its value should be same as that in Controller -->
	<form:form commandName="exerciseBinding">
		<table>
			<tr>
				<!-- code attribute inside spring:message is the key inside message.properties file -->
				<td><spring:message code="goal.text" /></td>
				<!-- path="minutes" means there is a setter & getter method inside object represented by exerciseBinding for the field minutes -->
				<td><form:input path="minutes" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Minutes">
				</td>
			</tr>
		</table>
	</form:form>
	
	<h1>Goal for the day is = ${goal.minutes}</h1>
</body>
</html>