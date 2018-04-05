package com.chenfu.dp.Adapter;

public abstract class DataOperater {

    private String pasword;

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    abstract String doEncrypt(int key,String ps);
}
