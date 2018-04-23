package com.chenfu.dp.abstractfactory;

public class SpringButton implements Button {
    @Override
    public void show() {
        System.out.println("spring button");
    }
}
