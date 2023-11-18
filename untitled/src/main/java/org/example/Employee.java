package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Employee extends Person{
    public String office;
    public double hours;
    public LocalDate dateHired;

    public Employee(String name, String addressLine1, String addressLine2, String phone, String email, String office, double hours, LocalDate dateHired) {
        super(name, addressLine1, addressLine2, phone, email);
        this.office = office;
        this.hours = hours;
        this.dateHired = dateHired;
    }

    public Employee(String office, double hours, LocalDate dateHired) {
        this.office = office;
        this.hours = hours;
        this.dateHired = dateHired;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        String string = this.getClass().getName();
        return    "Class: " + string +
                "\nname:            " + name +
                "\noffice:          " + office +
                "\nhours:           " + hours +
                "\ndate hired:      " + dateHired;

    }

}
