<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>
<head>

<title>Student Registration form</title>


<style>
.error {color:red}
</style>


</head>
<body>

<form:form action="processForm" modelAttribute="student">
	Programa : 
	
	<form:select path="programa">
	<form:option value="Java" label="Java"/>
	<form:option value="Financiero" label="Financiero"/>
	<form:option value="Ventas" label="Ventas"/>
	</form:select>
	
	<br><br>
	
	Cohort : <form:input path="cohort"/>
			<form:errors path="cohort" cssClass="error"/>
	
	
	<br><br>
	
	GenID: <form:input path="genID"/>
			<form:errors path="genID" cssClass="error"/>
	
	<br><br>
	
	Nombre: <form:input path="nombre"/>
			<form:errors path="nombre" cssClass="error"/>
	
	<br><br>
	
	Apellidos: <form:input path="apellido"/>
				<form:errors path="apellido" cssClass="error"/>
	
	<br><br>
	
	Calle y numero: <form:input path="calleNumero"/>
	
	<br><br>
	
	Colonia: <form:input path="colonia"/>
	
	<br><br>
	
	Delegacion/Municipio: <form:input path="municipio"/>
	
	<br><br>
	
	Estado: <form:input path="estado"/>
	
	<br><br>
	
	Telefono: <form:input path="telefono"/>
	
	<br><br>
	
	Celular: <form:input path="celular"/>
			<form:errors path="celular" cssClass="error"/>
	<br><br>
	
	Whatsapp: <form:input path="whats"/>
	
	<br><br>
	
	Mail1: <form:input path="mail1"/>
			<form:errors path="mail1" cssClass="error"/>
	<br><br>
	
	Mail2: <form:input path="mail2"/>
			<form:errors path="mail2" cssClass="error"/>
	
	<br><br>
	
	Mail3: <form:input path="mail3"/>
			<form:errors path="mail3" cssClass="error"/>
	
	<br><br>
	
	Mail4: <form:input path="mail4"/>
			<form:errors path="mail4" cssClass="error"/>
	
	<br><br>
	
	Link de Facebook: <form:input path="face"/>
	
	<br><br>
	
	Link Instagram: <form:input path="ins"/>
	
	<br><br>
	
	Link Linkedin: <form:input path="linkedin"/>
	
	<br><br>
	
	Link Twitter: <form:input path="twit"/>
	
	<br><br>
	
	Pasatiempo: <form:input path="pasatime"/>
	
	<br><br>
	
	Que es lo que ves en redes sociales: <form:input path="rdsSociales"/>
	
	<br><br>
	
	<input type="submit" value="submit" >

</form:form>

</body>



</html>