package com.shaik.spring.services;

import com.shaik.spring.dao.UserDAO;

public class UserServices {
	private UserDAO udao;
	
	public void setUserDao(UserDAO udao)
	{
		this.udao=udao;
	}
	public boolean processLogin(String username,String password)
	{
		return udao.findUser(username, password);
	}

}
