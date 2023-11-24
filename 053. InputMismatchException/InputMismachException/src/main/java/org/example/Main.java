package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean inputCorrect = true;
        int number1 = 0;
        int number2 = 0;

        do {
            try {
                System.out.println("Enter 2 integers");

                // Read the first integer
                number1 = scanner.nextInt();

                // Read the second integer
                number2 = scanner.nextInt();


                inputCorrect = true;
            } catch (InputMismatchException ex) {
                System.out.println("Input incorrect");
                inputCorrect = false;

                // Consume the invalid input
                scanner.nextLine();
            }
        } while (!inputCorrect);

        System.out.println("You entered integers " + number1 + " and " + number2);

        // Close the scanner to release resources
        scanner.close();
    }
}
