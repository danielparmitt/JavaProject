package org.exam.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.exam.dao.EnquiryDAO;
import org.onlineexam.dto.EnquiryDTO;


@WebServlet("/enquiryform")
public class EnquiryForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EnquiryForm() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse 
			response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String userid = request.getParameter("userid");
		String query = request.getParameter("query");
		
		EnquiryDTO edto = new EnquiryDTO(name, userid, query);
		EnquiryDAO edao = new EnquiryDAO();
		
		boolean flag;
		
		try {
			flag = edao.doSave(edto);
			if(flag) {
				response.sendRedirect("RecordAdded.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}
