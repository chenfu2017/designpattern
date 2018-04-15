package com.chenfu.dp.Facade;

public class Lamp implements Appliance{

    @Override
    public void open() {
        System.out.println("lamp open");
    }

    @Override
    public void off() {
        System.out.println("lamp off");
    }
}
