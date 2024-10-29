package com.aurionpro.srp.voliation.test;

import java.util.Scanner;

import com.aurionpro.srp.voliation.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the id : ");
		int id = scanner.nextInt();
		
		System.out.print("Enter the Name : ");
		String name = scanner.nextLine();

		System.out.print("Enter the Amount : ");
		double amount = scanner.nextDouble();

		System.out.print("Enter the tax percentage : ");
		double taxPercentage = scanner.nextDouble();

		
		Invoice invoice = new Invoice(id,"name",amount,taxPercentage);

		System.out.println(invoice);

	}

}
