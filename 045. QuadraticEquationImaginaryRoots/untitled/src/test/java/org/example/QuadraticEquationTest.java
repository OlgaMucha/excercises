package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    void test_calculateDeltaForEquation_a_0_b_0_c_0() {
        QuadraticEquation cut = new QuadraticEquation(0,0,0);
        double expectedDelta = 0;
        double actualDelta = cut.calculateDeltaForEquation();
        Assertions.assertEquals(expectedDelta,actualDelta);
    }

    @Test
    void test_calculateDeltaForEquation_a_0_b_0_c_1() {
        QuadraticEquation cut = new QuadraticEquation(0,0,1);
        double expectedDelta = 0;
        double actualDelta = cut.calculateDeltaForEquation();
        Assertions.assertEquals(expectedDelta,actualDelta);
    }

    @Test
    void test_calculateDeltaForEquation_a_1_b_0_c_0() {
        QuadraticEquation cut = new QuadraticEquation(1,0,0);
        double expectedDelta = 0;
        double actualDelta = cut.calculateDeltaForEquation();
        Assertions.assertEquals(expectedDelta,actualDelta);
    }

    @Test
    void test_calculateDeltaForEquation_a_0_b_1_c_0() {
        QuadraticEquation cut = new QuadraticEquation(0,1,0);
        double expectedDelta = 1;
        double actualDelta = cut.calculateDeltaForEquation();
        Assertions.assertEquals(expectedDelta,actualDelta);
    }

    @Test
    void test_calculateDeltaForEquation_a_1_b_2_c_1() {
        QuadraticEquation cut = new QuadraticEquation(1,2,1);
        double expectedDelta = 0;
        double actualDelta = cut.calculateDeltaForEquation();
        Assertions.assertEquals(expectedDelta,actualDelta);
    }

    @Test
    void test_calculateDeltaForEquation_a_1_b_1_c_1() {
        QuadraticEquation cut = new QuadraticEquation(1,1,1);
        double expectedDelta = -3;
        double actualDelta = cut.calculateDeltaForEquation();
        Assertions.assertEquals(expectedDelta,actualDelta);
    }

    @Test
    void test_calculateDeltaForEquation_a_1_b_5_c_1() {
        QuadraticEquation cut = new QuadraticEquation(1,5,1);
        double expectedDelta = 21;
        double actualDelta = cut.calculateDeltaForEquation();
        Assertions.assertEquals(expectedDelta,actualDelta);
    }

    @Test
    void test_calculateDeltaForEquation_a_1_b_0_c_1() {
        QuadraticEquation cut = new QuadraticEquation(1,5,1);
        double expectedDelta = 21;
        double actualDelta = cut.calculateDeltaForEquation();
        Assertions.assertEquals(expectedDelta,actualDelta);
    }

    @Test
    void test_numberOfRealSolutions_a_0_b_0_c_0() {
        QuadraticEquation cut = new QuadraticEquation(0,0,0);
        double expectedNumberOfRealSolutions = 99;
        int actualNumberOfRealSolutions = cut.numberOfRealSolutions();
        Assertions.assertEquals(expectedNumberOfRealSolutions,actualNumberOfRealSolutions);

    }
    @Test
    void test_numberOfRealSolutions_a_1_b_0_c_0() {
        QuadraticEquation cut = new QuadraticEquation(1,0,0);
        double expectedNumberOfRealSolutions = 1;
        int actualNumberOfRealSolutions = cut.numberOfRealSolutions();
        Assertions.assertEquals(expectedNumberOfRealSolutions,actualNumberOfRealSolutions);
    }

    @Test
    void test_numberOfRealSolutions_a_0_b_1_c_0() {
        QuadraticEquation cut = new QuadraticEquation(0,1,0);
        double expectedNumberOfRealSolutions = 1;
        int actualNumberOfRealSolutions = cut.numberOfRealSolutions();
        Assertions.assertEquals(expectedNumberOfRealSolutions,actualNumberOfRealSolutions);
    }

    @Test
    void test_numberOfRealSolutions_a_0_b_0_c_1() {
        QuadraticEquation cut = new QuadraticEquation(0,0,1);
        double expectedNumberOfRealSolutions = 1;
        int actualNumberOfRealSolutions = cut.numberOfRealSolutions();
        Assertions.assertEquals(expectedNumberOfRealSolutions,actualNumberOfRealSolutions);
    }

    @Test
    void test_numberOfRealSolutions_a_0_b_1_c_2() {
        QuadraticEquation cut = new QuadraticEquation(0,1,2);
        double expectedNumberOfRealSolutions = 1;
        int actualNumberOfRealSolutions = cut.numberOfRealSolutions();
        Assertions.assertEquals(expectedNumberOfRealSolutions,actualNumberOfRealSolutions);
    }

    @Test
    void test_numberOfRealSolutions_a_1_b_1_c_1() {
        QuadraticEquation cut = new QuadraticEquation(1,1,1);
        double expectedNumberOfRealSolutions = 0;
        int actualNumberOfRealSolutions = cut.numberOfRealSolutions();
        Assertions.assertEquals(expectedNumberOfRealSolutions,actualNumberOfRealSolutions);
    }

    @Test
    void test_numberOfRealSolutions_a_1_b_1_c_0() {
        QuadraticEquation cut = new QuadraticEquation(1,1,0);
        double expectedNumberOfRealSolutions = 2;
        int actualNumberOfRealSolutions = cut.numberOfRealSolutions();
        Assertions.assertEquals(expectedNumberOfRealSolutions,actualNumberOfRealSolutions);
    }

    @Test
    void test_numberOfRealSolutions_a_1_b_4_c_3() {
        QuadraticEquation cut = new QuadraticEquation(1,4,3);
        double expectedNumberOfRealSolutions = 2;
        int actualNumberOfRealSolutions = cut.numberOfRealSolutions();
        Assertions.assertEquals(expectedNumberOfRealSolutions,actualNumberOfRealSolutions);
    }
}