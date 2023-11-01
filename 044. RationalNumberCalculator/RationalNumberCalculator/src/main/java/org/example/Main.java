package org.example;

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