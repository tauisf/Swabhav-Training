package com.aurionpro.operator;

public class UnaryOperators {

	public static void main(String[] args) {
		  // Unary Plus
        int a = +10;
        System.out.println("Unary Plus: " + a);  // 10

        // Unary Minus
        int b = -a;
        System.out.println("Unary Minus: " + b); // -10

        // Increment Operator
        int c = 5;
        System.out.println("Original c: " + c); // 5
        System.out.println("Prefix Increment: " + ++c); // 6
        System.out.println("Postfix Increment: " + c++); // 6
        System.out.println("After Postfix Increment: " + c); // 7

        // Decrement Operator
        int d = 5;
        System.out.println("Original d: " + d); // 5
        System.out.println("Prefix Decrement: " + --d); // 4
        System.out.println("Postfix Decrement: " + d--); // 4
        System.out.println("After Postfix Decrement: " + d); // 3

        // Logical Complement
        boolean e = true;
        System.out.println("Logical Complement: " + !e); // false
    

	}

}
