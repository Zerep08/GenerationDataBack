<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head><title>Student confirmation</title></head>
<body>

	The student is confirmed: ${student.nombre} ${student.apellido}

	<br><br>

	Programa : ${student.programa}

	<br><br>
	
	
	Cohort : ${student.cohort}
	
	<br><br>
	
	GenID: ${student.genID}
	
	<br><br>
	
	Calle y numero: ${student.calleNumero}
	
	<br><br>
	
	Colonia: ${student.colonia}
	
	<br><br>
	
	Delegacion/Municipio: ${student.municipio}
	
	<br><br>
	
	Estado: ${student.estado}
	
	<br><br>
	
	Telefono: ${student.telefono}
	
	<br><br>
	
	Celular: ${student.celular}
	
	<br><br>
	
	Whatsapp: ${student.whats}
	
	<br><br>
	
	Mail1: ${student.mail1}
	
	<br><br>
	
	Mail2: ${student.mail2}
	
	<br><br>
	
	Mail3: ${student.mail3}
	
	<br><br>
	
	Mail4: ${student.mail4}
	
	<br><br>
	
	Link de Facebook: ${student.face}
	
	<br><br>
	
	Link Instagram: ${student.ins}
	
	<br><br>
	
	Link Linkedin: ${student.linkedin}
	
	<br><br>
	
	Link Twitter: ${student.twit}
	
	<br><br>
	
	Pasatiempo: ${student.pasatime}
	
	<br><br>
	
	Que es lo que ves en redes sociales?: ${student.rdsSociales} 
	
	<br><br>

</body>

</html>