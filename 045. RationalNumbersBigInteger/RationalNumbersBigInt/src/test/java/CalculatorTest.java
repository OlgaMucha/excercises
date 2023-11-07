import org.example.Calculator;
import org.example.RationalNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void test_calculateTotalNConsecutiveRationals_ifFirstNumeratorGreaterThenSecondValueException() {
        Calculator cut = new Calculator(new Scanner(System.in));
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            //Code under test
            cut.calculateTotalNConsecutiveRationals(BigInteger.TWO, BigInteger.ONE);
        });
    }

    @Test
    void test_calculateTotalNConsecutiveRationals_0numerator_0n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        RationalNumber actual = cut.calculateTotalNConsecutiveRationals(BigInteger.ZERO, BigInteger.ZERO);
        RationalNumber expected = new RationalNumber(BigInteger.ZERO, BigInteger.ONE);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test_calculateTotalNConsecutiveRationals_1numerator_1n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        RationalNumber actual = cut.calculateTotalNConsecutiveRationals(BigInteger.ONE, BigInteger.ONE);
        RationalNumber expected = new RationalNumber(BigInteger.ONE, BigInteger.TWO);
        Assertions.assertEquals(actual, expected);
    }


    @Test
    void test_calculateTotalNConsecutiveRationals_2numerator_2n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        RationalNumber actual = cut.calculateTotalNConsecutiveRationals(BigInteger.TWO, BigInteger.TWO);
        RationalNumber expected = new RationalNumber(BigInteger.TWO, BigInteger.valueOf(3));
        System.out.println(actual.getNumerator() + " " + actual.getDenominator());
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test_calculateTotalNConsecutiveRationals_0numerator_1n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        RationalNumber actual = cut.calculateTotalNConsecutiveRationals(BigInteger.ZERO, BigInteger.ONE);
        RationalNumber expected = new RationalNumber(BigInteger.ONE, BigInteger.TWO);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test_calculateTotalNConsecutiveRationals_minus1numerator_0n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            //Code under test
            cut.calculateTotalNConsecutiveRationals(BigInteger.valueOf(-1), BigInteger.ZERO);
        });
    }

    @Test
    void test_calculateTotalNConsecutiveRationals_minus2numerator_minus1n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            //Code under test
            cut.calculateTotalNConsecutiveRationals(BigInteger.valueOf(-1), BigInteger.ZERO);
        });
    }

    @Test
    void test_calculateTotalNConsecutiveRationals_1numerator_2n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        RationalNumber actual = cut.calculateTotalNConsecutiveRationals(BigInteger.ONE, BigInteger.TWO);
        RationalNumber expected = new RationalNumber(BigInteger.valueOf(7), BigInteger.valueOf(6));
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test_calculateTotalNConsecutiveRationals_2numerator_3n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        RationalNumber actual = cut.calculateTotalNConsecutiveRationals(BigInteger.TWO, BigInteger.valueOf(3));
        RationalNumber expected = new RationalNumber(BigInteger.valueOf(17), BigInteger.valueOf(12));
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test_calculateTotalNConsecutiveRationals_2numerator_33n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        RationalNumber actual = cut.calculateTotalNConsecutiveRationals(BigInteger.TWO, BigInteger.valueOf(33));
        RationalNumber expected = new RationalNumber(BigInteger.valueOf(17), BigInteger.valueOf(17));
        Assertions.assertEquals(actual, expected);
    }


}