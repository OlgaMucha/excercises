package org.example;

import java.util.Objects;

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

    public RationalNumber simplifyRationalNumber(){
        NumberInt numerator = new NumberInt(this.denominator);
        NumberInt denominator = new NumberInt(this.denominator);
        int greatestCommonDivisor = numerator.greatestCommonDivisor(denominator);
        if(greatestCommonDivisor == 1){
            System.out.println("The rational number can't be simplified");
        } else {
            System.out.println(this.numerator + "/" + this.denominator + " simplifies to " + this.numerator / greatestCommonDivisor + "/" + this.denominator / greatestCommonDivisor);
        }
        return new RationalNumber(this.numerator/greatestCommonDivisor, this.denominator/greatestCommonDivisor);
    }


}
