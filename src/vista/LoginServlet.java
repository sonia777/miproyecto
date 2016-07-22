package vista;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class LoginServet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String usuario =request.getParameter("usuario");
		String password =request.getParameter("password");
		System.out.println("Usuario:" +usuario);
		System.out.println("Password:" +password);
		RequestDispatcher rd = null;
		
		
		if(usuario.equals("Sonia")&& password.equals("villca")) {
			// request.setAttribute("usuarioLogueado", usuario + " " + password);
			 rd = request.getRequestDispatcher("/WEB-INF/welcome.jsp");
			 
	      } else  {
	    	  rd =  request.getRequestDispatcher("/WEB-INF/msjError.jsp");
	      }
		rd.forward(request, response);
	  }
}

