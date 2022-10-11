package com.bankapp.model;

public class SavingAccount extends BankAccount {

		public static final int MIN_BALANCE = 1000;
		
		public void withdraw(int amount) {
			System.out.println("inside saving class"+ getBalance());
			System.out.println("inside saving class"+ amount);
			double rem_balance = getBalance()-amount;
			if(amount > MIN_BALANCE) {
				System.out.println("insufficient balance");
			} else {
				System.out.println("withdrawal done successfully");
				setBalance(rem_balance);
			}
		}
		
		public void deposit(int amount) {
			double updated_balance = getBalance()+amount;
			setBalance(updated_balance);
			System.out.println("amount deposited successfully");
		}
		
		public static void main(String[] args) {

			
		}

}
