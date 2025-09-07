package com.tester;

import java.util.Scanner;
import com.banking.core.*;

public class TestBank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the Size : ");
		BankAccount[] bank = new BankAccount[sc.nextInt()];
		
//		bank[0] = new SavingAccount(101, 15000, "Raju", "11111");
//		bank[1] = new CurrentAccount(102, 20000, "shyam", "22222");
//		bank[2] = new SavingAccount(103, 25000, "Babu Bhaiyya", "33333");
//		bank[3] = new CurrentAccount(104, 50000, "Gangadhar", "44444");
//		bank[4] = new SavingAccount(105, 100000, "Shaktiman", "55555");
		
		int ch;
		boolean exit = false;
		int counter = 0;
		
		while(!exit) {
			
			System.out.println("-----Bank Menu-----");
			System.out.println("1. Open savings Account\n"
					+"2. Open Current Account\n"
					+"3. Display Account details\n"
					+"4. Deposit Money\n"
					+"5. Withdraw Money\n"
					+"6. Amount with intrest\n"
					+"7. Withdraw overdraft\n"
					+"8. Exit\n");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			
			switch(ch) {
			
			case 1: //Saving account created
				if(counter<bank.length) {
					System.out.println("Enter the (accountNumber,balance,customerName,phoneNumber");
					bank[counter]=new SavingAccount(sc.nextInt(),sc.nextDouble(),sc.next(),sc.next());
					counter++;
					System.out.println("Saving Account created successfully!!!!!!");
				}else {
					System.out.println("server down");
				}
				
				break;
			
			case 2://current account created
				if(counter <bank.length) {
					System.out.println("Enter the (accountNumber,balance,customerName,phoneNumber");
					bank[counter]=new CurrentAccount(sc.nextInt(),sc.nextDouble(),sc.next(),sc.next());
					counter++;
					System.out.println("current Account created successfully!!!!!");
				}else {
					System.out.println("Server Down");
					
				}
				break;
			
			case 3: 
				for(BankAccount b: bank) {
					
					if(b != null) {
					System.out.println("-----Account Details-----");
					System.out.println(b);
					}
				}
				break;
			
			case 4: 
				System.out.println("Enter account number: ");
				int accN = sc.nextInt();
				
				for(BankAccount b: bank) {
					
					if(b!=null) {
					
					if(accN == b.getAccountNumber()) {
						System.out.println("Enter amount to deposit: ");
						b.deposit(sc.nextDouble());	
					}
					}else
						System.out.println("Invalid Operation ");
					
				}
				
				//System.out.println("----Deposit Successful!! ");
				
				break;
			
			case 5:
				System.out.println("Enter the account number:");
				int accn=sc.nextInt();
				
				for(BankAccount b: bank) {
					if(b!=null) {
						if(accn == b.getAccountNumber()) {
							System.out.println("Enter the amount to withdraw: ");
							b.withdraw(sc.nextDouble());
							System.out.println("Updated Balance is "+ b.getBalance());
						}
						else {
							System.out.println("Invalid operation");
						}
					}
				}
				
				break;
			
			case 6: 
				//applyInterest() method is not in the parent class access method from the child calss asavingaccount we have to do downcasting!!!
				System.out.println("Enter the Account number: ");
				int accno=sc.nextInt();
				boolean found =false;
				for(BankAccount b: bank) {
					if(b!=null && b.getAccountNumber()==accno) {
						found=true;
						if(b instanceof SavingAccount) {
						System.out.println(((SavingAccount) b).applyInterest()); //safe downcast
						System.out.println("Interest Applied !!!");
				}else {
					System.out.println("This is not the Saving Account!!!");
				}break;
					}
				}
				if(!found) {
					System.out.println("Account not found!!!");
				}
				break;
				
			case 7: 
				System.out.println("Enter the account No: ");
				int acno=sc.nextInt();
				for(BankAccount b: bank) {
					if(b!=null && b.getAccountNumber()==acno) {
						System.out.println("Enter the WithAmt: ");
						System.out.println(b.withdraw(sc.nextDouble()));
					}
				}
				break ;
				
				
			
			case 8: 
				exit = true;
				break;
			
			
			
			}
		
		}
		
		
		
		
		
}

}
