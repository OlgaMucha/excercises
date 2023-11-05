package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    Scanner scanner;

    public Calculator(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }

       public void setup(){

        int usersChoice = validatingUserEntry();

        RationalNumber rationalNumber1 = null;
        RationalNumber rationalNumber2 = null;
        RationalNumber result;
        String output = "";
        if(usersChoice == 5){
            ArrayList<RationalNumber> arrayList = rationalNumbersUserEntry(1, scanner);
            rationalNumber1 = arrayList.get(0);
        }
        if(usersChoice < 5){
            ArrayList<RationalNumber> arrayList = rationalNumbersUserEntry(2, scanner);
            rationalNumber1 = arrayList.get(0);
            rationalNumber2 = arrayList.get(1);
        }

        switch (usersChoice) {
            case 1 -> {
                result = rationalNumber1.addRationals(rationalNumber2);
                output = outputForOperations(rationalNumber1, rationalNumber2, result, '+');
                        }
            case 2 -> {
                result = rationalNumber1.subtractRationals(rationalNumber2);
                output = outputForOperations(rationalNumber1, rationalNumber2, result, '-');
                        }
            case 3 -> {
                result = rationalNumber1.multiplyRationals(rationalNumber2);
                output = outputForOperations(rationalNumber1, rationalNumber2, result, '*');
                            }
            case 4 -> {
                result = rationalNumber1.divideRationals(rationalNumber2);
                output = outputForOperations(rationalNumber1, rationalNumber2, result, '/');
                        }
            case 5 -> output = outputForRationalNumberSimplification(rationalNumber1);

            case 6 -> System.exit(0);
            default -> output = "incorrect entry";

        }
        System.out.println(output);
        System.out.println("Do you want to calculate something else? Y/N");
        String userAnswer = this.scanner.nextLine();
        if(userAnswer.equalsIgnoreCase("Y")){
            setup();
        } else{
            System.exit(0);
        }
    }

    private int validatingUserEntry() {
        ArrayList<Integer> arrayListOptions = new ArrayList<>(List.of(1,2,3,4,5,6));

        int usersChoice = getUsersChoice();
        boolean choiceIsCorrect = arrayListOptions.contains(usersChoice);
        while (!choiceIsCorrect) {
            System.out.println("Give correct value");
            usersChoice = getUsersChoice();
            choiceIsCorrect = arrayListOptions.contains(usersChoice);
            }
        return usersChoice;
    }

    private int getUsersChoice() {
        System.out.println("*********************CALCULATOR*******************************");
        System.out.println("What would you like to do? ");
        System.out.println("1. Add two rational numbers");
        System.out.println("2. Subtract two rational numbers");
        System.out.println("3. Multiply two rational numbers");
        System.out.println("4. Divide two rational numbers");
        System.out.println("5. Simplify a rational number");
        System.out.println("6. Exit");

        int usersChoice = scanner.nextInt();
        scanner.nextLine();
        return usersChoice;
    }

    public String outputRationalNumber(RationalNumber rationalNumber){
        return rationalNumber.getNumerator() + "/" + rationalNumber.getDenominator();
    }


    public String outputForOperations(RationalNumber rationalNumberFirst, RationalNumber rationalNumberSecond, RationalNumber rationalNumberResult, char sign){
        return outputRationalNumber(rationalNumberFirst.simplifyRationalNumber()) +
                sign +
                outputRationalNumber(rationalNumberSecond.simplifyRationalNumber()) +
                " = " +
                outputRationalNumber(rationalNumberResult.simplifyRationalNumber());
    }

    public String outputForRationalNumberSimplification(RationalNumber rationalNumber){
        return outputRationalNumber(rationalNumber) + " can be simplified to " + outputRationalNumber(rationalNumber.simplifyRationalNumber());
    }

    public ArrayList<RationalNumber> rationalNumbersUserEntry(int numberOfRationalNumbersNeeded, Scanner scanner){
        ArrayList<RationalNumber> arrayList = new ArrayList<>();
        System.out.println("Enter it in the form nominator/denominator (example: 2/5)");
        if(numberOfRationalNumbersNeeded == 1) {
            RationalNumber firstRationalNumber = oneRationalUserEntry();
            arrayList.add(firstRationalNumber);
        }
        else {
            System.out.println("Enter first rational number");
            RationalNumber firstRationalNumber = oneRationalUserEntry();
            arrayList.add(firstRationalNumber);
            System.out.println("Enter second rational number");
            RationalNumber secondRationalNumber = oneRationalUserEntry();
            arrayList.add(secondRationalNumber);

        }
        return arrayList;
    }

    private RationalNumber oneRationalUserEntry() {

        String[] rationalNumberDetails = this.scanner.nextLine().split("/");
        int numerator = Integer.parseInt(rationalNumberDetails[0]);
        int denominator = Integer.parseInt(rationalNumberDetails[1]);
        return new RationalNumber(numerator, denominator);

    }
}
