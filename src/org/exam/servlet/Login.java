package org.exam.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.exam.dao.UserDAO;
import org.onlineexam.dto.UserDTO;


@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
        
    }

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			UserDTO dto = new UserDTO(username, password);
			UserDAO dao = new UserDAO();
			// Set standard HTTP/1.1 no-cache headers.
			response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");

			// Set standard HTTP/1.0 no-cache header.
			response.setHeader("Pragma", "no-cache");
			boolean authenication;
			
			try {
				authenication = dao.doLogin(dto);
				if(authenication) {
					HttpSession http = request.getSession(true);
					http.setAttribute("username",username);
					response.sendRedirect("Dashboard.jsp");
//					
				}
				else {
					response.sendRedirect("Invalid.jsp");
					out.println("not valid users");
				}
			}
			catch(ClassNotFoundException | SQLException sqe){
				response.sendRedirect("Error.jsp");
				sqe.printStackTrace ();
				
			}
			
		}

}
