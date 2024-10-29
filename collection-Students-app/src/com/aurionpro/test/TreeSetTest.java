package com.aurionpro.test;

import java.util.Scanner;
import java.util.*;

import com.aurionpro.model.Student;

public class TreeSetTest {

	public static void main(String[] args) { // by roll no
		Scanner scanner = new Scanner(System.in);
		Set<Student> students = new TreeSet<>();

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
