package org.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.onlineexam.dto.QuestionDTO;
import org.onlineexam.utils.SQLContants;

public class QuestionDAO {
	
	public boolean addQuestion(QuestionDTO question) throws SQLException, ClassNotFoundException {
		Connection  con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = CommonDAO.getConnection();
			
			pstmt = con.prepareStatement(SQLContants.ADD_QUESTION);
			pstmt.setString(1,question.getQuestion());
			pstmt.setString(2,question.getOptiona());
			pstmt.setString(3,question.getOptionb());
			pstmt.setString(4,question.getOptionc());
			pstmt.setString(5,question.getOptiond());
			pstmt.setString(6,question.getRightoption());
			pstmt.setString(7,question.getSubject());
			
			
			int var  = pstmt.executeUpdate();
			if(var == 1) {
				return true;
			}
			
		}finally {
			if(rs != null) {
				rs.close();
			}
			if(pstmt != null){
				pstmt.close();
			}
			if(con != null) {
				con.close();
			}
		}
		return false;
	}

}
