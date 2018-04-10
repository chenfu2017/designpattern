package com.chenfu.dp.Bridge;

public abstract class Video {

    protected OperatingSystem operatingSystem;

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public abstract void play();
}
