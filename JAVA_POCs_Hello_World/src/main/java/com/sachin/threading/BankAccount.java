package com.sachin.threading;

public class BankAccount {

	private int balance = 100;
	
	public synchronized int getBalance(){
		return balance;
	}
	
	public synchronized void withdraw(int amount){
		balance = balance - amount;
	}
}
