package com.chenfu.dp.visitor;

public class Penicillin implements Medicine {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitPenicillin(this);
    }
}
