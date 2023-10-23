package org.example;

import java.util.ArrayList;

public class Member {

    private String FirstName;
    private String LastName;
    private Role roleEnum;
    private double Salary;

    public Member(String firstName, String lastName, Role roleEnum, double salary) {
        FirstName = firstName;
        LastName = lastName;
        this.roleEnum = roleEnum;
        Salary = salary;
    }
}

