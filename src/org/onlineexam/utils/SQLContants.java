package org.onlineexam.utils;

public interface SQLContants {
	String LOGIN_SQL = "select userid,password from users where userid = ? "
			+ "and password = ?";
	String REGISTER_SQL = "insert into users (name,userid,password,email) "
			+ "values(?,?,?,?)";
	String ADD_QUESTION = "insert into questions (question,optiona,optionb,"
			+ "optionc,optiond,rightoption,subject) values(?,?,?,?,?,?,?)";
	String CHANGEPASSWORD = "update users set password = ? where "
			+ "userid = 'admin'";
	String CHECK_ENQUIRY = "insert into enquiry(name,userid,query) "
			+ "values(?,?,?)";
}
