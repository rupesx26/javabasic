package com.bankapp.model;

public class BankAccount {
//	int accNo;
//	String accHolderName;
//	double balance;
//	String accType;
	
	private int accNo;
	private String accHolderName;
	private double balance;
	private String accType;
	
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	public void withdraw(int amount) {
		double rem_balance = getBalance()-amount;
		if(amount > getBalance()) {
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
	
	public void print() {
			//System.out.println("Account details are ");
			System.out.println("Account No is ---" + getAccNo());
			System.out.println("Account Holder Name is ----" + getAccHolderName());
			System.out.println("Balance is ---- "+ getBalance());
	}
	
	
}
