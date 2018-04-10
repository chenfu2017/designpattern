package com.chenfu.dp.Bridge;

public class MP4 extends Video {

    @Override
    public void play() {
       operatingSystem.decode("mp4");
    }
}
