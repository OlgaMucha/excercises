package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean inputCorrect = false;
        int number1 = 0;
        int number2 = 0;
        do {

            try {
                System.out.println("Enter 2 integers");

                number1 = scanner.nextInt();
                number2 = scanner.nextInt();
                inputCorrect = true;
            }
            catch (InputMismatchException ex){
                System.out.println("input incorrect");
            }
        }
        while(!inputCorrect);

        System.out.println("You entered integers " + number1 + " and " + number2);
        }


    }
