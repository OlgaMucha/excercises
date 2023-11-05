package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberIntTest {

    @Test
    void test_findDivisors_divisorsForPositiveIntegerNonPrimeNumbersGiveCorrectResult() {
        //Test1: number 20 gives as result array list with divisors:  [1,2,4,5,10,20]
        //Test2: number 13 gives as result array list with divisors:  [11,5,25]
        //Test3: number 71 gives as result array list with divisors:  [1,3,9,37,111,333]
        //Test4: number 71 gives as result array list with divisors:  [1,2,4,5,8,10,20,25,40,50,100,125,200,250, 500,1000]

        //given
        //Test1
        NumberInt numberInt1 = new NumberInt(20);
        //Test2
        NumberInt numberInt2 = new NumberInt(25);
        //Test3
        NumberInt numberInt3 = new NumberInt(333);
        //Test4
        NumberInt numberInt4 = new NumberInt(1000);
        //when
        //Test1
        ArrayList<Integer> actual1 = numberInt1.findDivisors();
        //Test2
        ArrayList<Integer> actual2 = numberInt2.findDivisors();
        //Test3
        ArrayList<Integer> actual3 = numberInt3.findDivisors();
        //Test4
        ArrayList<Integer> actual4 = numberInt4.findDivisors();
        //then
        //Test1
        ArrayList<Integer> expected1 = new ArrayList<>(List.of(1,2,4,5,10,20));
        //Test2
        ArrayList<Integer> expected2 = new ArrayList<>(List.of(1,5,25));
        //Test3
        ArrayList<Integer> expected3 = new ArrayList<>(List.of(1,3,9,37,111,333));
        //Test4
        ArrayList<Integer> expected4 = new ArrayList<>(List.of(1,2,4,5,8,10,20,25,40,50,100,125,200,250, 500,1000));

        Assertions.assertAll("Test divisors of integer for non prime number",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3),
                ()->assertEquals(expected4,actual4)
        );
    }

    @Test
    void test_findDivisors_divisorsForPositiveIntegerPrimeNumbersGiveCorrectResult() {
        //Test1: number 1 gives as result array list with divisors:  [1]
        //Test2: number 13 gives as result array list with divisors:  [1,13]
        //Test2: number 71 gives as result array list with divisors:  [1,71]
        //given
            //Test1
        NumberInt numberInt1 = new NumberInt(1);
            //Test2
        NumberInt numberInt2 = new NumberInt(13);
            //Test3
        NumberInt numberInt3 = new NumberInt(71);
        //when
            //Test1
        ArrayList<Integer> actual1 = numberInt1.findDivisors();
            //Test2
        ArrayList<Integer> actual2 = numberInt2.findDivisors();
            //Test3
        ArrayList<Integer> actual3 = numberInt3.findDivisors();
        //then
            //Test1
        ArrayList<Integer> expected1 = new ArrayList<>(List.of(1));
            //Test2
        ArrayList<Integer> expected2 = new ArrayList<>(List.of(1,13));
            //Test3
        ArrayList<Integer> expected3 = new ArrayList<>(List.of(1,71));

        Assertions.assertAll("Test divisors of integer for prime number",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3)
        );
    }

    @Test
    void test_findDivisors_divisorsForZeroReturnsEmptyArrayList() {
        //Test: number 0 gives as a result an empty array list
        //given
        NumberInt numberInt1 = new NumberInt(0);
        //when
        ArrayList<Integer> actual1 = numberInt1.findDivisors();
        //then
        ArrayList<Integer> expected1 = new ArrayList<>(List.of());

        Assertions.assertAll("Test divisors for zero returns an empty array list",
                ()->assertEquals(expected1,actual1)
        );
    }

    @Test
    void test_findDivisors_divisorsForNegativeInteger() {
        //Test1: number -1 gives as result array list with divisors:  [1]
        //Test2: number -12 gives as result array list with divisors:  [1, 2, 3, 4, 6, 12]
        //Test2: number 71 gives as result array list with divisors:  [1,5, 25]
        //given
        //Test1
        NumberInt numberInt1 = new NumberInt(-1);
        //Test2
        NumberInt numberInt2 = new NumberInt(-12);
        //Test3
        NumberInt numberInt3 = new NumberInt(-25);

        //when
        //Test1
        ArrayList<Integer> actual1 = numberInt1.findDivisors();
        //Test2
        ArrayList<Integer> actual2 = numberInt2.findDivisors();
        //Test3
        ArrayList<Integer> actual3 = numberInt3.findDivisors();

        //then
        //Test1
        ArrayList<Integer> expected1 = new ArrayList<>(List.of(1));
        //Test2
        ArrayList<Integer> expected2 = new ArrayList<>(List.of(1, 2, 3, 4, 6, 12));
        //Test3
        ArrayList<Integer> expected3 = new ArrayList<>(List.of(1,5, 25));

        Assertions.assertAll("Test divisors of integer for prime number",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3)
        );
    }

    @Test
    void test_greatestCommonDivisor_forTwoPositiveNumbers() {
        //Test1: numbers 5 and 25 gives 5 as result integer as greatest common divisor
        //Test2: numbers 27 and 12 gives 3 as result integer as greatest common divisor
        //Test3: number 300 and 600 gives 300 as result integer as greatest common divisor
        //Test4: number 1 and 600 gives 1 as result integer as greatest common divisor
        //Test5: number 17 and 17 gives 17 as result integer as greatest common divisor
            //given
            NumberInt numberInt1 = new NumberInt(5);
            NumberInt numberInt2 = new NumberInt(25);
            //test2
            NumberInt numberInt3 = new NumberInt(27);
            NumberInt numberInt4 = new NumberInt(12);
            //test3
            NumberInt numberInt5 = new NumberInt(300);
            NumberInt numberInt6 = new NumberInt(600);
            //test4
            NumberInt numberInt7 = new NumberInt(1);
            NumberInt numberInt8 = new NumberInt(600);
            //test4
            NumberInt numberInt9 = new NumberInt(17);
            NumberInt numberInt10 = new NumberInt(17);

        //when
            //test1
            int actual1 = numberInt1.greatestCommonDivisor(numberInt2);
            //test2
            int actual2 = numberInt3.greatestCommonDivisor(numberInt4);
            //test3
            int actual3 = numberInt5.greatestCommonDivisor(numberInt6);
            //test4
            int actual4 = numberInt7.greatestCommonDivisor(numberInt8);
            //test5
            int actual5 = numberInt9.greatestCommonDivisor(numberInt10);

        //then
            //test1
            int expected1 = 5;
            //test2
            int expected2 = 3;
            //test3
            int expected3 = 300;
            //test4
            int expected4 = 1;
            //test5
            int expected5 = 17;

        Assertions.assertAll("Greatest common divisor for positive integers",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3),
                ()->assertEquals(expected4,actual4),
                ()->assertEquals(expected5,actual5)
        );
    }

    @Test
    void test_greatestCommonDivisor_forNegativeNumbers() {
         //Test1: numbers -5 and -25 gives 5 as result integer as greatest common divisor
         //Test2: numbers -27 and 12 gives 3 as result integer as greatest common divisor
         //Test3: number 300 and -600 gives 300 as result integer as greatest common divisor
         //Test4: number 1 and 600 gives 1 as result integer as greatest common divisor
        //given
        //test1
        NumberInt numberInt1 = new NumberInt(-5);
        NumberInt numberInt2 = new NumberInt(-25);
        //test2
        NumberInt numberInt3 = new NumberInt(-27);
        NumberInt numberInt4 = new NumberInt(12);
        //test3
        NumberInt numberInt5 = new NumberInt(300);
        NumberInt numberInt6 = new NumberInt(-600);
        //test4
        NumberInt numberInt7 = new NumberInt(-1);
        NumberInt numberInt8 = new NumberInt(-600);

        //when
        //test1
        int actual1 = numberInt1.greatestCommonDivisor(numberInt2);
        //test2
        int actual2 = numberInt3.greatestCommonDivisor(numberInt4);
        //test3
        int actual3 = numberInt5.greatestCommonDivisor(numberInt6);
        //test4
        int actual4 = numberInt7.greatestCommonDivisor(numberInt8);

        //then
        //test1
        int expected1 = 5;
        //test2
        int expected2 = 3;
        //test3
        int expected3 = 300;
        //test4
        int expected4 = 1;

        Assertions.assertAll("Greatest common divisor for positive integers",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3),
                ()->assertEquals(expected4,actual4)
        );
    }

    @Test
    void test_greatestCommonDivisor_forZero() {
       //Test1: numbers 0 and 100 gives 0 as result integer as greatest common divisor
       //Test2: numbers 0 and 12 gives 12 as result integer as greatest common divisor
        //given
        //test1
        NumberInt numberInt1 = new NumberInt(0);
        NumberInt numberInt2 = new NumberInt(100);
        //test2
        NumberInt numberInt3 = new NumberInt(0);
        NumberInt numberInt4 = new NumberInt(-12);

        //when
        //test1
        int actual1 = numberInt1.greatestCommonDivisor(numberInt2);
        //test2
        int actual2 = numberInt3.greatestCommonDivisor(numberInt4);

        //then
        //test1
        int expected1 = 0;
        //test2
        int expected2 = 0;

        Assertions.assertAll("Greatest common divisor for positive integers",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2)
        );
    }
}