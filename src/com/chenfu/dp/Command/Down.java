package com.chenfu.dp.Command;

public class Down implements RemoteControl {
    private Television television;

    public Down(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
            television.downVolume();
    }
}
