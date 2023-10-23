package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<>();

        for (int i = 0; i < 100; i++) {


            String firstName = "Firstname" + (i+1);

            String lastName = "Lastname" + (i+1);
            Role roleEnum = Role.enumMethod();

            double salary = calculateSalaryPerRole(roleEnum);

            Member member = new Member(firstName, lastName, roleEnum, salary);
            members.add(member);
        }
        System.out.println("lala");
    }

    private static double calculateSalaryPerRole(Role roleEnum) {
        return switch (roleEnum) {
            case Assistant -> getRandomNumber(50000, 80000);
            case Associate -> getRandomNumber(60000, 110000);
            case Full -> getRandomNumber(75000, 130000);
        };

    }
    private static double getRandomNumber(int lower, int upper){
        int randomNumber =  (int) (Math.random() * (upper - lower)) + lower;
        return (randomNumber*100)/100;
    }
}