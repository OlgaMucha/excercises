package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        RationalNumber rationalNumber = new RationalNumber(1, 5);
        RationalNumber secondNumber = new RationalNumber(2, 3);

        RationalNumber resultAddition = rationalNumber.addRationals(secondNumber);
        RationalNumber resultSubtraction = rationalNumber.subtractRationals(secondNumber);
        RationalNumber resultMultiplication = rationalNumber.multiplyRationals(secondNumber);
        RationalNumber resultDivision = rationalNumber.divideRationals(secondNumber);

        System.out.println(output(rationalNumber,secondNumber, resultAddition,'+'));
        System.out.println(output(rationalNumber,secondNumber, resultSubtraction,'-'));
        System.out.println(output(rationalNumber,secondNumber, resultMultiplication,'*'));
        System.out.println(output(rationalNumber,secondNumber, resultDivision,'/'));

        NumberInt nr = new NumberInt(20);
        ArrayList<Integer> divisors = nr.findDivisors();
        System.out.println("Number 1 divisors " + divisors.toString());

        NumberInt nr2 = new NumberInt(30);
        ArrayList<Integer> divisors2 = nr2.findDivisors();
        System.out.println(divisors2.toString());

        int greatestCommonDivisor = nr.greatestCommonDivisor(nr2);
        System.out.println("Number 2 divisors " + greatestCommonDivisor);
    }
    public static String outputRationalNumber(RationalNumber rationalNumber){
        return rationalNumber.getNumerator() + "/" + rationalNumber.getDenominator();
    }


    public static String output(RationalNumber rationalNumberFirst, RationalNumber rationalNumberSecond, RationalNumber rationalNumberResult, char sign){
        return outputRationalNumber(rationalNumberFirst) +
                sign +
                outputRationalNumber(rationalNumberSecond) +
                " = " +
                outputRationalNumber(rationalNumberResult);

    }



}