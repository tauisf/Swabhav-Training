package com.aurionpro.operator;

public class BitwiseOperators {

	public static void main(String[] args) {
		int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        // Bitwise AND
        int andResult = a & b;
        System.out.println("AND: " + andResult);  // AND: 1

        // Bitwise OR
        int orResult = a | b;
        System.out.println("OR: " + orResult);  // OR: 7

        // Bitwise XOR
        int xorResult = a ^ b;
        System.out.println("XOR: " + xorResult);  // XOR: 6

        // Bitwise NOT
        int notResult = ~a;
        System.out.println("NOT: " + notResult);  // NOT: -6

        // Left shift
        int leftShiftResult = a << 1;
        System.out.println("Left Shift: " + leftShiftResult);  // Left Shift: 10

        // Right shift
        int rightShiftResult = a >> 1;
        System.out.println("Right Shift: " + rightShiftResult);  // Right Shift: 2


	}

}
