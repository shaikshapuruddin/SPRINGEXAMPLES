package com.shaik.spring.dao.jdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.shaik.spring.dao.UserDAO;

public class UserDAOImpl extends JdbcDaoSupport implements UserDAO
{

	@Override
	public boolean findUser(String username, String password) {
		
		String sql="select count(uname) from user_login_details where uname=? and password=?";
		int count=getJdbcTemplate().queryForInt(sql,username,password);
		return (count==1);
		
	}
	

}
