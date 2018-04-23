package com.chenfu.dp.dynamicproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class TimeHandler implements InvocationHandler {
	
	private Object target;

	public TimeHandler(Object target) {
		super();
		this.target = target;
	}



	@Override
	public void invoke(Object o, Method m) {
		try {
			m.invoke(target);
			System.out.println(new Date());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();

	}

}
