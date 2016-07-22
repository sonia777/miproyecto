<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario</title>
</head>
<body>

<form action="Formulary" method="post">
<h2> Registrarse</h2> 
nombre: <input type="TEXT" placeholder="&#128272;nombre"  name="nombre" size=15><BR> 
apellido: <input type="TEXT" placeholder="&#128272;apellido" name="apellido" size=15><P>
edad: <input type="TEXT" placeholder="&#128272;edad" name="edad" size=15><P>
sexo: <input type="TEXT" placeholder="&#128272;sexo" name="sexo" size=15><P>

email: <input type="TEXT" placeholder="&#128272;email" name="email" size=15><P>
domicilio: <input type="TEXT" placeholder="&#128272;domicilio" name="domicilio" size=15><P>
ciudad: <input type="TEXT" placeholder="&#128272;ciudad" name="cuidad" size=15><P>
 
<input type="SUBMIT" nameE="botonEnviar" value="Enviar">
</form>
</body>
</html>