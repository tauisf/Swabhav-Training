package com.aurionpro.test;

import java.util.*;

import com.aurionpro.model.Student;

public class HashSetTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Student> students = new HashSet<>();

		System.out.print("Enter the number students you want to enter: ");
		int number = scanner.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.print("Enter the name of the student: ");
			String name = scanner.next();
			System.out.print("Enter the RollNo of the student: ");
			int rollNo = scanner.nextInt();
			Student student = new Student(name, rollNo);
			students.add(student);
		}

		for (Student student : students) {
			System.out.println(student);
		}

	}

}
