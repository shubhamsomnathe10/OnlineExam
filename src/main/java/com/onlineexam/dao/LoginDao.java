package com.onlineexam.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onlineexam.entity.Users;



@Repository
public class LoginDao {

	@Autowired
	SessionFactory sf;
	
	public Users getUser(String username)
	{
		Session session = sf.openSession();
		
		Users users = null;
		
		users=session.get(Users.class,username);
		
		System.out.println(users.getUsername()+"  "+users.getPassword());
		
		
		return users;
	}
}