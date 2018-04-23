package com.chenfu.dp.dynamicproxy;


import org.junit.Test;

import java.lang.reflect.Method;

public class Client {
	@Test
	public void test1(){
		Tank tank = new Tank();
		Moveable m = (Moveable)java.lang.reflect.Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[]{Moveable.class}, new java.lang.reflect.InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("JDK proxy");
				Object result = method.invoke(tank,args);
				return result;
			}
		});
		m.fire();
		m.move();
	}

	@Test
	public void test2() throws Exception {
		Tank t = new Tank();
		InvocationHandler h = new TimeHandler(t);
		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class, h);
		m.move();
		m.fire();
	}
}
