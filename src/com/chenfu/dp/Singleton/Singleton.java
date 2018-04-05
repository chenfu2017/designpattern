package com.chenfu.dp.Singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){};

    public static Singleton getInstance() throws InterruptedException {

        if(singleton ==null){
            Thread.sleep(100);
            singleton = new Singleton();
            System.out.println("singleton init...");
        }
        return singleton;
    }

}
