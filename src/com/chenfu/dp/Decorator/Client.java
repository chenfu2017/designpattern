package com.chenfu.dp.Decorator;

public class Client {
    public static void main(String[] args) {
        Transformers car = new Car();
        Plane plane = new Plane(car);
        Robot robot = new Robot(plane);
        robot.speak();
        robot.move();
        plane.fly();
        plane.move();

    }
}
