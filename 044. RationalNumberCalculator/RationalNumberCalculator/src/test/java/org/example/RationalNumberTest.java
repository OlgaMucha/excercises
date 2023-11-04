package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RationalNumberTest {

    @Test
    public void constructor_denominatorCantBeNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            //Code under test
            RationalNumber cut = new RationalNumber(1,0);
        });
    }


    //TEST ADDITION
    @Test
    public void addRationals_testForCorrectResultAddTwoPositiveRationals() {
        //given
        RationalNumber cut = new RationalNumber(1,2);

        RationalNumber rationalNumber2 = new RationalNumber(2,3);
        RationalNumber rationalNumber3 = new RationalNumber(1,4);
        RationalNumber rationalNumber4 = new RationalNumber(2,5);
        RationalNumber rationalNumber5 = new RationalNumber(20,50);
        RationalNumber rationalNumber6 = new RationalNumber(100,233);
        //when
        // 1/2 + 2/3 = 7/6
        RationalNumber actual1 = cut.addRationals(rationalNumber2);
        RationalNumber expected1 = new RationalNumber(7,6);
        // 1/2 + 1/4 = 6/8
        RationalNumber actual2 = cut.addRationals(rationalNumber3);
        RationalNumber expected2 = new RationalNumber(6,8);
        // 1/2 + 2/5 = 9/10
        RationalNumber actual3 = cut.addRationals(rationalNumber4);
        RationalNumber expected3 = new RationalNumber(9,10);
        // 1/2 + 20/50 = 90/100
        RationalNumber actual4 = cut.addRationals(rationalNumber5);
        RationalNumber expected4 = new RationalNumber(90,100);
        //  1/2 + 100/233 = 433/466
        RationalNumber actual5 = cut.addRationals(rationalNumber6);
        RationalNumber expected5 = new RationalNumber(433,466);

        //then
        Assertions.assertAll("Test addition",
        ()->assertEquals(expected1,actual1),
        ()->assertEquals(expected2,actual2),
        ()->assertEquals(expected3,actual3),
        ()->assertEquals(expected4,actual4),
        ()->assertEquals(expected5,actual5)
        );
    }

    @Test
    public void addRationals_testForCorrectResultAddWithZeroRational() {
        //given
        RationalNumber cut = new RationalNumber(0,2);

        RationalNumber rationalNumber2 = new RationalNumber(0,3);
        RationalNumber rationalNumber3 = new RationalNumber(0,2);
        RationalNumber rationalNumber4 = new RationalNumber(0,-2);
        // 2/2 + 2/3 = 0/6
        RationalNumber actual1 = cut.addRationals(rationalNumber2);
        RationalNumber expected1 = new RationalNumber(0,6);
        // 0/2 + 0/2 = 0/4
        RationalNumber actual2 = cut.addRationals(rationalNumber3);
        RationalNumber expected2 = new RationalNumber(0,4);
        // 0/2 + 0/-2 = 0/-4
        RationalNumber actual3 = cut.addRationals(rationalNumber4);
        RationalNumber expected3 = new RationalNumber(0,-4);

        //then
        Assertions.assertAll("Test addition",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3)
        );
    }


    //TEST SUBTRACTION
    @Test
    public void addRationals_testForCorrectResultSubtractTwoPositiveRationals() {
        //given
        RationalNumber cut = new RationalNumber(1,2);

        RationalNumber rationalNumber2 = new RationalNumber(2,3);
        RationalNumber rationalNumber3 = new RationalNumber(1,4);
        RationalNumber rationalNumber4 = new RationalNumber(2,5);
        RationalNumber rationalNumber5 = new RationalNumber(20,50);
        RationalNumber rationalNumber6 = new RationalNumber(100,233);
        //when
        // 1/2 + 2/3 = 7/6
        RationalNumber actual1 = cut.subtractRationals(rationalNumber2);
        RationalNumber expected1 = new RationalNumber(-1,6);
        // 1/2 + 1/4 = 6/8
        RationalNumber actual2 = cut.subtractRationals(rationalNumber3);
        RationalNumber expected2 = new RationalNumber(2,8);
        // 1/2 + 2/5 = 9/10
        RationalNumber actual3 = cut.subtractRationals(rationalNumber4);
        RationalNumber expected3 = new RationalNumber(1,10);
        // 1/2 + 20/50 = 90/100
        RationalNumber actual4 = cut.subtractRationals(rationalNumber5);
        RationalNumber expected4 = new RationalNumber(10,100);
        //  1/2 + 100/233 = 433/466
        RationalNumber actual5 = cut.subtractRationals(rationalNumber6);
        RationalNumber expected5 = new RationalNumber(33,466);

        //then
        Assertions.assertAll("Test subtraction",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3),
                ()->assertEquals(expected4,actual4),
                ()->assertEquals(expected5,actual5)
        );
    }

    @Test
    public void addRationals_testForCorrectResultSubtractWithZeroRational() {
        //given
        RationalNumber cut = new RationalNumber(0,2);

        RationalNumber rationalNumber2 = new RationalNumber(0,3);
        RationalNumber rationalNumber3 = new RationalNumber(0,2);
        RationalNumber rationalNumber4 = new RationalNumber(0,-2);
        // 2/2 + 2/3 = 0/6
        RationalNumber actual1 = cut.subtractRationals(rationalNumber2);
        RationalNumber expected1 = new RationalNumber(0,6);
        // 0/2 + 0/2 = 0/4
        RationalNumber actual2 = cut.subtractRationals(rationalNumber3);
        RationalNumber expected2 = new RationalNumber(0,4);
        // 0/2 + 0/-2 = 0/-4
        RationalNumber actual3 = cut.subtractRationals(rationalNumber4);
        RationalNumber expected3 = new RationalNumber(0,-4);

        //then
        Assertions.assertAll("Test addition",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3)
        );
    }


}