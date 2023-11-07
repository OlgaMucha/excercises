package org.example;

import java.math.BigInteger;
import java.util.Objects;

public class RationalNumber {
    public static final int SIMPLIFIED_DENOMINATOR_WHEN_NUMERATOR_ZERO = 1;
    private BigInteger numerator;
    private BigInteger denominator;

    public RationalNumber(BigInteger numerator, BigInteger denominator) {
        this.numerator = numerator;
        if(denominator.equals(BigInteger.ZERO)){
            throw new IllegalArgumentException("Denominator can't be zero!");
        }
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RationalNumber that = (RationalNumber) o;
        return (numerator.equals(that.numerator) && denominator.equals(that.denominator)) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    /**
     * Method: addRationals
     * Adds two rational numbers and returns result of addition.
     * @return RationalNumber
     */

    public RationalNumber addRationals(RationalNumber secondNumber){
        BigInteger newDenominator = this.denominator.multiply(this.denominator);
        BigInteger newNumerator = this.numerator.multiply(secondNumber.denominator).add(secondNumber.numerator.multiply(this.denominator));
        return new RationalNumber(newNumerator, newDenominator);
    }

    /**
     * Method: subtractRationals
     * Subtracts two rational numbers and returns result of subtraction.
     * @return RationalNumber
     */
    public RationalNumber subtractRationals(RationalNumber secondNumber){
        BigInteger newDenominator = this.denominator.multiply(this.denominator);
        BigInteger newNumerator = this.numerator.multiply(secondNumber.denominator).subtract(secondNumber.numerator.multiply(this.denominator));
        return new RationalNumber(newNumerator, newDenominator);
    }

    /**
     * Method: multiply rationals
     * Multiplies two rational numbers and returns result of multiplication.
     * @return RationalNumber
     */
    public RationalNumber multiplyRationals(RationalNumber secondNumber){
        BigInteger newDenominator = this.denominator.multiply(this.denominator);
        BigInteger newNumerator = this.numerator.multiply(secondNumber.numerator);
        return new RationalNumber(newNumerator, newDenominator);
    }

    /**
     * Method: divide rational numbers
     * divides two rational numbers, in case second rational number is 0 (its numerator is 0) throws exception
     * @return RationalNumber
     */
    public RationalNumber divideRationals(RationalNumber secondNumber){
        if(secondNumber.numerator.equals(BigInteger.ZERO)){
            throw new IllegalArgumentException("can't divide by zero!");
        }
        BigInteger newDenominator = this.denominator.multiply(secondNumber.numerator);
        BigInteger newNominator = this.numerator.multiply(secondNumber.denominator);
        return new RationalNumber(newNominator, newDenominator);
    }

}
