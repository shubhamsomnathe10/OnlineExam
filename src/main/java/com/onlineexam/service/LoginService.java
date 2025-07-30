package com.onlineexam.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexam.dao.LoginDao;
import com.onlineexam.entity.Users;



@Service
public class LoginService {

	@Autowired
	LoginDao logindao;
	
	
	public boolean validate(String username, String password)
	{
		Users users = logindao.getUser(username);
		
		if(users==null)
		{
			return false;
		}
		else if(username.equals(users.getUsername()) && password.equals(users.getPassword()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}