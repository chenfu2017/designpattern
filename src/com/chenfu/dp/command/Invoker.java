package com.chenfu.dp.command;

public class Invoker {
    private RemoteControl remoteControl;

    public void setRemoteControl(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }
    public void invoke(){
        remoteControl.execute();
    }
}
