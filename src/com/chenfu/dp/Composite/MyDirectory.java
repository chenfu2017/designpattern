package com.chenfu.dp.Composite;

import java.util.ArrayList;
import java.util.List;

public class MyDirectory implements Ifile {

    private List<Ifile> files = new ArrayList<Ifile>();

    private String name;

    public MyDirectory(String name) {
        this.name = name;
    }

    public MyDirectory add(Ifile ifile) {
        files.add(ifile);
        return this;
    }

    @Override
    public void traverse() {

        System.out.println(Client.stringBuffer+"+ "+name);
        Client.stringBuffer.append("    ");
        for (Ifile f:files) {
            f.traverse();
        }
        Client.stringBuffer.delete(0, 4);
    }
}
