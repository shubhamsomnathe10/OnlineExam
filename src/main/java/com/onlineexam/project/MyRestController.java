package com.onlineexam.project;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineexam.entity.Questions;

@RestController
public class MyRestController {

	@Autowired
	SessionFactory sf;
	
	@RequestMapping("getStudent")
	public Student getStudent() {
		Student student = new Student();
		student.rno=1;
		student.marks=100;
		return student;
	}
	
	@RequestMapping("getAllSubjects")
	public Set<String> getAllSubjects()
	{
		Session session= sf.openSession();
		Criteria criteria = session.createCriteria(Questions.class);
		criteria.setProjection(Projections.property("subject"));
		
		List<String> list=criteria.list();
		
		HashSet<String> set=new HashSet<String>();
		set.addAll(list);
		
		return set;
	}

}
