package org.onlineexam.dto;

public class QuestionDTO {
	private String question;
	private String optiona;
	private String optionb;
	private String optionc;
	private String optiond;
	private String rightoption;
	
	public String getRightoption() {
		return rightoption;
	}
	public void setRightoption(String rightoption) {
		this.rightoption = rightoption;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	private String subject;
	
	
	public QuestionDTO() {}
	public QuestionDTO( String question, String optiona, String optionb, String optionc, String optiond,String rightoption,String subject ){
		this.question = question;
		this.optiona = optiona;
		this.optionb = optionb;
		this.optionc = optionc;
		this.optiond = optiond;
		this.rightoption =rightoption;
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "QuestionDTO [question=" + question + ", optiona=" + optiona + ", optionb=" + optionb
				+ ", optionc=" + optionc + ", optiond=" + optiond + "]";
	}

	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOptiona() {
		return optiona;
	}
	public void setOptiona(String optiona) {
		this.optiona = optiona;
	}
	public String getOptionb() {
		return optionb;
	}
	public void setOptionb(String optionb) {
		this.optionb = optionb;
	}
	public String getOptionc() {
		return optionc;
	}
	public void setOptionc(String optionc) {
		this.optionc = optionc;
	}
	public String getOptiond() {
		return optiond;
	}
	public void setOptiond(String optiond) {
		this.optiond = optiond;
	}
}
