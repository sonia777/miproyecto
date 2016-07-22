package vista;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	public class InscripcionServlet extends HttpServlet {
		
		private static final long serialVersionUID = 1L;
		
		
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	String nombre = req.getParameter("nombre");
	String apellido = req.getParameter("apellido");
	String edad = req.getParameter("edad");
	String nombreCurso = req.getParameter("nombreCurso");

	} 
}
	
	
	
