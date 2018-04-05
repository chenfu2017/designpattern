package com.chenfu.dp.Prototype;

import java.awt.*;
import java.io.*;

public class Car implements Cloneable,Serializable {
   private String name;
   private Color color;
   private Engine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected Object deepClone() throws CloneNotSupportedException {
        Car c = null;
        c= (Car) super.clone();
        c.setEngine((Engine) engine.clone());
        return c;
    }

    public Object serializeClone() throws Exception{

        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bo);
        out.writeObject(this);

        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        oi.close();bi.close();out.close();bo.close();
        return oi.readObject();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", engine=" + engine.getId() +
                '}';
    }
}
