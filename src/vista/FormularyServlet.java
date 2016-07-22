package vista;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	public class FormularyServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
		
		 public FormularyServlet() {
		        super();
		    }
				
		
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	String nombre = req.getParameter("nombre");
	String apellido = req.getParameter("apellido");
	String edad = req.getParameter("edad");
	String sexo = req.getParameter("sexo");
	String email = req.getParameter("email");
	String domicilio = req.getParameter("domicilio");
	String ciudad = req.getParameter("ciudad");
	
	System.out.println("nombre:" +nombre);
	System.out.println("apellido:" +apellido);
	System.out.println("edad:" +edad);
	System.out.println("sexo:" +sexo);
	System.out.println("email:" +email);
	System.out.println("domicilio:" +domicilio);
	System.out.println("ciudad:" +ciudad );
	
} 
	}
