package com.chenfu.dp.command;

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
