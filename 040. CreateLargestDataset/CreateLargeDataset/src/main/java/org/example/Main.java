package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static final int MIN_SALARY_ASSISTANT = 50000;
    public static final int MAX_SALARY_ASSISTANT = 80000;
    public static final int MIN_SALARY_ASSOCIATE = 60000;
    public static final int MAX_SALARY_ASSOCIATE = 110000;
    public static final int MIN_SALARY_FULL_PROFESSOR = 75000;
    public static final int MAX_SALARY_FULL_PROFESSOR = 130000;

    public static void main(String[] args) throws FileNotFoundException {

        java.io.File file = new File("dataset.txt");
        try {
            java.io.PrintWriter printWriter = new java.io.PrintWriter(file);


            for (int i = 0; i < 1000; i++) {

                Member member = new Member();
                member.setFirstName("Firstname" + (i + 1));
                member.setLastName("Lastname" + (i + 1));
                member.setRoleEnum(Role.enumMethod());
                member.setSalary(calculateSalaryPerRole(member.getRoleEnum()));
                printWriter.println(member.getFirstName() + " " + member.getLastName() + " " + member.getRoleEnum() + " " + member.getSalary());
            }

        } catch (FileNotFoundException err) {
            System.out.println(err.getMessage());
        }
    }

    private static double calculateSalaryPerRole(Role roleEnum) {
        return switch (roleEnum) {
            case assistant -> getRandomNumber(MIN_SALARY_ASSISTANT, MAX_SALARY_ASSISTANT);
            case associate -> getRandomNumber(MIN_SALARY_ASSOCIATE, MAX_SALARY_ASSOCIATE);
            case full -> getRandomNumber(MIN_SALARY_FULL_PROFESSOR, MAX_SALARY_FULL_PROFESSOR);
        };

    }
    private static double getRandomNumber(int lower, int upper){
        int randomNumber = lower + (int)(Math.random() * ((upper - lower) + 1));
        return (double)(randomNumber*100)/100;
    }
}