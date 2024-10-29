package com.aurionpro.test;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.comparator.StudentByName;
import com.aurionpro.comparator.StudentByRollNo;
import com.aurionpro.comparator.StudentsBymarks;
import com.aurionpro.model.Student;

public class LinkedListTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Student> students = new LinkedList<>();

		System.out.print("Enter the number students you want to enter: ");
		int number = scanner.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.print("Enter the name of the student: ");
			String name = scanner.next();
			System.out.print("Enter the RollNo of the student: ");
			int rollNo = scanner.nextInt();
			System.out.print("Enter the marks of the student: ");
			int marks = scanner.nextInt();

			Student student = new Student(name, rollNo, marks);
			students.add(student);
		}

		Collections.sort(students, new StudentByName());
		
		for (Student student : students) {
			System.out.println(student);
		}
		scanner.close();
	}

}
