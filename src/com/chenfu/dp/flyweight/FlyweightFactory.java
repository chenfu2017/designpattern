package com.chenfu.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<Character,Flyweight> map= new HashMap<Character,Flyweight>();

    public Flyweight getFlyweight(Character state){
        Flyweight flyweight = map.get(state);
        if(flyweight==null){
            flyweight=new ConcreteFlyweight(state);
            map.put(state,flyweight);
        }
        return flyweight;
    }
}
