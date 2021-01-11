<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Submit Feedback</title>
</head>
<body>


	<form:form action="submitFeedback/submit" method="post" modelAttribute="f">
	
	Feedback:<input type="text" name="feedback" />
		<br>
		<button type="submit">search</button>

	</form:form>

</body>
</html>