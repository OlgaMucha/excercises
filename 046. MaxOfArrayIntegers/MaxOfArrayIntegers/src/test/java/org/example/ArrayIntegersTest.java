package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class ArrayIntegersTest {

    @Test
    void test_setArrayList_array_1_2_3() {
        ArrayIntegers cut = new ArrayIntegers();
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of(1,2,3));
        cut.setArrayList(arrayExpected);
        ArrayList<Integer> arrayActual = cut.getArrayList();
        Assertions.assertEquals(arrayExpected,arrayActual);
    }

    @Test
    void test_setArrayList_array_no_elements() {
        ArrayIntegers cut = new ArrayIntegers();
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of());
        cut.setArrayList(arrayExpected);
        ArrayList<Integer> arrayActual = cut.getArrayList();
        Assertions.assertEquals(arrayExpected,arrayActual);
    }

    @Test
    void test_setArrayList_array_1() {
        ArrayIntegers cut = new ArrayIntegers();
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of(1));
        cut.setArrayList(arrayExpected);
        ArrayList<Integer> arrayActual = cut.getArrayList();
        Assertions.assertEquals(arrayExpected,arrayActual);
    }

    @Test
    void test_getMaxOfArrayIntegers_array_1_5_22_13() {
        ArrayIntegers cut = new ArrayIntegers(new ArrayList<>(List.of(1, 5, 22, 13)));
        int maxActual = cut.getMaxOfArrayIntegers();
        int maxExpected = 22;
        Assertions.assertEquals(maxExpected,maxActual);
    }

    @Test
    void test_getMaxOfArrayIntegers_array_no_elements() {
        ArrayIntegers cut = new ArrayIntegers(new ArrayList<>(List.of()));
        int maxActual = cut.getMaxOfArrayIntegers();
        int maxExpected = 0;
        Assertions.assertEquals(maxExpected,maxActual);
    }

    @Test
    void test_getMaxOfArrayIntegers_array_minus100_minus50_minus1() {
        ArrayIntegers cut = new ArrayIntegers(new ArrayList<>(List.of(-100,-50,-1)));
        int maxActual = cut.getMaxOfArrayIntegers();
        int maxExpected = -1;
        Assertions.assertEquals(maxExpected,maxActual);
    }

    @Test
    void test_getMaxOfArrayIntegers_array_minus1_1() {
        ArrayIntegers cut = new ArrayIntegers(new ArrayList<>(List.of(-1,1)));
        int maxActual = cut.getMaxOfArrayIntegers();
        int maxExpected = 1;
        Assertions.assertEquals(maxExpected,maxActual);
    }

    @Test
    void test_getMaxOfArrayIntegers_array_minus999() {
        ArrayIntegers cut = new ArrayIntegers(new ArrayList<>(List.of(-999)));
        int maxActual = cut.getMaxOfArrayIntegers();
        int maxExpected = -999;
        Assertions.assertEquals(maxExpected,maxActual);
    }
}