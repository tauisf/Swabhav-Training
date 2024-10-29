package com.aurionpro.poc;

public class WarpperInJava {

	public static void main(String[] args) {
		
		// autoboxing Converting primitive data type into object 
		 int a =  15;
		 Integer b = a; // wrapper class is use for converting primitive data in object
		 
		 // we do this to get benifits of oops
	// unboxing converting wrapper into its primitive class
		 Integer a1 = 5;
		 int b1 = a1;

		 System.out.println("Primitive value: " + a);
	        System.out.println("Wrapper object: " + b);
	}

}
