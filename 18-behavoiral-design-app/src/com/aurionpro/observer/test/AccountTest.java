package com.aurionpro.observer.test;

import java.util.Scanner;

import com.aurionpro.observer.model.Account;
import com.aurionpro.observer.model.EmailNotifier;
import com.aurionpro.observer.model.INotifier;
import com.aurionpro.observer.model.SMSNotifier;
import com.aurionpro.observer.model.WhatsappNotifier;

public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account(100,"Tausif",10000);
		boolean operating = true ;
		while(operating) {
		System.out.println("Enter a choice 1.Select notifiers 2.Credit 3.Debit 4.Exit ");
		int choice = scanner.nextInt();
		
			switch(choice) {
			case 1: 
				boolean choose = true;
				while(choose) {
					System.out.println("Select option to get the notification ");
					System.out.println("1.Whatsapp 2.Sms 3.Email 4.Exit");
					int chose = scanner.nextInt();
					
					switch(chose) {
					case 1:
						INotifier whatsapp = new WhatsappNotifier();
						account.addNotifier(whatsapp);
						break;
					case 2:
						INotifier sms = new SMSNotifier();
						account.addNotifier(sms);
						break;
					case 3:
						INotifier email = new EmailNotifier();
						account.addNotifier(email);
						break;
					case 4 : 
						choose = false;
						break;
					default:System.out.println("Enter Valid choice!");
					}
				}
				break;
			case 2:
				if(account.getNotifiers().isEmpty()) {
					System.out.println("Please Select Notifier! ");
					break;
				}
				account.credit(1000);
				account.display();
				break;
			case 3:
				if(account.getNotifiers().isEmpty()) {
					System.out.println("Please Select Notifier! ");
					break;
				}
				account.debit(100);
				account.display();
				break;
			case 4:
				operating = false;
				break;
			default:System.out.println("Enter Valid choice!");
			}
		}
	}

}
