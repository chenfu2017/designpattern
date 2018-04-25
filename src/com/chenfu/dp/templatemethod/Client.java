package com.chenfu.dp.templatemethod;

public class Client {
    public static void main(String[] args) {

        DataAccessor dataAccessor = new MysqlAccessor();
        dataAccessor.display();
        dataAccessor = new OracleAccessor();
        dataAccessor.display();
    }
}
