package com.chenfu.dp.visitor;

import java.util.ArrayList;
import java.util.List;

public class Prescription {

    private List<Medicine> medicines = new ArrayList<Medicine>();

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
    }

    public void removeMedicine(Medicine medicine) {
        medicines.remove(medicine);
    }

    public void accept(Visitor visitor) {
        for (Medicine m:medicines) {
            m.accept(visitor);
        }
    }
}
