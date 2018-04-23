package com.chenfu.dp.adapter;

public class DogAdapter extends Dog implements Robot{


    @Override
    public void cry() {
        System.out.println("loading... dog adapter wang");
        wang();
    }

    @Override
    public void move() {
        System.out.println("loading... dog adapter move");
        run();
    }
}
