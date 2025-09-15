package com.tester;

import static com.Validation.BankValidation.DuplicateBankAccountException;

import java.util.Scanner;

import com.Exception.DuplicateBankAccountException;
import com.Exception.InsufficianttBalanceException;
import com.banking.core.*;

@SuppressWarnings("unused")
public class TestBank {

	public static void isDuplicateCheck(Object[] bank, BankAccount newAcc, int counter)
			throws DuplicateBankAccountException {

		for (int i = 0; i < counter; i++) {
			if (newAcc.equals(bank[i])) {
				throw new DuplicateBankAccountException("Duplicate account number : " + newAcc.getAccountNumber());
			}
		}

	}

	public static void main(String[] args) {

		// try-with-resources
		try (Scanner sc = new Scanner(System.in);) {

			// before exception
			// BankAccount[] bank = new BankAccount[100];
			// for exception make the Obj instead of Bank
			Object[] bank = new BankAccount[100];

			// bank[0] = new SavingAccount(101, 15000, "Raju", "11111");
			// bank[1] = new CurrentAccount(102, 20000, "shyam", "22222");
			// bank[2] = new SavingAccount(103, 25000, "Babu Bhaiyya", "33333");
			// bank[3] = new CurrentAccount(104, 50000, "Gangadhar", "44444");
			// bank[4] = new SavingAccount(105, 100000, "Shaktiman", "55555");

			int ch;
			boolean exit = false;
			int counter = 0;

			while (!exit) {

				System.out.println("===========Bank Menu===========");
				System.out.println("1. Open savings Account\n"
						+ "2. Open Current Account\n"
						+ "3. Display Account details\n"
						+ "4. Deposit Money\n"
						+ "5. Withdraw Money\n"
						+ "6. Apply Interest\n"
						+ "0. Exit\n");

				System.out.println("Enter your choice: ");
				ch = sc.nextInt();

				switch (ch) {

					case 1:
						int accNum;
						String name;
						double bal;
						String pNum;
						double iRate;

						if (counter < bank.length) {
							System.out.println("*****Enter Account details*****");

							System.out.println("Enter Account Number: ");
							accNum = sc.nextInt();

							System.out.println("Enter Name: ");
							sc.nextLine(); // clear the buffer after previous int/double input
							// previous \n of ch is still in the buffer, this is to absorb it
							name = sc.nextLine(); // now actually read the full name

							System.out.println("Enter Account balance: ");
							bal = sc.nextDouble();

							System.out.println("Enter Phone number: ");
							pNum = sc.next();

							System.out.println("Enter Interest rate(in percentage): ");
							iRate = sc.nextDouble();
							
							BankAccount temp = new SavingAccount(accNum, name, bal, pNum, iRate);

							//bank[counter] = new SavingAccount(accNum, name, bal, pNum, iRate);
							try {
								
								boolean dup=DuplicateBankAccountException(temp, bank);
								
								if(!dup)
									bank[counter]=temp;
								counter++;


			}catch(DuplicateBankAccountException e) {
				System.out.println(e.getMessage());
			}
							//else
//							System.out.println("Sorry! The bank is at it's limit.");

//						counter++;
						}
						break;

					case 2:

						double odLimit;

						if (counter < bank.length) {
							System.out.println("*****Enter Account details*****");

							System.out.println("Enter Account Number: ");
							accNum = sc.nextInt();

							System.out.println("Enter Name: ");
							sc.nextLine();
							name = sc.nextLine();

							System.out.println("Enter Account balance: ");
							bal = sc.nextDouble();

							System.out.println("Enter Phone number: ");
							pNum = sc.next();

							System.out.println("Enter Overdraft limit: ");
							odLimit = sc.nextDouble();

							bank[counter] = new CurrentAccount(accNum, name, bal, pNum, odLimit);

						} else
							System.out.println("Sorry! The bank is at it's limit.");

						counter++;

						break;

					case 3:
						System.out.println();
						System.out.println("------Accounts Summary------");
						System.out.println();

						for (int i = 0; i < counter; i++) {

							System.out.println(bank[i].toString());

						}

						System.out.println();

						break;

					case 4:

						boolean found1 = false;
						System.out.println("Enter account number: ");
						int accN = sc.nextInt();

						for (int i = 0; i < counter; i++) {

							if (accN == ((BankAccount) bank[i]).getAccountNumber()) {
								System.out.println("Enter amount to deposit: ");
								((BankAccount) bank[i]).deposit(sc.nextDouble());

								found1 = true;
								System.out.println("----Deposit Successful!! ");
								break;
							}
						}
						if (found1 == false)
							System.out.println("The account doesn't exist!");

						System.out.println();

						break;

					case 5:

						boolean found2 = false;
						double wthdrwAmt;

						System.out.println("Enter account number: ");
						int acNum = sc.nextInt();

						for (Object b : bank) {

							// automatic upcasting happens here
							if (b != null && (acNum == ((BankAccount) b).getAccountNumber())) {

								found2 = true;

								System.out.println("Enter amount to withdraw: ");
								wthdrwAmt = sc.nextDouble();
								try {
									((BankAccount) b).withdraw(wthdrwAmt);
								} catch (InsufficianttBalanceException e) {
									System.out.println("Exception: " + e.getMessage());
								}

							}
						}

						if (!found2)
							System.out.println("The Account doesn't exist!!");

						break;

					case 6:

						boolean found3 = false;

						System.out.println("Enter Account number: ");
						int accNumb = sc.nextInt();

						for (Object b : bank) {

							if (b != null && ((BankAccount) b).getAccountNumber() == accNumb) {

								found3 = true;
								// downcasting
								if (b instanceof SavingAccount) {
									((SavingAccount) b).applyInterest(((SavingAccount) b).getInterestRate());

									System.out.println("Interest Applied!");
									System.out.println(b.toString());
								} else
									System.out.println("You can't get interest on Current Account balance!");

							} // end of comparison

						} // end of for

						if (!found3)
							System.out.println("Account not found.");

						break;

					case 0:

						System.out.println("Exiting.........");

						exit = true;
						break;

				}// end of switch

			} // end of while

		} // auto sc.close() with try-with-resources

	}// end of main()

}
