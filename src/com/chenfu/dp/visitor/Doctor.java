package com.chenfu.dp.visitor;

public class Doctor implements Visitor {
    @Override
    public void visitPenicillin(Penicillin penicillin) {
        System.out.println("penicillin:three times a day");
    }

    @Override
    public void visitAmoxicillin(Amoxicillin amoxicillin) {
        System.out.println("amoxicillin:two times a day");
    }
}
