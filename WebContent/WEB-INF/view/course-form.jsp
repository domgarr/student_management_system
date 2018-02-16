<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
	<style>
		textarea {
			vertical-align: top;
		}
	</style>
</head>

<body>
	<form:form  modelAttribute="course" action="saveCourse" method="POST">
		<label for="name" >Course Name: </label> <form:input path="name" />
		<br><br>
		<label for="description" >Description: </label> <form:textarea path="description" rows="3" />
		<br><br>
		<input type = "submit" value="Add Course" />
		
	
	</form:form>
</body>

</html>