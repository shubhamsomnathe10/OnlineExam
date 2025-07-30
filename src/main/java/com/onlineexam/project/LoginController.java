package com.onlineexam.project;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onlineexam.entity.Answer;
import com.onlineexam.entity.Questions;
import com.onlineexam.service.LoginService;



@Controller
public class LoginController {

	@Autowired
	SessionFactory sf;

	@Autowired
	LoginService loginservice;

	@RequestMapping("/")
	public String showLogin() {
		return "login";
	}

	@RequestMapping("showRegister")
	public String showRegister() {
		return "register";
	}

	@RequestMapping("validate")
	public ModelAndView validate(String username, String password, HttpServletRequest request) {
		System.out.println("Username From Browser" + username);
		System.out.println("Password From Browser" + password);

		ModelAndView mv = new ModelAndView();

		Session session = sf.openSession();

		if (username.equals("admin") && password.equals("admin")) {
			mv.setViewName("questionmanagement");
			mv.addObject("message", "welcome  " + username);
		} 
		else if (loginservice.validate(username, password)) {
			HttpSession httpsession = request.getSession();
			httpsession.setAttribute("username", username);

			mv.setViewName("welcome");
			mv.addObject("message", "welcome " + username);

		} else {
			mv.setViewName("login");
			mv.addObject("message", "Invalid Credentials...");
		}
		return mv;

	}

	@RequestMapping("startExam")
	public ModelAndView startExam(String selectedSubject, HttpServletRequest request) {
//		System.out.println(selectedSubject);
		Session session = sf.openSession();

		HttpSession httpsession = request.getSession();
		httpsession.setAttribute("qno", 0);

		httpsession.setAttribute("timeremaining", 61);

		List<Questions> listOfQuestions = session.createCriteria(Questions.class)
				.add(Restrictions.eq("subject", selectedSubject)).list();
		// Now By using hibernet Query Language
//		Query query = session.createQuery("from Questions where subject = :subject");
//		query.setParameter("subject",selectedSubject);
//		List listOfQuestions = query.list();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("questions");
		mv.addObject("listOfQuestions", listOfQuestions);
		mv.addObject("question", listOfQuestions.get(0));
		httpsession.setAttribute("allquestions", listOfQuestions);

		HashMap<Integer, Answer> hashmap = new HashMap<Integer, Answer>();
		httpsession.setAttribute("submittedDetails", hashmap);

		httpsession.setAttribute("score", 0);
		httpsession.setAttribute("subject", selectedSubject);

		return mv;
	}
}
