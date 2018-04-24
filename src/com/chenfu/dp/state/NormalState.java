package com.chenfu.dp.state;
public class NormalState extends AccountState {


	public NormalState(Account acc) {
		this.acc=acc;
	}

	@Override
	public void deposit(double amount) {
			acc.setBalance(acc.getBalance() + amount);
	}

	public void withdraw(double amount) {
			acc.setBalance(acc.getBalance() - amount);
			checkState();
	}

}