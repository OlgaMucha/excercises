package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        Password password1 = new Password(password);
        System.out.println("Password is correct " + password1.passwordCorrectCheck());




    }
}