package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void test_calculateTotalNConsecutiveRationals_ifFirstNumeratorGreaterThenSecondValueException() {
        Calculator cut = new Calculator(new Scanner(System.in));
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            //Code under test
            cut.calculateTotalNConsecutiveRationals(2, 1);
        });
    }

    @Test
    void test_calculateTotalNConsecutiveRationals_0numerator_0n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        RationalNumber actual = cut.calculateTotalNConsecutiveRationals(0, 0);
        RationalNumber expected = new RationalNumber(0, 1);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test_calculateTotalNConsecutiveRationals_1numerator_1n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        RationalNumber actual = cut.calculateTotalNConsecutiveRationals(1, 1);
        RationalNumber expected = new RationalNumber(1, 2);
        Assertions.assertEquals(actual, expected);
    }


    @Test
    void test_calculateTotalNConsecutiveRationals_2numerator_2n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        RationalNumber actual = cut.calculateTotalNConsecutiveRationals(2, 2);
        RationalNumber expected = new RationalNumber(2, 3);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test_calculateTotalNConsecutiveRationals_0numerator_1n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        RationalNumber actual = cut.calculateTotalNConsecutiveRationals(0, 1);
        RationalNumber expected = new RationalNumber(1, 2);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test_calculateTotalNConsecutiveRationals_minus1numerator_0n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            //Code under test
            cut.calculateTotalNConsecutiveRationals(-1, 0);
        });
    }

    @Test
    void test_calculateTotalNConsecutiveRationals_minus2numerator_minus1n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            //Code under test
            cut.calculateTotalNConsecutiveRationals(-1, 0);
        });
    }

    @Test
    void test_calculateTotalNConsecutiveRationals_1numerator_2n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        RationalNumber actual = cut.calculateTotalNConsecutiveRationals(1, 2);
        RationalNumber expected = new RationalNumber(7, 6);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test_calculateTotalNConsecutiveRationals_2numerator_3n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        RationalNumber actual = cut.calculateTotalNConsecutiveRationals(2, 3);
        RationalNumber expected = new RationalNumber(17, 12);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test_calculateTotalNConsecutiveRationals_2numerator_33n() {
        Calculator cut = new Calculator(new Scanner(System.in));
        RationalNumber actual = cut.calculateTotalNConsecutiveRationals(2, 33);
        RationalNumber expected = new RationalNumber(17, 12);
        Assertions.assertEquals(actual, expected);
    }


}