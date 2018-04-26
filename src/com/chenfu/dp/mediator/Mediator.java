package com.chenfu.dp.mediator;

public interface Mediator {

    public void add(Plane plane);

    public void remove(Plane plane);

    public void doManage(Plane plane, String type);

}
