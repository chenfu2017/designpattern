package com.chenfu.dp.Facade;

public class Client {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();
        TV tv = new TV();
        Fan fan = new Fan();

        MainSwitch Switch = new MainSwitch(fan,lamp,tv);
        Switch.open();
        Switch.off();

    }
}
