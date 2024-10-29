package com.aurionpro.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		System.out.println(numbers);
		numbers.add(1,30); // adding at index one
		
		System.out.println(numbers);
	}

}
