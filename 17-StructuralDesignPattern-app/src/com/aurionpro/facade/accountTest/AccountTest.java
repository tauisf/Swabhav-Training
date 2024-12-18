package com.aurionpro.facade.accountTest;

import java.util.Scanner;

import com.aurionpro.facade.accountmodel.AccountService;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		AccountService service = new AccountService();

		boolean createAccount = true;

		while (createAccount) {
			System.out.println("Choose Account type to create :1.Saving  2.Current 3.Exit ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				service.createSavingAccount(101, "Tausif", 10000);

				boolean performingOperation = true;
				while (performingOperation) {
					System.out.println("choose operation to perform ");
					System.out.println("1.Debit 2.Credit 3.Exit");
					int userChoice = scanner.nextInt();
					switch (userChoice) {
					case 1:
						service.debit(101, 100);
						break;
					case 2:
						service.credit(101, 1000);
						break;
					case 3:
						performingOperation = false;
						break;
					default:
						System.out.println("Enter Valid choice");
						break;
					}
				}
				break;
			case 2:
				service.createCurrentAccount(310, "Zaid", 12020);
				performingOperation = true;
				while (performingOperation) {
					System.out.println("choose operation to perform ");
					System.out.println("1.Debit 2.Credit 3. Overdraft 4.Exit");
					int userChoice = scanner.nextInt();
					switch (userChoice) {
					case 1:
						service.debit(310, 1000);
						break;
					case 2:
						service.credit(310, 1000);
						break;
					case 3 :
						service.applyOverdraft(310, 40000);
						break;
					case 4:
						performingOperation = false;
						break;
					
						
					default:
						System.out.println("Enter Valid choice");
					}
				}
				break;
			case 3:
				createAccount = false;
				break;
				
			default: System.out.println("Enter Valid choice");
				
			}
		}

	}
}
