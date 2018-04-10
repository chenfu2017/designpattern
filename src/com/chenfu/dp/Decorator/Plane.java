package com.chenfu.dp.Decorator;

public class Plane extends Decorator {

    public Plane(Transformers transformers) {
        super(transformers);
    }

    public void fly(){
        System.out.println("plane fly");
    }
}
