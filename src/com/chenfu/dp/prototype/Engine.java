package com.chenfu.dp.prototype;

import java.io.Serializable;

public class Engine implements Cloneable,Serializable {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    protected Object clone(){
        Engine engine = null;
        try {
            engine = (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return engine;
    }
}
