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
        RationalNumber second = (RationalNumber) o;
        return (numerator == that.numerator && denominator == that.denominator) ||
                (second.getNumerator() == this.simplifyRationalNumber().getNumerator() &&
                 second.getDenominator() == this.simplifyRationalNumber().getDenominator());
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

    /**
     * Method: addRationals
     * Adds two rational numbers and returns result of addition.
     * @return RationalNumber
     */

    public RationalNumber addRationals(RationalNumber secondNumber){
        int newDenominator = this.denominator * secondNumber.denominator;
        int newNominator = this.numerator * secondNumber.denominator + secondNumber.numerator * this.denominator;
        return new RationalNumber(newNominator, newDenominator);
    }

    /**
     * Method: subtractRationals
     * Subtracts two rational numbers and returns result of subtraction.
     * @return RationalNumber
     */
    public RationalNumber subtractRationals(RationalNumber secondNumber){
        int newDenominator = this.denominator * secondNumber.denominator;
        int newNominator = this.numerator * secondNumber.denominator - secondNumber.numerator * this.denominator;
        return new RationalNumber(newNominator, newDenominator);
    }

    /**
     * Method: multiply rationals
     * Multiplies two rational numbers and returns result of multiplication.
     * @return RationalNumber
     */
    public RationalNumber multiplyRationals(RationalNumber secondNumber){
        int newDenominator = this.denominator * secondNumber.denominator;
        int newNominator = this.numerator *  secondNumber.numerator;
        return new RationalNumber(newNominator, newDenominator);
    }

    /**
     * Method: divide rational numbers
     * divides two rational numbers, in case second rational number is 0 (its numerator is 0) throws exception
     * @return RationalNumber
     */
    public RationalNumber divideRationals(RationalNumber secondNumber){
        if(secondNumber.numerator == 0){
            throw new IllegalArgumentException("can't divide by zero!");
        }
        int newDenominator = this.denominator * secondNumber.numerator;
        int newNominator = this.numerator *  secondNumber.denominator;
        return new RationalNumber(newNominator, newDenominator);
    }

    /**
     * Method: simplifyRationalNumber
     * simplifies rational number by dividing numerator and denominator by greater common divisor.
     * if numerator is 0, it simplifies it to 0/1.
     * if both numerator and denominator are 0, it returns the positive result (ex -2/-4 = 1/2)
     * @return RationalNumber - simplified number
     */
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
        return new RationalNumber(newNumerator, newDenominator);
    }
}
