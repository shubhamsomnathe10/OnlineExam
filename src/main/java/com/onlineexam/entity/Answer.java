package com.onlineexam.entity;

public class Answer {

	public int qno;
	String question;
	public String submittedAnswer;
	public String originalAnswer;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int qno, String question, String submittedAnswer, String originalAnswer) {
		super();
		this.qno = qno;
		this.question = question;
		this.submittedAnswer = submittedAnswer;
		this.originalAnswer = originalAnswer;
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

	public String getSubmittedAnswer() {
		return submittedAnswer;
	}

	public void setSubmittedAnswer(String submittedAnswer) {
		this.submittedAnswer = submittedAnswer;
	}

	public String getOriginalAnswer() {
		return originalAnswer;
	}

	public void setOriginalAnswer(String originalAnswer) {
		this.originalAnswer = originalAnswer;
	}

	@Override
	public String toString() {
		return "Answer [qno=" + qno + ", question=" + question + ", submittedAnswer=" + submittedAnswer
				+ ", originalAnswer=" + originalAnswer + "]";
	}

}
