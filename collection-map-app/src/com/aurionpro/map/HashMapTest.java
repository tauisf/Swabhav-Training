package com.aurionpro.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<Integer, String> students = new HashMap<>();
		
		students.put(1, "Tausif");
		students.put(3, "Atul");
		students.put(2, "Yash");
		students.put(4, "Jayesh");
		
		Set<Map.Entry<Integer,String>> studentsSet = students.entrySet();
		
		for(Map.Entry<Integer,String> entry :studentsSet ) {
			System.out.print(entry.getKey()+"\t"+entry.getValue() );
			System.out.println();
		}

	}

}
