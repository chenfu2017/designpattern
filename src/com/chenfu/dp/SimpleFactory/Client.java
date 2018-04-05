package com.chenfu.dp.SimpleFactory;

public class Client {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit apple = fruitFactory.create("apple");
        apple.show();
        Fruit banana= fruitFactory.create("banana");
        banana.show();
    }
}
