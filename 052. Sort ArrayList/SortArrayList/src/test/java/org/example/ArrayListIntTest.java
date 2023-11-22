package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListIntTest {

    @Test
    void test_sortArrayList_empty() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayListInt cut = new ArrayListInt();
        cut.setArrayList(arrayList);
        ArrayList<Integer> sortedArrayActual = cut.sortArrayList();
        ArrayList<Integer> sortedArrayExpected = new ArrayList<>(List.of());
        Assertions.assertEquals(sortedArrayExpected,sortedArrayActual);
    }

    @Test
    void test_sortArrayList_element_1() {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1));
        ArrayListInt cut = new ArrayListInt();
        cut.setArrayList(arrayList);
        ArrayList<Integer> sortedArrayActual = cut.sortArrayList();
        ArrayList<Integer> sortedArrayExpected = new ArrayList<>(List.of(1));
        Assertions.assertEquals(sortedArrayExpected,sortedArrayActual);
    }

    @Test
    void test_sortArrayList_elements_2_1() {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(2,1));
        ArrayListInt cut = new ArrayListInt();
        cut.setArrayList(arrayList);
        ArrayList<Integer> sortedArrayActual = cut.sortArrayList();
        ArrayList<Integer> sortedArrayExpected = new ArrayList<>(List.of(1,2));
        Assertions.assertEquals(sortedArrayExpected,sortedArrayActual);
    }

    @Test
    void test_sortArrayList_elements_2_minus1() {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(2,-1));
        ArrayListInt cut = new ArrayListInt();
        cut.setArrayList(arrayList);
        ArrayList<Integer> sortedArrayActual = cut.sortArrayList();
        ArrayList<Integer> sortedArrayExpected = new ArrayList<>(List.of(-1,2));
        Assertions.assertEquals(sortedArrayExpected,sortedArrayActual);
    }

    @Test
    void test_sortArrayList_elements_10_9_2_1_7() {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10,9,2,1,7));
        ArrayListInt cut = new ArrayListInt();
        cut.setArrayList(arrayList);
        ArrayList<Integer> sortedArrayActual = cut.sortArrayList();
        ArrayList<Integer> sortedArrayExpected = new ArrayList<>(Arrays.asList(1,2,7,9,10));
        Assertions.assertEquals(sortedArrayExpected,sortedArrayActual);
    }

    @Test
    void test_sortArrayList_elements_1_2_3() {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayListInt cut = new ArrayListInt();
        cut.setArrayList(arrayList);
        ArrayList<Integer> sortedArrayActual = cut.sortArrayList();
        ArrayList<Integer> sortedArrayExpected = new ArrayList<>(Arrays.asList(1,2,3));
        Assertions.assertEquals(sortedArrayExpected,sortedArrayActual);
    }

    @Test
    void test_sortArrayList_elements_10_2_10() {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10,2,10));
        ArrayListInt cut = new ArrayListInt();
        cut.setArrayList(arrayList);
        ArrayList<Integer> sortedArrayActual = cut.sortArrayList();
        ArrayList<Integer> sortedArrayExpected = new ArrayList<>(Arrays.asList(2,10,10));
        Assertions.assertEquals(sortedArrayExpected,sortedArrayActual);
    }
}