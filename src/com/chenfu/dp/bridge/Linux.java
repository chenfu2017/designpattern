package com.chenfu.dp.bridge;

public class Linux implements OperatingSystem {
    @Override
    public void decode(String filetype) {
        System.out.println("linux decode "+ filetype);
    }
}
