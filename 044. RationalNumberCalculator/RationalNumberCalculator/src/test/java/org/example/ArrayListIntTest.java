package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListIntTest {

    @Test
    void test_findCommonFieldsTwoArrayListsNotEmptyArrayLists_withMoreCommonElements() {

        //given
        //Test1
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(1,5,25));
        ArrayListInt arrayListInt1 = new ArrayListInt(arrayList1);
        ArrayList<Integer> arrayList2 = new ArrayList<>(List.of(1,25));
        ArrayListInt arrayListInt2 = new ArrayListInt(arrayList2);

        //Test2
        ArrayList<Integer> arrayList3 = new ArrayList<>(List.of(1,5,7,12));
        ArrayListInt arrayListInt3 = new ArrayListInt(arrayList3);
        ArrayList<Integer> arrayList4 = new ArrayList<>(List.of(1,12,30));
        ArrayListInt arrayListInt4 = new ArrayListInt(arrayList4);

        //Test3
        ArrayList<Integer> arrayList5 = new ArrayList<>(List.of(5, 6));
        ArrayListInt arrayListInt5 = new ArrayListInt(arrayList5);
        ArrayList<Integer> arrayList6 = new ArrayList<>(List.of(6,7));
        ArrayListInt arrayListInt6 = new ArrayListInt(arrayList6);

        //When
        //Test1
        ArrayList<Integer> actual1 = arrayListInt1.findCommonFieldsTwoArrayLists(arrayListInt2);
        ArrayList<Integer> actual2 = arrayListInt3.findCommonFieldsTwoArrayLists(arrayListInt4);
        ArrayList<Integer> actual3 = arrayListInt5.findCommonFieldsTwoArrayLists(arrayListInt6);

        //Then
        //Test1
        ArrayList<Integer> expected1 = new ArrayList<>(List.of(1,25));
        ArrayList<Integer> expected2 = new ArrayList<>(List.of(1,12));
        ArrayList<Integer> expected3 = new ArrayList<>(List.of(6));

        Assertions.assertAll("Test result for two not empty array lists with common elements is correct",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3)
        );

    }

    @Test
    void test_findCommonFieldsTwoArrayListsNotEmptyArrayLists_withoutCommonElementsGivesEmptyArrayList() {

        //given
        //Test1
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(1,5,25));
        ArrayListInt arrayListInt1 = new ArrayListInt(arrayList1);
        ArrayList<Integer> arrayList2 = new ArrayList<>(List.of(12,125));
        ArrayListInt arrayListInt2 = new ArrayListInt(arrayList2);

        //Test2
        ArrayList<Integer> arrayList3 = new ArrayList<>(List.of(1));
        ArrayListInt arrayListInt3 = new ArrayListInt(arrayList3);
        ArrayList<Integer> arrayList4 = new ArrayList<>(List.of(30));
        ArrayListInt arrayListInt4 = new ArrayListInt(arrayList4);

        //When
        //Test1
        ArrayList<Integer> actual1 = arrayListInt1.findCommonFieldsTwoArrayLists(arrayListInt2);
        ArrayList<Integer> actual2 = arrayListInt3.findCommonFieldsTwoArrayLists(arrayListInt4);
        //Then
        //Test1
        ArrayList<Integer> expected1 = new ArrayList<>(List.of());
        ArrayList<Integer> expected2 = new ArrayList<>(List.of());

        Assertions.assertAll("Test result for two not empty array lists with no common elements is empty array list",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2)
        );

    }

    @Test
    void test_findCommonFieldsTwoArrayListsNotEmptyArrayLists_oneOrTwoEmptyArrayListsReturnsEmptyArrayList() {

        //given
        //Test1
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of());
        ArrayListInt arrayListInt1 = new ArrayListInt(arrayList1);
        ArrayList<Integer> arrayList2 = new ArrayList<>(List.of());
        ArrayListInt arrayListInt2 = new ArrayListInt(arrayList2);

        //Test2
        ArrayList<Integer> arrayList3 = new ArrayList<>(List.of());
        ArrayListInt arrayListInt3 = new ArrayListInt(arrayList3);
        ArrayList<Integer> arrayList4 = new ArrayList<>(List.of(30));
        ArrayListInt arrayListInt4 = new ArrayListInt(arrayList4);

        //Test3
        ArrayList<Integer> arrayList5 = new ArrayList<>(List.of(1));
        ArrayListInt arrayListInt5 = new ArrayListInt(arrayList5);
        ArrayList<Integer> arrayList6 = new ArrayList<>(List.of());
        ArrayListInt arrayListInt6 = new ArrayListInt(arrayList6);

        //When
        //Test1
        ArrayList<Integer> actual1 = arrayListInt1.findCommonFieldsTwoArrayLists(arrayListInt2);
        ArrayList<Integer> actual2 = arrayListInt3.findCommonFieldsTwoArrayLists(arrayListInt4);
        ArrayList<Integer> actual3 = arrayListInt3.findCommonFieldsTwoArrayLists(arrayListInt6);
        //Then
        //Test1
        ArrayList<Integer> expected1 = new ArrayList<>(List.of());
        ArrayList<Integer> expected2 = new ArrayList<>(List.of());
        ArrayList<Integer> expected3 = new ArrayList<>(List.of());

        Assertions.assertAll("Test result for one or two empty array lists is empty",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3)
        );

    }
}