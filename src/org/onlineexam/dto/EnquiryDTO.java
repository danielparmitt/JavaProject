package org.onlineexam.dto;

public class EnquiryDTO {
	private String name;
	private String userid;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	private String query;
	
	public EnquiryDTO(String n, String u, String q) {
		this.name = n;
		this.userid = u;
		this.query = q;
	}
}
