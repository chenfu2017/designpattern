package com.chenfu.dp.visitor;

public class Client {
    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        Counter counter = new Counter();

        Penicillin penicillin = new Penicillin();
        Amoxicillin amoxicillin = new Amoxicillin();

        Prescription prescription = new Prescription();
        prescription.addMedicine(penicillin);
        prescription.addMedicine(amoxicillin);
        prescription.accept(doctor);
        prescription.accept(counter);

    }
}
