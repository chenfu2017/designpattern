package com.chenfu.dp.decorator;

public class Robot extends Decorator {

    public Robot(Transformers transformers) {
        super(transformers);
    }

    public void speak() {
        System.out.println("I am a rot");
    }
}
