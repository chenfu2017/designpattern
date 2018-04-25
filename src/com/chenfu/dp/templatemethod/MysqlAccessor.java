package com.chenfu.dp.templatemethod;

public class MysqlAccessor extends DataAccessor {

    @Override
    public void getConnecton() {
        setConnectionName("mysql");
        System.out.println("mysql connetion...");
    }

    @Override
    public boolean isEncrypt() {
        return false;
    }
    
}
