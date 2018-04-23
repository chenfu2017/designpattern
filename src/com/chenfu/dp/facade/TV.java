package com.chenfu.dp.facade;

public class TV implements Appliance{

    @Override
    public void open() {
        System.out.println("TV open");
    }

    @Override
    public void off() {
        System.out.println("TV off");
    }
}
