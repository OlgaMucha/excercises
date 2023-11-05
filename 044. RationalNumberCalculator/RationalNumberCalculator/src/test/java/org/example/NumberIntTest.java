package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberIntTest {

    @Test
    void test_findDivisors_divisorsForPositiveIntegerNonPrimeNumbersMoreThenTwoDivisors() {
        //given
        NumberInt numberInt1 = new NumberInt(20);
        NumberInt numberInt2 = new NumberInt(25);
        NumberInt numberInt3 = new NumberInt(333);
        NumberInt numberInt4 = new NumberInt(1000);
        //when
        ArrayList<Integer> actual1 = numberInt1.findDivisors();
        ArrayList<Integer> actual2 = numberInt2.findDivisors();
        ArrayList<Integer> actual3 = numberInt3.findDivisors();
        ArrayList<Integer> actual4 = numberInt4.findDivisors();
        //then
        List<Integer> list1 = List.of(1,2,4, 5,10,20);
        ArrayList<Integer> expected1 = new ArrayList<>(list1);
        List<Integer> list2 = List.of(1,5,25);
        ArrayList<Integer> expected2 = new ArrayList<>(list2);
        List<Integer> list3 = List.of(1,3,9,37,111,333);
        ArrayList<Integer> expected3 = new ArrayList<>(list3);
        List<Integer> list4 = List.of(1,2,4,5,8,10,20,25,40,50,100,125,200,250, 500,1000);
        ArrayList<Integer> expected4 = new ArrayList<>(list4);

        Assertions.assertAll("Test divisors of integer for non prime number",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3),
                ()->assertEquals(expected4,actual4)
        );
    }

    @Test
    void test_findDivisors_divisorsForPositiveIntegerPrimeNumbersOneOrTwoDivisors() {
        //given
        NumberInt numberInt1 = new NumberInt(1);
        NumberInt numberInt2 = new NumberInt(13);
        NumberInt numberInt3 = new NumberInt(71);
        //when
        ArrayList<Integer> actual1 = numberInt1.findDivisors();
        ArrayList<Integer> actual2 = numberInt2.findDivisors();
        ArrayList<Integer> actual3 = numberInt3.findDivisors();
        //then
        List<Integer> list1 = List.of(1);
        ArrayList<Integer> expected1 = new ArrayList<>(list1);
        List<Integer> list2 = List.of(1,13);
        ArrayList<Integer> expected2 = new ArrayList<>(list2);
        List<Integer> list3 = List.of(1,71);
        ArrayList<Integer> expected3 = new ArrayList<>(list3);

        Assertions.assertAll("Test divisors of integer for prime number",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3)
        );
    }

    @Test
    void test_findDivisors_divisorsForZeroNoDivisors() {
        //given
        NumberInt numberInt1 = new NumberInt(0);
        //when
        ArrayList<Integer> actual1 = numberInt1.findDivisors();
        //then
        List<Integer> list1 = List.of();
        ArrayList<Integer> expected1 = new ArrayList<>(list1);

        Assertions.assertAll("Test divisors of integer for prime number",
                ()->assertEquals(expected1,actual1)
        );
    }


    @Test
    void greatestCommonDivisor() {
    }
}