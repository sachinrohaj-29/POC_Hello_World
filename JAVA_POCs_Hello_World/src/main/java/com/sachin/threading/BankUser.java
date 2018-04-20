package com.sachin.threading;

public class BankUser implements Runnable {

	private BankAccount ba = new BankAccount();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankUser bu = new BankUser();
		Thread t1 = new Thread(bu);
		Thread t2 = new Thread(bu);
		t1.setName("sachin");
		t2.setName("naveen");
		
		t1.start();
		t2.start();
	}
	
	public void run() {
		for(int i=0; i<5; i++){
			makeWithdrawl(30);
			if(ba.getBalance() < 0 )
				System.out.println("Overdrawn");
		}
	}

	private synchronized void makeWithdrawl(int amount) {
		// TODO Auto-generated method stub
		if(ba.getBalance() >= amount){
			System.out.println(Thread.currentThread().getName() + " in for transaction." + ". Balance is: " + ba.getBalance());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + " woke up.");
			ba.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " completes the transaction." + ". Balance is: " + ba.getBalance());
		}
		else
			System.out.println("Not enought money for: " + Thread.currentThread().getName() + ". Balance is: " + ba.getBalance());
	}

}
