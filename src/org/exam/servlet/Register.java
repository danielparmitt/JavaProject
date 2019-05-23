package org.exam.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.exam.dao.UserDAO;
import org.onlineexam.dto.UserDTO;


@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Register() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String userid = request.getParameter("userid");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String cpassword = request.getParameter("cpassword");
		UserDTO dto1 = null;
		if(password.equals(cpassword)) {
			 dto1 = new UserDTO(name,userid,email,password);
			
		}
		UserDAO dao1 = new UserDAO();
		
		boolean register;
		
		try {
			register  = dao1.doRegister(dto1);
			if(register) {
				response.sendRedirect("Login.jsp");
			}
			else {
				response.sendRedirect("Invalid.jsp");
			}	
		}
		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
