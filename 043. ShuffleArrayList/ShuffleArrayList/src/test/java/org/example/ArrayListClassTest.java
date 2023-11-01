package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListClassTest {

    @Test
    void test_shuffleArrayList_shuffledListHasThisSameElementsAndSize() {
        ArrayList<Integer> arrayBefore = new ArrayList<>(List.of(1, 2, 3));
        ArrayListClass cut = new ArrayListClass(arrayBefore);
        cut.shuffleArrayList();
        ArrayList<Integer> arrayAfter = cut.getArrayListNumbers();

        assertAll(
                "Grouped Assertions",
                () -> assertEquals(arrayAfter.size(),arrayAfter.size()),
                () -> assertTrue(arrayAfter.contains(1)),
                () -> assertTrue(arrayAfter.contains(2)),
                () -> assertTrue(arrayAfter.contains(3))
        );

    }

    @Test
    void test_shuffleArrayList_shuffledListHasThisSameElementsAndSize2() {
        //given
        ArrayList<Integer> arrayBefore = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayListClass cut = new ArrayListClass(arrayBefore);

        //when
        cut.shuffleArrayList();
        ArrayList<Integer> arrayAfter = cut.getArrayListNumbers();

        //then
        assertAll(
                "Grouped Assertions",
                () -> assertEquals(arrayAfter.size(), arrayAfter.size()),
                () -> assertTrue(arrayAfter.contains(1)),
                () -> assertTrue(arrayAfter.contains(2)),
                () -> assertTrue(arrayAfter.contains(3)),
                () -> assertTrue(arrayAfter.contains(4)),
                () -> assertTrue(arrayAfter.contains(5))
        );
    }
}