package com.chenfu.dp.memento;

public class Rectangle {
    private int x,y,width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveTo(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public void resize(int width, int height) {
        this.width=width;
        this.height=height;
    }

    public Memento createMemento() {
        return new Memento(x, y, width, height);
    }

    public void restore(Memento memento) {
        x = memento.getX();
        y = memento.getY();
        width = memento.getWidth();
        height = memento.getHeight();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
