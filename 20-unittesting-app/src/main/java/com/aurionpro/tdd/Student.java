package com.aurionpro.tdd;

public class Student {

	private IStuedntService studentService;

	public Student(IStuedntService studentService) {
		super();
		this.studentService = studentService;
	}
	
	
	public double getPercentage() {
		
		return studentService.getMarks()/studentService.GetSubjectNumber();
	}
}
