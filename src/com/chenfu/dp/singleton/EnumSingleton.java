package com.chenfu.dp.singleton;

public class EnumSingleton {


    private EnumSingleton(){};

    public static EnumSingleton getInstance(){
        return Singleton.instance.getInstance();
    }

    private enum Singleton{
        instance;

        private EnumSingleton singleton;
        //JVM保证只调用一次
        Singleton(){
            singleton = new EnumSingleton();
        }

        public EnumSingleton getInstance(){
            return singleton;
        }

    }

}
