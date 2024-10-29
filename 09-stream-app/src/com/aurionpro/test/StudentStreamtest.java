package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;


public class StudentStreamtest {

	public static void main(String[] args) {
		String[] names= {"Jayesh","Nimesh","Mark","Mahesh","Ramesh","Raj"};
		
		
		
		System.out.println("Printing students in ascending order first 3 ");
		Arrays.stream(names,0,3).sorted().forEach((ele) -> System.out.print(ele + " "));
		
		System.out.println();
		System.out.println("Printing students in ascending order first 3  if they contains  a");
		List<String> students	= Arrays.stream(names).limit(3).filter((ele)-> ele.contains("a")).sorted().collect(Collectors.toList());
		System.out.println(students+"\n");
		 
		
		System.out.println("Printing students in desecending order ");
		List<String> students1	=  Arrays.stream(names).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(students1+"\n");
		
		 
		System.out.println("Printing first char  of all students  ");
	    Arrays.stream(names).forEach((ele)->System.out.print(ele.charAt(0)+" "));
		
	    
	    System.out.println();
		System.out.println("Printing students which have  char less or equal to 4 ");
	    Arrays.stream(names).filter((ele)-> ele.length() <= 4).forEach((ele)->System.out.print(ele+" "));
		
	    
	    
	    
	}

}
