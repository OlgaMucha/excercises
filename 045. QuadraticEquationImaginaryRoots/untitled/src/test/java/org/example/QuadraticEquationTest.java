package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class QuadraticEquationTest {

    @Test
    void test_calculateDeltaForEquation_a_0_b_0_c_0() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            new QuadraticEquation(0,0,0);
        });
    }

    @Test
    void test_calculateDeltaForEquation_a_0_b_0_c_1() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            new QuadraticEquation(0,0,1);
        });
    }

    @Test
    void test_calculateDeltaForEquation_a_0_b_1_c_0() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            new QuadraticEquation(0,1,0);
        });
    }

    @Test
    void test_numberOfRealSolutions_a_0_b_0_c_0() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            new QuadraticEquation(0,0,0);
        });
    }

    @Test // expect that there will be 1 solutions: 0 of x^2 = 0
    void test_realSolutions_a_1_b_0_c_0() {
        QuadraticEquation cut = new QuadraticEquation(1,0,0);
        ArrayList<Double> actualRealSolutions = cut.realSolutions();
        ArrayList<Double> expectedRealSolutions = new ArrayList<>(List.of(0.0));
        Assertions.assertEquals(expectedRealSolutions,actualRealSolutions);
    }

    @Test // expect that there will be 1 solutions: 0 of x = 0
    void test_realSolutions_a_0_b_1_c_0() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            new QuadraticEquation(0,1,0);
        });
    }

    @Test // expect that there will be 99 solutions of 0 = 0
    void test_realSolutions_a_0_b_0_c_0() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            new QuadraticEquation(0,0,0);
        });
    }

    @Test // expect that there will be solution -1 of equation x^2 + 2 x + 1 = 0
    void test_realSolutions_a_1_b_2_c_1() {
        QuadraticEquation cut = new QuadraticEquation(1,2,1);
        ArrayList<Double> actualRealSolutions = cut.realSolutions();
        ArrayList<Double> expectedRealSolutions = new ArrayList<>(List.of((double)-1));
        Assertions.assertEquals(expectedRealSolutions,actualRealSolutions);
    }

    @Test // expect that there will be no solution of x^2 + 1 = 0
    void test_realSolutions_a_1_b_0_c_1() {
        QuadraticEquation cut = new QuadraticEquation(1,0,1);
        ArrayList<Double> actualRealSolutions = cut.realSolutions();
        ArrayList<Double> expectedRealSolutions = new ArrayList<>(List.of());
        Assertions.assertEquals(expectedRealSolutions,actualRealSolutions);
    }

    @Test // expect that there will be 2 solutions: -1 and 1 of x^2 - 1 = 0
    void test_realSolutions_a_1_b_0_c_minus1() {
        QuadraticEquation cut = new QuadraticEquation(1,0,-1);
        ArrayList<Double> actualRealSolutions = cut.realSolutions();
        ArrayList<Double> expectedRealSolutions = new ArrayList<>(List.of(-1.0, 1.0));
        Assertions.assertEquals(expectedRealSolutions,actualRealSolutions);
    }

    @Test // expect that there will be 1 solutions: -1 of x + 1 = 0
    void test_realSolutions_a_0_b_1_c_1() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            new QuadraticEquation(0,1,1);
        });
    }

    @Test // expect that there will be 2 solutions: -2 and 3 of x^2 + x + 1 = 0
    void test_realSolutions_a_1_b_1_c_1() {
        QuadraticEquation cut = new QuadraticEquation(1,1,1);
        ArrayList<Double> actualRealSolutions = cut.realSolutions();
        ArrayList<Double> expectedRealSolutions = new ArrayList<>(List.of());
        Assertions.assertEquals(expectedRealSolutions,actualRealSolutions);
    }

    @Test // expect that there will be no solutions: -1 of x^2 + 5x + 6 = 0
    void test_realSolutions_a_1_b_5_c_6() {
        QuadraticEquation cut = new QuadraticEquation(1,5,6);
        ArrayList<Double> actualRealSolutions = cut.realSolutions();
        ArrayList<Double> expectedRealSolutions = new ArrayList<>(List.of(-3.0, -2.0));
        Assertions.assertEquals(expectedRealSolutions,actualRealSolutions);
    }

    @Test // expect that there will be no solutions: -1 of x^2 + 5x - 6 = 0
    void test_realSolutions_a_1_b_5_c_minus6() {
        QuadraticEquation cut = new QuadraticEquation(1,5,-6);
        ArrayList<Double> actualRealSolutions = cut.realSolutions();
        ArrayList<Double> expectedRealSolutions = new ArrayList<>(List.of(-6.0, 1.0));
        Assertions.assertEquals(expectedRealSolutions,actualRealSolutions);
    }

    @Test
    void test_imaginarySolutions_a_1_b_minus4_c_8() {
        QuadraticEquation cut = new QuadraticEquation(1,-4,8);
        ArrayList<String> actualImaginaryRoots = cut.imaginarySolutions();
        ArrayList<String> expectedImaginaryRoots = new ArrayList<>(List.of("2.00 + 2.00i","2.00 - 2.00i"));
        Assertions.assertEquals(expectedImaginaryRoots, actualImaginaryRoots);
    }

    @Test
    void test_imaginarySolutions_a_1_b_minus10_c_26() {
        QuadraticEquation cut = new QuadraticEquation(1,-10,26);
        ArrayList<String> actualImaginaryRoots = cut.imaginarySolutions();
        ArrayList<String> expectedImaginaryRoots = new ArrayList<>(List.of("5.00 + 1.00i","5.00 - 1.00i"));
        Assertions.assertEquals(expectedImaginaryRoots, actualImaginaryRoots);
    }

    @Test
    void test_imaginarySolutions_a_1_b_4_c_5() {
        QuadraticEquation cut = new QuadraticEquation(1,4,5);
        ArrayList<String> actualImaginaryRoots = cut.imaginarySolutions();
        ArrayList<String> expectedImaginaryRoots = new ArrayList<>(List.of("-2.00 + 1.00i","-2.00 - 1.00i"));
        Assertions.assertEquals(expectedImaginaryRoots, actualImaginaryRoots);
    }

    @Test
    void test_imaginarySolutions_a_1_b_0_c_9() {
        QuadraticEquation cut = new QuadraticEquation(1,0,9);
        ArrayList<String> actualImaginaryRoots = cut.imaginarySolutions();
        ArrayList<String> expectedImaginaryRoots = new ArrayList<>(List.of("0.00 + 3.00i","0.00 - 3.00i"));
        Assertions.assertEquals(expectedImaginaryRoots, actualImaginaryRoots);
    }

    @Test
    void test_imaginarySolutions_a_1_b_minus4_c_5() {
        QuadraticEquation cut = new QuadraticEquation(1,-4,5);
        ArrayList<String> actualImaginaryRoots = cut.imaginarySolutions();
        ArrayList<String> expectedImaginaryRoots = new ArrayList<>(List.of("2.00 + 1.00i","2.00 - 1.00i"));
        Assertions.assertEquals(expectedImaginaryRoots, actualImaginaryRoots);
    }


    @Test
    void test_outputSolutions_a_1_b_minus4_c_5() {
        QuadraticEquation cut = new QuadraticEquation(1,-4,5);
        String actualOutput = cut.outputSolutions();
        String expectedOutput = "There are two imaginary roots: 2.00 + 1.00i and 2.00 - 1.00i";
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test_outputSolutions_a_1_b_2_c_1() {
        QuadraticEquation cut = new QuadraticEquation(1,2,1);
        String actualOutput = cut.outputSolutions();
        String expectedOutput = "There is one real root: -1.00";
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test_outputSolutions_a_1_b_5_c_6() {
        QuadraticEquation cut = new QuadraticEquation(1,5,6);
        String actualOutput = cut.outputSolutions();
        String expectedOutput = "There are two real roots: -3.00 and -2.00";
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test_outputSolutions_a_1_b_0_c_0() {
        QuadraticEquation cut = new QuadraticEquation(1,0,0);
        String actualOutput = cut.outputSolutions();
        String expectedOutput = "There is one real root: 0.00";
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test_outputSolutions_a_1_b_0_c_1() {
        QuadraticEquation cut = new QuadraticEquation(1,0,1);
        String actualOutput = cut.outputSolutions();
        String expectedOutput = "There are two imaginary roots: 0.00 + 1.00i and 0.00 - 1.00i";
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test_outputSolutions_a_1_b_0_c_minus1() {
        QuadraticEquation cut = new QuadraticEquation(1,0,-1);
        String actualOutput = cut.outputSolutions();
        String expectedOutput = "There are two real roots: -1.00 and 1.00";
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
