package com.chenfu.dp.Decorator;

public abstract class Decorator implements Transformers{

    private Transformers transformers;

    public Decorator(Transformers transformers) {
        this.transformers = transformers;
    }

    @Override
    public void move() {
        transformers.move();
    }
}
