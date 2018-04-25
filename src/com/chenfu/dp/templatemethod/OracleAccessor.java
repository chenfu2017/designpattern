package com.chenfu.dp.templatemethod;

public class OracleAccessor extends DataAccessor {
    @Override
    public void getConnecton() {
        setConnectionName("oracle");
        System.out.println("oracle connetion...");
    }
}
