package com.chenfu.dp.state;

public class Account {
	private AccountState state;
	private String owner;
	private double balance;
	
	public Account(String owner) {
		this.owner = owner;
		this.state = new NormalState(this);
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setState(AccountState state) {
		this.state = state;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		state.deposit(amount);
	}

	public void withdraw(double amount) {
		state.withdraw(amount);
	}

	@Override
	public String toString() {
		return "Account{" +
				"state=" + state +
				", owner='" + owner + '\'' +
				", balance=" + balance +
				'}';
	}
}
