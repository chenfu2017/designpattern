package com.chenfu.dp.Facade;

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
