package org.exam.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.exam.dao.QuestionDAO;
import org.onlineexam.dto.QuestionDTO;


@WebServlet("/questionupload")
public class QuestionUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public QuestionUpload() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String question = request.getParameter("question");
			String optiona = request.getParameter("optiona");
			String optionb = request.getParameter("optionb");
			String optionc = request.getParameter("optionc");
			String optiond = request.getParameter("optiond");
			String rightanswer = request.getParameter("right");
			String sub = request.getParameter("subject");
			String subject = sub.equalsIgnoreCase("c++")?"C++":sub.equalsIgnoreCase("java")?"JAVA":sub.equalsIgnoreCase("javascript")?"JAVASCRIPT":null;   
			System.out.println("Subject is "+subject);
			
			QuestionDTO questionDTO = new QuestionDTO(question,optiona,optionb,optionc,optiond,rightanswer,subject);
			QuestionDAO  questionDAO = new QuestionDAO();
			
			boolean authentication;
			
			try {
				authentication = questionDAO.addQuestion(questionDTO);
				if(authentication) {
					response.sendRedirect("RecordAdded.jsp");
				}
				else {
					response.sendRedirect("Invalid.jsp");
				}
			}
			catch(ClassNotFoundException | SQLException sqe){
				response.sendRedirect("Error.jsp");
				sqe.printStackTrace ();
				
			}
			
	}

}
