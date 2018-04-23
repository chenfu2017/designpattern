package com.chenfu.dp.decorator;

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
