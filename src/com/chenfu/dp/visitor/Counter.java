package com.chenfu.dp.visitor;

public class Counter implements Visitor {
    @Override
    public void visitPenicillin(Penicillin penicillin) {
        System.out.println("penicillin:10$");
    }

    @Override
    public void visitAmoxicillin(Amoxicillin amoxicillin) {
        System.out.println("amoxicillin:5$");
    }
}
