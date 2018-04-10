package com.chenfu.dp.Bridge;

public class AVI extends Video {
    @Override
    public void play() {
        operatingSystem.decode("avi");
    }
}
