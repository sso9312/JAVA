package oop0911;

class BbsDTO {//Data Transfer Object 전송객체

	//멤버변수 filed	
	private int bbsno; 		//글번호
	private String writer; 	//글작성자 
	private String subject; //글제목 

	//생성자함수 constructor
	public BbsDTO() {}
	
	//멤버함수 method
	public int getBbsno() {
		return this.bbsno;
	}
	
	public void setBbsno(int bbsno) {
		this.bbsno = bbsno;
	}
	
	public String getWriter() {
		return this.writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return this.subject;
	}
	public void setsubject(String subject) {
		this.subject=subject;
	}
}//class end
