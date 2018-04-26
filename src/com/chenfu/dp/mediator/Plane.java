package com.chenfu.dp.mediator;

public abstract class Plane {

    public static String typeIn = "in";
    public static String typeOUT = "out";

    protected String name;

    protected AirportMediator airportMediator;

    public Plane(String name) {
        this.name = name;
    }

    public void setAirportMediator(AirportMediator airportMediator) {
        this.airportMediator = airportMediator;
    }

    public void doSelfMethod(String type){};

    public void doDepMethod(String type){};

    public void in(){};

    public void out(){};

    public abstract void listerMediatorNotification(String notification);

}
