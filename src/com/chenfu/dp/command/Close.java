package com.chenfu.dp.command;

public class Close implements RemoteControl {
    private Television television;

    public Close(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.shutdown();
    }
}
