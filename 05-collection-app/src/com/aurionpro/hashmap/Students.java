package com.aurionpro.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		
		Scanner  scanner = new Scanner(System.in);
		HashMap<String ,Integer > students = new HashMap<String ,Integer>();
		students.put("Tausif",100);
		students.put("Abhishek",100);
		students.put("Ashish",100);
		
		
		
		System.out.println("Do you want display or remove (d/r)");
		String choice = scanner.next();
		
		
			
		handleChoice(students,choice ,scanner);
		
		
	}
	private static void handleChoice(HashMap<String ,Integer > students,String choice ,Scanner scanner) {
		if(choice.equals("d")) {
			display(students);
		}else {
		remove(students ,scanner);
		}
	}
	public static void display(HashMap<String ,Integer > students ) {
		 
			System.out.println(students);
		
	}
		public static void remove(HashMap<String ,Integer > students,Scanner scanner) {
			System.out.println("enter the name of students");
			String name = scanner.next();
			if(students.containsKey(name)) { 
				students.remove(name);
				System.out.println(students);
			}else {
				System.out.println("Student doesn't exsist!");
			}
			
	}

}
