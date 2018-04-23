package com.chenfu.dp.decorator;

public class Car implements Transformers{

    @Override
    public void move() {
        System.out.println("Car move");
    }
}
