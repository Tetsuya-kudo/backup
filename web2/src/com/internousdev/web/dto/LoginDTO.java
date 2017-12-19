package com.internousdev.web.dto;

public class LoginDTO {

	public String username;
	public String password;

	public String setUsername(){
		return username;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

}
