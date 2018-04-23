package com.chenfu.dp.command;

public class Client {
    public static void main(String[] args) {
        Television tv = new Television();
        Invoker invoker = new Invoker();
        RemoteControl closecmd = new Close(tv);
        invoker.setRemoteControl(closecmd);
        invoker.invoke();
        RemoteControl switchcmd = new Switch(tv);
        invoker.setRemoteControl(switchcmd);
        invoker.invoke();
    }
}
