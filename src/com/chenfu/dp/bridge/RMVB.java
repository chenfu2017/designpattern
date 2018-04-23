package com.chenfu.dp.bridge;

public class RMVB extends Video {
    @Override
    public void play() {
        operatingSystem.decode("rmvb");
    }
}
