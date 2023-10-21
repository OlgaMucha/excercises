package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String passwordString = scanner.nextLine();
        String message;

        Password password1 = new Password(passwordString);
        boolean passwordIsCorrect = password1.passwordCorrectCheck();
        if(passwordIsCorrect){
            message = "Valid password";
        } else {
            message = "Invalid password";
        }
        System.out.println(message);




    }
}