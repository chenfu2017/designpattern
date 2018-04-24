package com.chenfu.dp.state;
public abstract class AccountState {

	protected Account acc;

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public void checkState() {
		if (acc.getBalance() >= 0) {
			acc.setState(new NormalState(acc));
		} else if (acc.getBalance() >= -2000 && acc.getBalance() < 0) {
			acc.setState(new OverdraftState(acc));
		} else {
			acc.setState(new RestrictedState(acc));
		}
	}

	@Override
	public String toString() {
		String packageName=this.getClass().getPackage().getName()+".";
		String s = this.getClass().getName().replaceAll(packageName, "");
		return s;
	}
}