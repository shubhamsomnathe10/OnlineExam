package com.onlineexam.project;

public class Student {

	int rno;
	int marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rno, int marks) {
		super();
		this.rno = rno;
		this.marks = marks;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + "]";
	}

}
