package com.sdu.server.common;

public class User {
	/*
	 * @author sdusjy
	 */
	/*
	 * 定义 id，password，以及注册的类型
	 */
	private String id;
	private String password;
	private String confimpas;
	private Type   type;
	private UserType userType;
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	//private String  
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
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
	public String getConfimpas() {
		return confimpas;
	}
	public void setConfimpas(String confimpas) {
		this.confimpas = confimpas;
	}
	

}
