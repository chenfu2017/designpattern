package com.chenfu.dp.mediator;

public class Client {
    public static void main(String[] args) {

        ConcretePlane plane1 = new ConcretePlane("bj");
        ConcretePlane plane2 = new ConcretePlane("hn");
        ConcretePlane plane3 = new ConcretePlane("hb");
        ConcretePlane plane4 = new ConcretePlane("sh");
        AirportMediator airportMediator = new AirportMediator();
        plane1.setAirportMediator(airportMediator);
        plane2.setAirportMediator(airportMediator);
        plane3.setAirportMediator(airportMediator);
        plane4.setAirportMediator(airportMediator);
        plane1.in();
        plane2.in();
        plane4.in();
        plane2.out();
        plane3.out();
        plane1.out();

    }
}
