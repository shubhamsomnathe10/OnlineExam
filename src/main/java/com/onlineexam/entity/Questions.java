package com.onlineexam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Questions {

	@Id
	public
	int qno;
	String question;
	public String option1;
	public String option2;
	public String option3;
	public String option4;
	public String answer;
	public String subject;
	
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Questions(int qno, String question, String option1, String option2, String option3, String option4,
			String answer, String subject) {
		super();
		this.qno = qno;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
		this.subject = subject;
	}

	public int getQno() {
		return qno;
	}

	public void setQno(int qno) {
		this.qno = qno;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Questions [qno=" + qno + ", question=" + question + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", option4=" + option4 + ", answer=" + answer + ", subject=" + subject + "]";
	}
	
	
	
}
