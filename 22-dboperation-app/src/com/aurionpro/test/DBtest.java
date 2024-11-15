package com.aurionpro.test;

import com.aurionpro.db.StudentsDB;

public class DBtest {

	public static void main(String[] args) {
		StudentsDB studentdb =  new StudentsDB();
		
		studentdb.connect();
		
		studentdb.getStudents();
//		studentdb.addStudent();
//		studentdb.upadateStudent();
		studentdb.deleteStudent();
	}
}
