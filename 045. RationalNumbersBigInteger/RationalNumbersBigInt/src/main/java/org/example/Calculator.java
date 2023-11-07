package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class Calculator {

    Scanner scanner;

    public Calculator(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }

    private RationalNumber oneRationalUserEntry() {

        String[] rationalNumberDetails = this.scanner.nextLine().split("/");
        BigInteger numerator = new BigInteger(rationalNumberDetails[0], 10);

        BigInteger denominator = new BigInteger(rationalNumberDetails[1],10);
        return new RationalNumber(numerator, denominator);

    }

    public RationalNumber calculateTotalNConsecutiveRationals(BigInteger numerator, BigInteger n){
        if(numerator.compareTo(n) > 0){
            throw new IllegalArgumentException("first value cant be greater then second value");
        }
        if(numerator.compareTo(BigInteger.ZERO) < 0){
            throw new IllegalArgumentException("first value must be greater or equal 0");
        }
        RationalNumber totalRational = new RationalNumber(BigInteger.ZERO, BigInteger.ONE);
        RationalNumber consecutiveRational;

        //Loop from bigInt1 to bigInt2
        for(BigInteger bigInt = numerator; bigInt.compareTo(n) < 0; bigInt = bigInt.add(BigInteger.ONE)) {
            consecutiveRational = getConsecutiveRational(bigInt);
            totalRational = totalRational.addRationals(consecutiveRational);
        }

        return totalRational;
    }

    private static RationalNumber getConsecutiveRational(BigInteger numerator) {
        BigInteger denominator = numerator.add(BigInteger.ONE);
        return new RationalNumber(numerator, denominator);
    }
}

