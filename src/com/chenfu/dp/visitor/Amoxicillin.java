package com.chenfu.dp.visitor;

public class Amoxicillin implements Medicine {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitAmoxicillin(this);
    }
}
