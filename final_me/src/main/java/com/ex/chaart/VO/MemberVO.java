package com.ex.chaart.VO;

/*
  CREATE TABLE MEMBER (
  ID VARCHAR(10)  KEY,
  PASSWORD VARCHAR(20),
  NAME VARCHAR(10),
  EMAIL VARCHAR(20)
);

INSERT INTO MEMBER VALUE(abcd, 1234, "안녕", e@mail.com);
  
 */







public class MemberVO {

	private String id;
	private String password;
	private String name;
	private String email;

		
	
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public MemberVO() {  //생성자
	
	}
	
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", name=" + name + ", email= " + email + "]";
	}
	

}
