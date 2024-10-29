package com.aurionpro.comparator;

import java.util.Comparator;

import com.aurionpro.model.Student;

public class StudentByRollNo implements Comparator<Student> {

	@Override
	public int compare(Student  student1, Student student2) {
		
		return student1.getRollNo() -   student2.getRollNo();
	}

}
