package com.internousdev.login2.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.login2.dao.Login2DAO;
import com.internousdev.login2.dto.Login2DTO;
import com.opensymphony.xwork2.ActionSupport;

public class Login2Action extends ActionSupport implements SessionAware{
	private String name;
	private String password;
	private Map<String, Object> session;

	public String execute() throws SQLException {
		String ret = ERROR;
		Login2DAO dao = new Login2DAO();
		Login2DTO dto = new Login2DTO();

		dto = dao.select(name,password);
		if(name.equals(dto.getName())){
			if(password.equals(dto.getPassword())){
				ret = SUCCESS;
			}
		}
		session.put("name", dto.getName());
		return ret;
	}

public String getName(){
	return name;
}
public void setName(String name){
	this.name = name;
}
public String getPassword(){
	return password;
}
public void setPassword(String password){
	this.password = password;
}
public Map<String, Object> getSession(){
	return session;
}
public void setSession(Map<String, Object> session){
	this.session = session;
}
}
