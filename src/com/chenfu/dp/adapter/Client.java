package com.chenfu.dp.adapter;
import org.junit.Test;

public class Client {
    @Test
    public void fun1(){
        Robot robot = new DogAdapter();
        robot.cry();
        robot.move();
    }
    @Test
    public void fun2(){
       DataOperater dataOperater = new CipherAdapter();
       System.out.println(dataOperater.doEncrypt(1, "23456789"));
    }
}
