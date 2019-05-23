package org.exam.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.exam.dao.CommonDAO;
import org.onlineexam.utils.SQLContants;


@WebServlet("/changepassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public ChangePassword() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password = request.getParameter("newpwd");
		String newPassword = request.getParameter("newpwdagain");
		Connection con = null;
		PreparedStatement pstmt = null;
//		ResultSet rs = null;
		
		if(password.equals(newPassword)) {
			try {
				con = CommonDAO.getConnection();
				pstmt  = con.prepareStatement(SQLContants.CHANGEPASSWORD);
				pstmt.setString(1,password);
				
				int rs = pstmt.executeUpdate();
				System.out.println(rs);
				
			} catch (ClassNotFoundException | SQLException e) {
				response.sendRedirect("Error.jsp");
				e.printStackTrace();
			}
			
		}
		else {
//			Please ensure that both the fields matches.
		}
	}

}
