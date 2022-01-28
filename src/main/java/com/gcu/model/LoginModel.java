package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginModel {

	@NotNull(message = "user name is required")
	@Size(min = 1, max = 15, message = "you need 1 - 32 char")
	private String userName;

	@NotNull(message = "password is required")
	@Size(min = 1, max = 15, message = "you need 1 - 32 char")
	private String password;

	@Override
	public String toString() {
		return "LoginModel [userName=" + userName + ", password=" + password + "]";
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
