package com.chenfu.dp.bridge;

public class Windows implements OperatingSystem {
    @Override
    public void decode(String filetype) {
        System.out.println("windows decode "+ filetype);
    }
}
