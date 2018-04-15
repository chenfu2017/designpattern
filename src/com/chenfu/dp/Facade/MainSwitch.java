package com.chenfu.dp.Facade;

public class MainSwitch {

    private Fan fan;

    private Lamp lamp;

    private TV tv;

    public MainSwitch() {}

    public MainSwitch(Fan fan, Lamp lamp, TV tv) {
        this.fan = fan;
        this.lamp = lamp;
        this.tv = tv;
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void open(){
        fan.open();
        tv.open();
        lamp.open();
    }

    public void off(){
        fan.off();
        tv.off();
        lamp.off();
    }
}
