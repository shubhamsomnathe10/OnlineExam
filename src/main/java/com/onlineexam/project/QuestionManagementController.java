package com.onlineexam.project;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onlineexam.entity.Questions;

@Controller
public class QuestionManagementController {

	@Autowired
	SessionFactory sf;

	@RequestMapping("addQuestion")
	public ModelAndView addQuestion(Questions questions) {

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(questions);
		tx.commit();

		ModelAndView mv = new ModelAndView();
		mv.setViewName("questionmanagement");
		mv.addObject("message", "Question Added...");

		return mv;
	}
	
	@RequestMapping("viewQuestion")
	public ModelAndView viewQuestion(Integer qno,String subject)
	{
		Session session = sf.openSession();
		
		Query<Questions> query=session.createQuery("from Questions where qno=:qno and subject=:subject");
		query.setParameter("qno",qno);
		query.setParameter("subject",subject);
		
		List<Questions> list=query.list();
		
		Questions question=list.get(0);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("questionmanagement");
		mv.addObject("question",question);
		mv.addObject("message","Question Viewed");
		
		
		return mv;
	}
	
	@RequestMapping("updateQuestion")
	public ModelAndView updateQuestion(Questions questions) 
	{
	Session session=	sf.openSession();
	
	Transaction  tx = session.beginTransaction();
	
	Query<Questions> query =session.createQuery("update Questions set option1=:option1,option2=:option2,option3=:option3,option4=:option4,answer=:answer where qno=:qno and subject=:subject");
	query.setParameter("qno", questions.qno);
	query.setParameter("subject", questions.subject);
	query.setParameter("option1", questions.option1);
	query.setParameter("option2", questions.option2);
	query.setParameter("option3", questions.option3);
	query.setParameter("option4", questions.option4);
	query.setParameter("answer", questions.answer);
	
	query.executeUpdate();
	tx.commit();
	
	ModelAndView mv = new ModelAndView();
	mv.setViewName("questionmanagement");
	mv.addObject("message","Question Updated");
	
		return mv;
	}
	
	@RequestMapping("deleteQuestion")
	public ModelAndView deleteQuestion(Questions questions)
	{
		
		Session session =sf.openSession();
		Transaction tx = session.beginTransaction();
		Query<Questions> query = session.createQuery("delete from Questions where qno=:qno and subject=:subject");
		query.setParameter("qno", questions.qno);
		query.setParameter("subject", questions.subject);
		query.executeUpdate();
		tx.commit();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("questionmanagement");
		mv.addObject("message","Question Deleted");
		return mv;
	}
}
