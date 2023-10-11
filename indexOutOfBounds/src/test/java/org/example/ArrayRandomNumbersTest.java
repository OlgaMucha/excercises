package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class ArrayRandomNumbersTest {

    @Test
    void test_getNumberOnPosition_throwsIndexOutOfBoundsException() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        Assert.assertThrows(IndexOutOfBoundsException.class,()->{
            ArrayRandomNumbers.getNumberOnPosition(3,arrayList);
        });
    }

    @Test
    void test_getNumberOnPosition_givesCorrectValue() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        int index = 0;
        int expectedResult = 1;
        assertEquals(ArrayRandomNumbers.getNumberOnPosition(index,arrayList), expectedResult);
    }
}