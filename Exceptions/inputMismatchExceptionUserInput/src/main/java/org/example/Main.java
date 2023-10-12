package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        calculateSumOfTwoIntegers(scanner);
    }

    private static void calculateSumOfTwoIntegers(Scanner scanner) {
        while(true) {
            try {
                System.out.println("Enter two integers: ");
                String[] numbersArray = scanner.nextLine().split(" ");
                ArrayList<Integer> arrayIntegers = new ArrayList<>();
                for (String s : numbersArray) {
                    int number = Integer.parseInt(s);
                    arrayIntegers.add(number);
                }
                int sum = 0;
                for (Integer arrayInteger : arrayIntegers) {
                    sum = sum + arrayInteger;
                }
                System.out.println("sum = " + sum);
                break;
            }
            catch (NumberFormatException exception) {
                    System.out.println("Incorrect input - not integer");
                }
            }
    }
}
