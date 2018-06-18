package com.bookstore.bean;

/**
 * 	储存用户信息
 * @author Administrator
 *
 */
public class User {
	private String  id;				//用户ID		(电话)
	private String 	username;		//用户名		(姓名)
	private String 	PIN;			//密码
	private String 	sex;			//性别
	private String 	idcard;			//身份证
	public User(){
		
	}
	public User(String id,String	 username,String 	PIN,String 	sex,String 	idcard) {
		super();
		this.id			=	id;
		this.username	=	username;			
		this.PIN		=	PIN;
		this.sex		=	sex;
		this.idcard		=	idcard;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPIN() {
		return PIN;
	}
	public void setPIN(String pIN) {
		PIN = pIN;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	
}
