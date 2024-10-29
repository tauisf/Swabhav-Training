package com.aurionpro.operator;

public class AssignmentOperator {

	public static void main(String[] args) {
		  int a = 10;

	        // Simple Assignment
	        System.out.println("Initial value of a: " + a);  // 10

	        // Add and Assign
	        a += 5; // a = a + 5
	        System.out.println("After += 5: " + a);  // 15

	        // Subtract and Assign
	        a -= 3; // a = a - 3
	        System.out.println("After -= 3: " + a);  // 12

	        // Multiply and Assign
	        a *= 2; // a = a * 2
	        System.out.println("After *= 2: " + a);  // 24

	        // Divide and Assign
	        a /= 4; // a = a / 4
	        System.out.println("After /= 4: " + a);  // 6

	        // Modulus and Assign
	        a %= 5; // a = a % 5
	        System.out.println("After %= 5: " + a);  // 1

	        // Bitwise AND and Assign
	        a &= 3; // a = a & 3
	        System.out.println("After &= 3: " + a);  // 1

	        // Bitwise OR and Assign
	        a |= 2; // a = a | 2
	        System.out.println("After |= 2: " + a);  // 3

	        // Bitwise XOR and Assign
	        a ^= 3; // a = a ^ 3
	        System.out.println("After ^= 3: " + a);  // 0

	        // Left Shift and Assign
	        a = 5;  
	        a <<= 1; // a = a << 1
	        System.out.println("After <<= 1: " + a);  // 10

	        // Right Shift and Assign
	        a >>= 1; // a = a >> 1
	        System.out.println("After >>= 1: " + a);  // 5


	}

}
