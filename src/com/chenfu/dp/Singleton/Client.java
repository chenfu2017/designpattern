package com.chenfu.dp.Singleton;

public class Client implements Runnable{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Client());
        t1.start();
        Thread t2 = new Thread(new Client());
        t2.start();
        Thread t3 = new Thread(new Client());
        t3.start();
    }
    @Override
    public void run() {
        try {
            Singleton.getInstance();
            LazySingleton.getInstance();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
