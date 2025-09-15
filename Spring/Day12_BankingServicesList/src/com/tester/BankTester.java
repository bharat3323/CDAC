package com.tester;

import java.util.Scanner;

import com.banking.core.BankAccount;
import com.banking.services.BankingServices;
import com.banking.services.BankingServicesImplement;

public class BankTester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			BankingServices service = new BankingServicesImplement();

			boolean exit = false;
			int ch;

			while (!exit) {

				System.out.println("=======Bank Application=======");
				System.out.println("1. Open Account\n"
						+ "2. Display all details\n"
						+ "3. Deposite\n"
						+ "4. Withdraw\n"
						+ "5. Transfer Fund\n"
						+ "6. Close\n"
						+ "7. Apply Interst to saving account!!\n"
						+ "0. Exit\n");
				System.out.println("Enter your choice: ");
				ch = sc.nextInt();

				try {

					switch (ch) {

						case 1:

							System.out.println("Enter account datails: (customerName, "
									+ " balance, phoneNumber,"
									+ " accType, creationDate)");

							service.openAccount(sc.nextLine(), sc.nextDouble(), sc.next(),
									sc.next(), sc.next());

							System.out.println("Account opened successfully!!!");

							break;

						case 2:

							service.displayBankDetails();

							break;

						case 3:
							System.out.println("Enter the Account No AND Amount to deposite: ");
							service.deposit(sc.nextInt(), sc.nextDouble());
							break;

						case 4:
							System.out.println("Enter the Account No And Amount to Withdraw: ");
							service.withdraw(sc.nextInt(), sc.nextDouble());
							break;

						case 5:
							System.out.println("Enter the Source accNo/Destination accNo/ Transfer amount: ");
							service.transferfund(sc.nextInt(), sc.nextInt(), sc.nextDouble());
							break;

						case 6:
							System.out.println("Enter the Account to delete: ");
							service.close(sc.nextInt());
							break;

						case 7:
							System.out.println("Enter Apply Interst to Saving Account:");

							service.applyInterestToAll(sc.nextDouble());
							break;

						case 0:
							break;

					}// end of switch-case

				} catch (Exception e) {

					sc.nextLine();
					System.out.println(e);
				}

			} // end of while
		} // end of try-with-resources

	}// end of main

}
