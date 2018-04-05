package com.chenfu.dp.Prototype;

import java.awt.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car();
        car1.setName("ben");
        car1.setColor(Color.white);
        Engine engine = new Engine();
        engine.setId(1);
        car1.setEngine(engine);
        Car car2 = (Car) car1.clone();
        System.out.println("---------shallow clone---------");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1==car2);
        System.out.println(car1.equals(car2));
        System.out.println(car1.getEngine()==car2.getEngine());
        System.out.println(car1.getEngine().equals(car2.getEngine()));
        car2 = (Car) car1.deepClone();
        System.out.println("---------deep clone---------");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1==car2);
        System.out.println(car1.equals(car2));
        System.out.println(car1.getEngine()==car2.getEngine());
        System.out.println(car1.getEngine().equals(car2.getEngine()));
        car2 = (Car) car1.serializeClone();
        System.out.println("---------Serialize clone---------");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1==car2);
        System.out.println(car1.equals(car2));
        System.out.println(car1.getEngine()==car2.getEngine());
        System.out.println(car1.getEngine().equals(car2.getEngine()));
    }
}
