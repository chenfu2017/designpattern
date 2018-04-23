package com.chenfu.dp.bridge;

public class FIV extends Video {
    @Override
    public void play() {
        operatingSystem.decode("flv");
    }
}
