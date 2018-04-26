package com.chenfu.dp.mediator;
import java.util.LinkedList;
import java.util.List;

public class AirportMediator implements Mediator{

    private Boolean isError = false;

    private List<Plane> planes = new LinkedList<Plane>();
    @Override
    public void add(Plane plane) {
        planes.add(plane);
    }

    @Override
    public void remove(Plane plane) {
        planes.remove(plane);
    }

    @Override
    public void doManage(Plane plane, String type) {
        if(type.equals(plane.typeIn)){
            if(!planes.contains(plane)){
                planes.add(plane);
            }
        }else if (type.equals(plane.typeOUT)) {
            if(planes.contains(plane)){
                planes.remove(plane);
            } else {
                isError = true;
                System.out.println("error!");
            }
        }
        if(isError == false){
            for (Plane p:planes) {
                if(p.equals(plane)){
                    continue;
                }
                p.listerMediatorNotification(plane.name+"-"+type);
            }
        }
        isError = false;
    }
}
