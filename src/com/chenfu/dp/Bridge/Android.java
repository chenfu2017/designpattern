package com.chenfu.dp.Bridge;

public class Android implements OperatingSystem {
    @Override
    public void decode(String filetype) {
        System.out.println("Android decode "+ filetype);
    }
}
