package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator(scanner);
        //calculator.setup();
        RationalNumber resultRational = calculator.calculateTotalNConsecutiveRationals(1,3);
        System.out.println(resultRational.getNumerator() + "/" + resultRational.getDenominator());
    }
}