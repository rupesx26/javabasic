package com.bankapp.test;

import java.util.Scanner;

import com.bankapp.model.BankAccount;
import com.bankapp.model.SavingAccount;

public class TestBankAccount {
	public static void main(String[] arg) {
		try (Scanner sc = new Scanner(System.in)) {
			//bank.setBalance(2000);
			BankAccount bank = new BankAccount();
			System.out.println("select account");
			String accountType = sc.next();
			if(accountType.equalsIgnoreCase("Savings")) {
				SavingAccount savings = new SavingAccount();
				savings.setBalance(3000);
				System.out.println("enter account no");
				int accNo = sc.nextInt();
				savings.setAccNo(accNo);
				System.out.println("enter account name");
				String accName = sc.next();
				savings.setAccHolderName(accName);
				System.out.println("balance" +  savings.getBalance());
				System.out.println("withdraw amount");
				int amt = sc.nextInt();
				System.out.println("withdraw amount"+ amt);
				savings.withdraw(amt);
				System.out.println("withdraw amount" + savings.getBalance());
				System.out.println("deposit amount");
				int amountd = sc.nextInt();
				savings.deposit(amountd);
				System.out.println("withdraw amount" + savings.getBalance());

			} else {
				
			}
			
			
			
		}
		//		bank.setBalance(2000);
//		bank.withdraw(500);
//		bank.print();
		
	}
}
