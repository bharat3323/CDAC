package com.tester;
import java.util.Scanner;
import com.banking.core.*;

public class TestBank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		BankAccount[] bank = new BankAccount[100];
		
		bank[0] = new SavingAccount(101, 15000, "Raju", "11111");
		bank[1] = new CurrentAccount(102, 20000, "shyam", "22222");
		bank[2] = new SavingAccount(103, 25000, "Babu Bhaiyya", "33333");
		bank[3] = new CurrentAccount(104, 50000, "Gangadhar", "44444");
		bank[4] = new SavingAccount(105, 100000, "Shaktiman", "55555");
		
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
					+"6. Exit\n");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			
			switch(ch) {
			
			case 1: break;
			
			case 2: break;
			
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
				
				System.out.println("----Deposit Successful!! ");
				
				break;
			
			case 5: break;
			
			case 6: 
				exit = true;
				break;
			
			
			
			}
		
		}
		
		
		
		
		
}
		
	}

		

