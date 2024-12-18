package com.aurionpro.decorator.hat.test;

import java.util.Scanner;

import com.aurionpro.decorator.hat.model.HatService;
import com.aurionpro.decorator.hat.model.IHat;

public class HatTest {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			HatService service = new HatService();
			
			System.out.print("Choose hat to make 1.Standrad 2.Preminum: ");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				IHat hat = service.createStandradHat();
				System.out.println("Choose a Decorator  to add: ");
				System.out.print("1.GoldenRibbon 2.SilverRibbon: ");
				int addChoice = scanner.nextInt();
				double price;
				
				switch(addChoice) {
				case 1:
					price = service.addGoldenRibbon(hat).getPrice();
					System.out.println(price);
					break;
				case 2:
					price =service.addSilverRibbon(hat).getPrice();
					System.out.println(price);
					break;
				default: System.out.println("Invalid Choice !");
			
				}
				
				break;
			case 2:
				hat = service.createPremiumHat();
				System.out.println("Choose a Decorator  to add: ");
				System.out.print("1.GoldenRibbon 2.SilverRibbon: ");
				 addChoice = scanner.nextInt();
				
				switch(addChoice) {
				case 1:
					price = service.addGoldenRibbon(hat).getPrice();
					System.out.println(price);
					break;
				case 2:
					price = service.addSilverRibbon(hat).getPrice();
					System.out.println(price);
					break;
				default: System.out.println("Invalid Choice !");
			
				}
				break;
				
			default: System.out.println("Invalid Choice !");
			}
			
			
		}
}
