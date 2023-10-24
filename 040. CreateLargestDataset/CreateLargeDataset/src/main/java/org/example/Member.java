package org.example;

public class Member {

    private String firstName;
    private String lastName;
    private Role roleEnum;
    private double salary;

    public Member() {
    }

    public Role getRoleEnum() {
        return roleEnum;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRoleEnum(Role roleEnum) {
        this.roleEnum = roleEnum;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

