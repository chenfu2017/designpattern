package com.chenfu.dp.Proxy;

public class Tank implements Moveable {

	@Override
	public void move() {
		System.out.println("Tank Moving...");
	}

	@Override
	public void fire() {
		System.out.println("fire fire fire");
	}
}
