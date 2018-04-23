package com.chenfu.dp.bridge;

public class MP4 extends Video {

    @Override
    public void play() {
       operatingSystem.decode("mp4");
    }
}
