package com.chenfu.dp.singleton;

public class LazySingleton {

    private volatile static LazySingleton lazySingleton = null;

    private LazySingleton() {};

    private static Object syncRoot = new Object();

    public static LazySingleton getInstance() throws InterruptedException {
        if (lazySingleton == null) {
            Thread.sleep(100);
            synchronized (syncRoot) {
                Thread.sleep(100);
                if (lazySingleton == null) {
                    Thread.sleep(100);
                    lazySingleton = new LazySingleton();
                    System.out.println("lazySingleton init");
                } else {
                    System.out.println("syncroot lazySingleton already init");
                }
            }
        } else {
            System.out.println("lazySingleton aleady init");
        }
        return lazySingleton;
    }
}
