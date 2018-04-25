package com.chenfu.dp.templatemethod;

public abstract class DataAccessor {

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    private String connectionName;

    public abstract void getConnecton();

    public void encrypt(){
        if (isEncrypt()) {
            System.out.println("already encrypt!");
            System.out.println("cipher text");
        } else {
            System.out.println("clear text");
        }
    }

    public void query(){
        System.out.println(connectionName+".execute();");
    }


    public void close(){
        System.out.println(connectionName+".close();");
    }

    public boolean isEncrypt(){
        return true;
    }

    public void display(){
        getConnecton();
        encrypt();
        query();
        close();
    }
}
