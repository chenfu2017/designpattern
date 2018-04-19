package com.chenfu.dp.Composite;

public class MyFile implements Ifile {

    private String name;

    public MyFile(String name) {
        this.name = name;
    }

    @Override
    public void traverse() {
        System.out.println(Client.stringBuffer+"- "+name);
    }
}
