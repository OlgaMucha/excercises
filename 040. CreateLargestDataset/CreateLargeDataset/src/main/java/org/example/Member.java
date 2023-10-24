package org.example;

public class Member {

    private String firstName;
    private String lastName;
    private Role roleEnum;
    private double salary;

    public Member(String firstName, String lastName, Role roleEnum, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.roleEnum = roleEnum;
        this.salary = salary;
    }
}

