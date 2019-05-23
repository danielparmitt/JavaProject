package org.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.onlineexam.dto.EnquiryDTO;
import org.onlineexam.dto.UserDTO;
import org.onlineexam.utils.SQLContants;

public class EnquiryDAO {
	public boolean doSave(EnquiryDTO dto) throws ClassNotFoundException, SQLException {
		Connection  con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement(SQLContants.CHECK_ENQUIRY);
			pstmt.setString(1,dto.getName());
			pstmt.setString(2,dto.getUserid());
			pstmt.setString(3,dto.getQuery());
			
			int rs = pstmt.executeUpdate();

			
			if(rs == 1) {
				return true;
			}
			
		}finally {
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
