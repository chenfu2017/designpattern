package com.chenfu.dp.memento;

public class Client {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(0, 0, 50, 60);
        rectangle.moveTo(10,10);
        System.out.println(rectangle);
        Memento memento = rectangle.createMemento();
        rectangle.moveTo(30,30);
        rectangle.resize(100, 100);
        System.out.println(rectangle);
        rectangle.restore(memento);
        System.out.println(rectangle);

    }

}
