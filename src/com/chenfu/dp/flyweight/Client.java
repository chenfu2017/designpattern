package com.chenfu.dp.flyweight;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f1 = factory.getFlyweight('a');
        f1.operation("first");
        Flyweight f2 = factory.getFlyweight('b');
        f2.operation("second");
        Flyweight f3 = factory.getFlyweight('a');
        f3.operation("third");

        System.out.println(f1==f2);
        System.out.println(f1==f3);
    }
}
