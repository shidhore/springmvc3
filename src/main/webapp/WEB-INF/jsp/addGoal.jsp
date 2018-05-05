<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- maven doesn't go and download the tag library every time; rather it is available as part of spring webmvc jar -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Goal Page</title>
</head>
<body>
	<h1>Add Goal Page Displayed</h1>
	<!-- below is Spring form element, not standard HTML element -->
	<!-- use attribute commandName to bind to object - its value should be same as that in Controller -->
	<form:form commandName="goal">
		<table>
			<tr>
				<!-- code attribute inside spring:message is the key inside message.properties file -->
				<td><spring:message code="entergoal.text" /></td>
				<!-- path="minutes" means there is a setter & getter method inside object represented by addGoal for the field minutes -->
				<td><form:input path="minutes" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Goal Minutes">
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>