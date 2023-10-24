package org.example;

import java.util.ArrayList;

public class Main {

    public static final int MIN_SALARY_ASSISTANT = 50000;
    public static final int MAX_SALARY_ASSISTANT = 80000;
    public static final int MIN_SALARY_ASSOCIATE = 60000;
    public static final int MAX_SALARY_ASSOCIATE = 110000;
    public static final int MIN_SALARY_FULL_PROFESSOR = 75000;
    public static final int MAX_SALARY_FULL_PROFESSOR = 130000;

    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            Member member = new Member();
            member.setFirstName("Firstname" + (i+1));
            member.setLastName("Lastname" + (i+1));
            member.setRoleEnum(Role.enumMethod());
            member.setSalary(calculateSalaryPerRole(member.getRoleEnum()));

            members.add(member);
        }
        System.out.println("lala");
    }

    private static double calculateSalaryPerRole(Role roleEnum) {
        return switch (roleEnum) {
            case Assistant -> getRandomNumber(MIN_SALARY_ASSISTANT, MAX_SALARY_ASSISTANT);
            case Associate -> getRandomNumber(MIN_SALARY_ASSOCIATE, MAX_SALARY_ASSOCIATE);
            case Full -> getRandomNumber(MIN_SALARY_FULL_PROFESSOR, MAX_SALARY_FULL_PROFESSOR);
        };

    }
    private static double getRandomNumber(int lower, int upper){
        int randomNumber = lower + (int)(Math.random() * ((upper - lower) + 1));
        return (double)(randomNumber*100)/100;
    }
}