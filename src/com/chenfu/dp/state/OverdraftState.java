package com.chenfu.dp.state;

public class OverdraftState extends AccountState {

	public OverdraftState(Account acc) {
		this.acc=acc;
	}

	public void deposit(double amount) {
		acc.setBalance(acc.getBalance() + amount);
		checkState();
	}
	
	public void withdraw(double amount) {
		if (acc.getBalance() - amount > -2000) {
			acc.setBalance(acc.getBalance() - amount);
		} else {
			System.out.println("error!");
		}
		checkState();
	}

}
