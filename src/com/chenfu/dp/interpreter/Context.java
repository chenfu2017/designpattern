package com.chenfu.dp.interpreter;

public class Context {

    private String strExpression;

    public Context(String strExpression) {
        this.strExpression = strExpression;
    }

    public String getStrExpression() {
        return strExpression;
    }

    public void setStrExpression(String strExpression) {
        this.strExpression = strExpression;
    }
}
