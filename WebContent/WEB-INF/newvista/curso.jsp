<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nombre del Curso</title>
</head>
<body>
  <FORM ACTION="ProyectoGym/Java Resources/src/Vista/Curso.java" METHOD="GET"> 
		<B>Curso: </B>
		<P><B>nombreCurso:</B> <% request.getParameter("nombreCurso"); %> </P> 
		 <P><B>nombreProfesor:</B> <% request.getParameter("nobreProfesor"); %> </P> 
		 <P><B>horario:</B> <% request.getParameter("horario"); %> </P> 
		 <INPUT TYPE="SUBMIT" NAME="botonEnviar" VALUE="Enviar">


</body>
</html>