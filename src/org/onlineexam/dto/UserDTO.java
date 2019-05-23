package org.onlineexam.dto;

public class UserDTO {
	private String username;
	private String password;
	private String name;
	private String email;
	
	
	public UserDTO() {
		
	}
	
	public UserDTO(String name,String pwd) {
		this.username = name;
		this.password = pwd;
	}
	
	public UserDTO(String name,String userid,String email,String password) {
		
		this.name = name;
		this.username = userid;
		this.email = email;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
