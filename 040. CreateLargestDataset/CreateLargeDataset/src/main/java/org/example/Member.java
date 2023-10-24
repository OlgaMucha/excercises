package org.example;

import java.util.Objects;

public class Member {

    private String firstName;
    private String lastName;
    private Role roleEnum;
    private double salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Double.compare(member.salary, salary) == 0 && Objects.equals(firstName, member.firstName) && Objects.equals(lastName, member.lastName) && roleEnum == member.roleEnum;
    }

    public Member(String firstName, String lastName, Role roleEnum, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.roleEnum = roleEnum;
        if(salary <= 0){
            throw new IllegalArgumentException("Salary must be greater then 0");
        }
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, roleEnum, salary);
    }

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
        if(salary <= 0){
            throw new IllegalArgumentException("Salary must be greater then 0");
        }
        this.salary = salary;
    }
}

