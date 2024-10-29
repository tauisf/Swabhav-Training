package com.aurionpro.test;

public class Test {

	public static void main(String[] args) {

		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			double result = number1 / number2;
			System.out.println("Division is: " + result);
		} catch (ArithmeticException exception) {
			System.out.println("Invalid input. Number2 cannot be 'zero' ");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Wrong input: Enter two integer number ");
		} catch (NumberFormatException exception) {
			System.out.println("Wrong input: Number should be integer ");
		}

	}

}
