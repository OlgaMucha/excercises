package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Staff extends Employee{
    public String title;

    public Staff(String name, String addressLine1, String addressLine2, String phone, String email, String office, double hours, LocalDate dateHired) {
        super(name, addressLine1, addressLine2, phone, email, office, hours, dateHired);
    }

    public Staff(String name, String addressLine1, String addressLine2, String phone, String email, String office, double hours, LocalDate dateHired, String title) {
        super(name, addressLine1, addressLine2, phone, email, office, hours, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        String string = this.getClass().getName();
        return    "Class: " + string +
                "\nname:            " + name +
                "\ntitle:           " + title;

    }
}
