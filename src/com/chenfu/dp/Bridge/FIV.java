package com.chenfu.dp.Bridge;

public class FIV extends Video {
    @Override
    public void play() {
        operatingSystem.decode("flv");
    }
}
