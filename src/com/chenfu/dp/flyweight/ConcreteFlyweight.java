package com.chenfu.dp.flyweight;

public class ConcreteFlyweight implements Flyweight {

    private Character intrinsicState=null;

    public ConcreteFlyweight(Character intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String state) {
        System.out.println("intrinsicState:"+intrinsicState);
        System.out.println("extrinsicState:"+state);
    }
}
