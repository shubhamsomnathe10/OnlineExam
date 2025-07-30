package com.onlineexam.project;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onlineexam.entity.Users;



@Controller
public class RegistrationController {

	@Autowired
	SessionFactory sf;

	@RequestMapping("saveUserData")
	public ModelAndView saveuserdata(Users user) {
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(user);
		tx.commit();
		
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("login");
		modelandview.addObject("message", "Registration Successful Do login now.....");

		return modelandview;
	}
}
