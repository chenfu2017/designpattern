package com.chenfu.dp.state;
public class RestrictedState extends AccountState {

	public RestrictedState(Account acc) {
		this.acc=acc;
	}

	public void deposit(double amount) {
		acc.setBalance(acc.getBalance() + amount);
		checkState();
	}

	public void withdraw(double amount) {
		System.out.println("error");
	}

}
