package com.aurionpro.ocp.solution.test;

import java.util.Scanner;

import com.aurionpro.ocp.solution.model.Christmas;
import com.aurionpro.ocp.solution.model.Diwali;
import com.aurionpro.ocp.solution.model.FixedDeposit;
import com.aurionpro.ocp.solution.model.Holi;
import com.aurionpro.ocp.solution.model.IFestivalOffer;
import com.aurionpro.ocp.solution.model.NewYear;

public class FixedDepositApp {

	public static void main(String[] args) {
		
	

	Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter the Account No : ");
			int accNo = scanner.nextInt();
			
			System.out.print("Enter the Name : ");
			String name = scanner.next();
			scanner.nextLine();
			System.out.print("Enter the  Principle Amount : ");
			double amount = scanner.nextDouble();
	
			System.out.print("Enter the duration : ");
			int duration = scanner.nextInt();
			
			System.out.println("Enter the festival offer  : ");
			System.out.println("1.Diwali 2.Holi 3.Christmas 4.NewYear:  ");
			int offer = scanner.nextInt();
			
			IFestivalOffer festival = null;
			switch(offer){
			
			case 1: 
				IFestivalOffer diwaliFestival = new Diwali();
				 festival = diwaliFestival;
				 break;
			case 2: 
				IFestivalOffer holiFestival = new Holi();
				festival =holiFestival;
				 break;
			case 3: 
				IFestivalOffer christmasFestival = new Christmas();
				festival =christmasFestival;
				 break;
			case 4: 
				IFestivalOffer newYear = new NewYear();
				festival =newYear;
				 break;
			default:System.out.println("Enter valid choices");
			
			}
			
			
			FixedDeposit fixedDeposit = new FixedDeposit(accNo,name,amount,duration,festival);
			fixedDeposit.calculateInterest(festival);
	
			System.out.println(fixedDeposit.toString());
		
	}
}
