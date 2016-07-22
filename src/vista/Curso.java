package vista;

import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Curso extends HttpServlet   {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	PrintStream out = new PrintStream(res.getOutputStream());
	int id_curso= req.getContentLength();
	int id_profe= req.getContentLength();
	String nombreCurso = req.getParameter("nombreCurso");
	String nombreProfe = req.getParameter("nombreProfe");
	int duracion = req.getContentLength();
	String plan_entren = req.getParameter("plan_entren");
	
    out.println("req.getContentLength() :  " + nombreCurso);
    out.println("req.getContentLength() :  " + nombreProfe);
    out.println("req.getContentLength() :  " + plan_entren);
	out.println("<p> El curso ha sido completado </p>");
  
	}
}
