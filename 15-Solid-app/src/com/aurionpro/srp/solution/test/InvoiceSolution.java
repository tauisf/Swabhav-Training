package com.aurionpro.srp.solution.test;

import java.util.Scanner;

import com.aurionpro.srp.solution.model.Invoice;
import com.aurionpro.srp.solution.model.PrintInvoice;
import com.aurionpro.srp.solution.model.TaxCalculator;

public class InvoiceSolution {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the id : ");
		int id = scanner.nextInt();
		
		System.out.print("Enter the Name : ");
		String name = scanner.next();

		System.out.print("Enter the Amount : ");
		double amount = scanner.nextDouble();

		System.out.print("Enter the tax percentage : ");
		double taxPercentage = scanner.nextDouble();

		Invoice invoice = new Invoice(id,"name",amount,taxPercentage);
		
		TaxCalculator taxCal = new  TaxCalculator();
		
		PrintInvoice print = new PrintInvoice();
		
		print.printInvoice(invoice, taxCal);


	}

}
