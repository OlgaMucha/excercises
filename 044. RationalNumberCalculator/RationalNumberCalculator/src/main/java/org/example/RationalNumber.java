package org.example;

public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        if(denominator == 0){
            throw new IllegalArgumentException("Denominator can't be zero!");
        }
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public RationalNumber addRationals(RationalNumber secondNumber){
        int newDenominator = this.denominator * secondNumber.denominator;
        int newNominator = this.numerator * secondNumber.denominator + secondNumber.numerator * this.denominator;
        return new RationalNumber(newNominator, newDenominator);
    }

    public RationalNumber subtractRationals(RationalNumber secondNumber){
        int newDenominator = this.denominator * secondNumber.denominator;
        int newNominator = this.numerator * secondNumber.denominator - secondNumber.numerator * this.denominator;
        return new RationalNumber(newNominator, newDenominator);
    }

    public RationalNumber multiplyRationals(RationalNumber secondNumber){
        int newDenominator = this.denominator * secondNumber.denominator;
        int newNominator = this.numerator *  secondNumber.numerator;
        return new RationalNumber(newNominator, newDenominator);
    }

    public RationalNumber divideRationals(RationalNumber secondNumber){
        if(secondNumber.numerator == 0){
            throw new IllegalArgumentException("can't divide by zero!");
        }
        int newDenominator = this.denominator * secondNumber.numerator;
        int newNominator = this.numerator *  secondNumber.denominator;
        return new RationalNumber(newNominator, newDenominator);
    }
}
