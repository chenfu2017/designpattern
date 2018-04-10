package com.chenfu.dp.Bridge;

public class RMVB extends Video {
    @Override
    public void play() {
        operatingSystem.decode("rmvb");
    }
}
