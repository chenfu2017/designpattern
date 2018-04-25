package com.chenfu.dp.templatemethod;

public class Sqlserver extends DataAccessor {
    @Override
    public void getConnecton() {
        setConnectionName("Sqlserver");
        System.out.println("Sqlserver connetion...");
    }
}
