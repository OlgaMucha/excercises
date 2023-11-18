package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Faculty extends Employee{
    public String officeHours;
    public int rank;

    public Faculty(String name, String addressLine1, String addressLine2, String phone, String email, String office, double hours, LocalDate dateHired) {
        super(name, addressLine1, addressLine2, phone, email, office, hours, dateHired);
    }

    public Faculty(String name, String addressLine1, String addressLine2, String phone, String email, String office, double hours, LocalDate dateHired, String officeHours, int rank) {
        super(name, addressLine1, addressLine2, phone, email, office, hours, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        String string = this.getClass().getName();
        return    "Class: " + string +
                "\nname:            " + name +
                "\nranking:         " + rank +
                "\noffice hours:    " + officeHours;

    }

}
