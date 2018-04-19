package com.chenfu.dp.Composite;

import java.util.ArrayList;
import java.util.List;

public class MyDirecyory implements Ifile {

    private List<Ifile> files = new ArrayList<Ifile>();

    private String name;

    public MyDirecyory(String name) {
        this.name = name;
    }

    public MyDirecyory add(Ifile ifile) {
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
