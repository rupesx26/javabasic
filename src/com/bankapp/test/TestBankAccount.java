package com.bankapp.test;

import java.util.Scanner;

import com.bankapp.model.BankAccount;

public class TestBankAccount {
	public static void main(String[] arg) {
		BankAccount bank = new BankAccount();
		try (Scanner sc = new Scanner(System.in)) {
			bank.setBalance(2000);
			System.out.println("enter account no");
			int accNo = sc.nextInt();
			bank.setAccNo(accNo);
			System.out.println("enter account name");
			String accName = sc.next();
			bank.setAccHolderName(accName);
			System.out.println("withdraw amount");
			int amt = sc.nextInt();
			bank.withdraw(amt);
			System.out.println("deposit amount");
			int amountd = sc.nextInt();
			bank.deposit(amountd);
		}
		//		bank.setBalance(2000);
//		bank.withdraw(500);
		bank.print();
		
	}
}
