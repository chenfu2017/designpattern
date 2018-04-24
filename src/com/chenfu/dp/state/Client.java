package com.chenfu.dp.state;

public class Client {
    public static void main(String[] args) {

        Account user = new Account("tom");
        System.out.println(user);
        user.withdraw(2600);
        System.out.println(user);
        user.deposit(2000);
        System.out.println(user);

    }
}
