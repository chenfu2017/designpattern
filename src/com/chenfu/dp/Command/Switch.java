package com.chenfu.dp.Command;

public class Switch implements RemoteControl {
    private Television television;

    public Switch(Television television) {
        this.television = television;
    }
    @Override
    public void execute() {
        television.turnOver();
    }
}
