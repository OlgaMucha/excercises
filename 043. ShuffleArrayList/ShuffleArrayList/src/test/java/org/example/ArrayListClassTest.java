package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListClassTest {

    @Test
    void test_shuffleArrayList_shuffledListHasThisSameElementsAndSize() {
        ArrayList<Integer> arrayBefore = new ArrayList<>(List.of(1, 2, 3));
        ArrayListClass alc = new ArrayListClass(arrayBefore);
        alc.shuffleArrayList();
        ArrayList<Integer> arrayAfter = alc.getArrayListNumbers();

        assertAll(
                "Grouped Assertions",
                () -> assertEquals(arrayAfter.size(),arrayAfter.size()),
                () -> assertTrue(arrayAfter.contains(1)),
                () -> assertTrue(arrayAfter.contains(2)),
                () -> assertTrue(arrayAfter.contains(3))
        );

    }

}