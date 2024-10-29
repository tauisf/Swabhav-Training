package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,23,45,67,89);
//		Stream<Integer> numberStream = numbers.stream();
		
		numbers.stream().forEach((number)->System.out.print(number+" "));
	List<Integer> oddNumbers  =	numbers.stream().filter((number)->number%2 != 0).collect(Collectors.toList());
	System.out.println("");
	System.out.println("odd number list");
		oddNumbers.stream().forEach((number)->System.out.print(number+" "));
		numbers.stream().map((number)->number*number).filter((number)-> number>1000).forEach((number)-> System.out.println(number));
	Integer res	=  numbers.stream().reduce(0,(sum,number)-> sum+number);
	System.out.println(res);
	
	 Optional<Integer> max= numbers.stream().max((number1,number2)->Integer.compare(number1, number2));
	 System.out.println(max);
	
	}

}
