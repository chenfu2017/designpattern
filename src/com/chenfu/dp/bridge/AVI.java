package com.chenfu.dp.bridge;

public class AVI extends Video {
    @Override
    public void play() {
        operatingSystem.decode("avi");
    }
}
