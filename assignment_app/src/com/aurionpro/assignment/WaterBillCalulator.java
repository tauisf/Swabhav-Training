package com.aurionpro.assignment;

import java.util.Scanner;

public class WaterBillCalulator {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the number of units consumed: ");
	int numOfUnits = scanner.nextInt();
	
	int meter_charges = 75;
	int charges= 0 ;
	if(numOfUnits  <= 100 ) {
		charges = numOfUnits * 5;
	}else if(numOfUnits <=  250 ) {
		charges = numOfUnits * 10;
	}else {
		charges = numOfUnits * 25;
	}
	
	 int Total_water_bill = charges + meter_charges;
	 
	 System.out.println("Total water bill is : "+Total_water_bill);
}

}
