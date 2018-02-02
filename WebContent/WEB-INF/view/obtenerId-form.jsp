<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>


<html>
<head>

<title>Buscar Alumnos</title>

<style>
.error {color:red}
</style>

</head>




<body>

<form:form action="updateForm" modelAttribute="genID">
	<br><br>
	
	Ingresa el GenID: <form:input path="id"/>
			<form:errors path="id" cssClass="error"/>
<br><br>
	
	<input type="submit" value="submit" >

</form:form>
</body>






</html>