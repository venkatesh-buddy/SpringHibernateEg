package com.ibatis.poc.user.model;

import java.io.Serializable;

public class UserModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private String userId;
	private String userName;
	private String password;

	
	public UserModel(){		
		userId = "";
		userName = "";
		password = "";		
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
