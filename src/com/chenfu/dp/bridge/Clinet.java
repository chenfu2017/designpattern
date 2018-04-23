package com.chenfu.dp.bridge;

public class Clinet {
    public static void main(String[] args) {
        OperatingSystem os = new Android();
        Video video = new RMVB();
        video.setOperatingSystem(os);
        video.play();

        os = new Windows();
        video = new FIV();
        video.setOperatingSystem(os);
        video.play();

    }
}
