package org.example;

import java.util.Objects;

public class RationalNumber {
    public static final int SIMPLIFIED_DENOMINATOR_WHEN_NUMERATOR_ZERO = 1;
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        if(denominator == 0){
            throw new IllegalArgumentException("Denominator can't be zero!");
        }
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RationalNumber that = (RationalNumber) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
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

    public RationalNumber simplifyRationalNumber() {
        NumberInt numerator = new NumberInt(this.numerator);
        NumberInt denominator = new NumberInt(this.denominator);
        if (numerator.getNumberValue() == 0) {
            return new RationalNumber(this.numerator, SIMPLIFIED_DENOMINATOR_WHEN_NUMERATOR_ZERO);
        }

        int greatestCommonDivisor = numerator.greatestCommonDivisor(denominator);
        int newNumerator = this.numerator / greatestCommonDivisor;
        int newDenominator = this.denominator / greatestCommonDivisor;
        if (this.numerator < 0 && this.denominator < 0) {
            newNumerator = (-1) * newNumerator;
            newDenominator = (-1) * newDenominator;
        }
        System.out.println(this.numerator + "/" + this.denominator + " simplifies to " + newNumerator + "/" + newDenominator);
        return new RationalNumber(newNumerator, newDenominator);
    }


}
