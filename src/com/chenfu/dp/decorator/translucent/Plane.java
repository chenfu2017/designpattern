package com.chenfu.dp.decorator.translucent;

public class Plane extends Decorator {

    public Plane(Transformers transformers) {
        super(transformers);
    }

    public void fly(){
        System.out.println("plane fly");
    }
}
