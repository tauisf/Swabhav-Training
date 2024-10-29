package com.aurionpro.comparator;

import java.util.Comparator;

import com.aurionpro.model.Student;

public class StudentsBymarks implements Comparator<Student> {

	@Override
public int compare(Student  student1, Student student2) {
		
		return (int) (student1.getMarks() -   student2.getMarks());
	}


}
