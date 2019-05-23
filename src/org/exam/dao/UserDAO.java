package org.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.onlineexam.dto.UserDTO;
import org.onlineexam.utils.SQLContants;

public class UserDAO {
	public boolean doLogin(UserDTO user) throws ClassNotFoundException, SQLException {
		Connection  con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement(SQLContants.LOGIN_SQL);
			pstmt.setString(1,user.getUsername());
			pstmt.setString(2,user.getPassword());
			
			rs =pstmt.executeQuery();
//			while(rs.next()) {
//			 int uid = rs.getInt("uid");
//			 String status = rs.getString("status");
//			 
//			 System.out.println(uid+"   "+status);
//			}
			
			if(rs.next()) {
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
	
	public boolean doRegister(UserDTO user) throws SQLException, ClassNotFoundException {
		Connection  con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = CommonDAO.getConnection();
			
			pstmt = con.prepareStatement(SQLContants.REGISTER_SQL);
			pstmt.setString(1,user.getName());
			pstmt.setString(2,user.getUsername());
			pstmt.setString(3,user.getPassword());
			pstmt.setString(4,user.getEmail());
			
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
