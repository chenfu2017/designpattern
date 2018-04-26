package com.chenfu.dp.mediator;

public class ConcretePlane extends Plane {

    public ConcretePlane(String name) {
        super(name);
    }

    @Override
    public void doSelfMethod(String type) {
        if(type.equals(typeIn)){
            System.out.println(name+" is landing");
        }else if (type.equals(typeOUT)) {
            System.out.println(name+" is taking off");
        }
    }

    @Override
    public void doDepMethod(String type) {
        airportMediator.doManage(this,type);
    }

    @Override
    public void in() {
        doSelfMethod(typeIn);
        doDepMethod(typeIn);
    }

    @Override
    public void out() {
        doSelfMethod(typeOUT);
        doDepMethod(typeOUT);
    }

    @Override
    public void listerMediatorNotification(String notification) {
        System.out.println(name + " has receive notice:"+notification);
    }
}
