package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayIntegersTest {

    @Test
    void test_removeDuplicate_array_10_2_10_30_2() {
        //assign
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(10,2,10,30,2));
        ArrayIntegers cut = new ArrayIntegers(arrayList);
        //act
        ArrayList<Integer> arrayActual = cut.removeDuplicate();
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of(10,2,30));
        Assertions.assertEquals(arrayExpected,arrayActual);
    }

    @Test
    void test_removeDuplicate_array_10_2() {
        //assign
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(10,2));
        ArrayIntegers cut = new ArrayIntegers(arrayList);
        //act
        ArrayList<Integer> arrayActual = cut.removeDuplicate();
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of(10,2));
        Assertions.assertEquals(arrayExpected,arrayActual);
    }

    @Test
    void test_removeDuplicate_array_10_10_10_10_10() {
        //assign
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(10,10,10,10,10));
        ArrayIntegers cut = new ArrayIntegers(arrayList);
        //act
        ArrayList<Integer> arrayActual = cut.removeDuplicate();
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of(10));
        Assertions.assertEquals(arrayExpected,arrayActual);
    }

    @Test
    void test_removeDuplicate_array_10() {
        //assign
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(10));
        ArrayIntegers cut = new ArrayIntegers(arrayList);
        //act
        ArrayList<Integer> arrayActual = cut.removeDuplicate();
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of(10));
        Assertions.assertEquals(arrayExpected,arrayActual);
    }

    @Test
    void test_removeDuplicate_array_empty() {
        //assign
        ArrayList<Integer> arrayList = new ArrayList<>(List.of());
        ArrayIntegers cut = new ArrayIntegers(arrayList);
        //act
        ArrayList<Integer> arrayActual = cut.removeDuplicate();
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of());
        Assertions.assertEquals(arrayExpected,arrayActual);
    }

    @Test
    void test_removeDuplicate_array_minus1_1() {
        //assign
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(-1,1));
        ArrayIntegers cut = new ArrayIntegers(arrayList);
        //act
        ArrayList<Integer> arrayActual = cut.removeDuplicate();
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of(-1,1));
        Assertions.assertEquals(arrayExpected,arrayActual);
    }

    @Test
    void test_removeDuplicate_array_minus1_1_2_1_2_1_2() {
        //assign
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(-1,1,2,1,2,1,2));
        ArrayIntegers cut = new ArrayIntegers(arrayList);
        //act
        ArrayList<Integer> arrayActual = cut.removeDuplicate();
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of(-1,1,2));
        Assertions.assertEquals(arrayExpected,arrayActual);
    }

    @Test
    void test_removeDuplicate_array_minus1_0_0_0_0() {
        //assign
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0,0,0,0));
        ArrayIntegers cut = new ArrayIntegers(arrayList);
        //act
        ArrayList<Integer> arrayActual = cut.removeDuplicate();
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of(0));
        Assertions.assertEquals(arrayExpected,arrayActual);
    }

    @Test
    void test_removeDuplicate_array_minus1_0_0_0_0_23_13_12_23_13_12_0() {
        //assign
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0,0,0,0, 23,13,12,23,13,12,0));
        ArrayIntegers cut = new ArrayIntegers(arrayList);
        //act
        ArrayList<Integer> arrayActual = cut.removeDuplicate();
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of(0,23,13,12));
        Assertions.assertEquals(arrayExpected,arrayActual);
    }
}