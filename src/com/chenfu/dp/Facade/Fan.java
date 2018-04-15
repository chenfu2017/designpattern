package com.chenfu.dp.Facade;

public class Fan implements Appliance {
    @Override
    public void open() {
        System.out.println("fan open");
    }

    @Override
    public void off() {
        System.out.println("fan off");
    }
}
