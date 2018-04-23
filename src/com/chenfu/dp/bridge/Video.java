package com.chenfu.dp.bridge;

public abstract class Video {

    protected OperatingSystem operatingSystem;

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public abstract void play();
}
