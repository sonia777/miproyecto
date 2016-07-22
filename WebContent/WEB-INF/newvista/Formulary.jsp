<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar</title>
</head>
<body>
        <FORM ACTION="ProyectoGym/Java Resources/src/Vista/Formulario.java" METHOD="GET"> 
		<B>Registro de datos personales: </B>
		<P><B>nombre:</B> <% request.getParameter("nombre"); %> </P>
		 <P><B>apellido:</B> <% request.getParameter("apellido"); %> </P> 
		 <P><B>edad:</B> <% request.getParameter("edad"); %> </P>
		 <P><B>sexo:</B> <% request.getParameter("sexo"); %> </P>
		 <P><B>email:</B> <% request.getParameter("email"); %> </P>
		 <P><B>domicilio:</B> <% request.getParameter("domicilio"); %> </P>
		 <P><B>telefono:</B> <% request.getParameter("telefono"); %> </P>
		 <P><B>ciudad:</B> <% request.getParameter("cuidad"); %> </P>
		 <INPUT TYPE="SUBMIT" NAME="botonEnviar" VALUE="Enviar">
		</BODY>

</html>