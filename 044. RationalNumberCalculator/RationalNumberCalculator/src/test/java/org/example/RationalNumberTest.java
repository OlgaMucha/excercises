package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RationalNumberTest {

//    @BeforeEach
//    public void setup(){
//        //0 as numerator
//        RationalNumber rationalNumber2 = new RationalNumber(0,2);
//        //numerator smaller then denominator
//
//        //numerator equals denominator
//        RationalNumber rationalNumber7 = new RationalNumber(100,233);
//
//        //numerator greater then denominator
//        RationalNumber rationalNumber8 = new RationalNumber(13,5);
//        RationalNumber rationalNumber9 = new RationalNumber(13,1);
//        RationalNumber rationalNumber10 = new RationalNumber(130,129);
//        //numerator negative denominator positive
//        RationalNumber rationalNumber11 = new RationalNumber(-10,5);
//        RationalNumber rationalNumber12 = new RationalNumber(-1,12);
//        //numerator positive denominator negative
//        RationalNumber rationalNumber13 = new RationalNumber(1,-12);
//        RationalNumber rationalNumber14 = new RationalNumber(11,-2);
//        //both numerator and denominator negative
//        RationalNumber rationalNumber15 = new RationalNumber(11,-2);
//    }

    @Test
    public void addRationals_testForCorrectResultAddTwoPositiveRationals() {
        //given
        RationalNumber cut = new RationalNumber(1,2);

        RationalNumber rationalNumber2 = new RationalNumber(2,3);
        RationalNumber rationalNumber3 = new RationalNumber(1,4);
        RationalNumber rationalNumber4 = new RationalNumber(2,5);
        RationalNumber rationalNumber5 = new RationalNumber(20,50);
        RationalNumber rationalNumber6 = new RationalNumber(100,233);
        RationalNumber rationalNumber7 = new RationalNumber(-1,2);
        RationalNumber rationalNumber8 = new RationalNumber(-1,3);
        RationalNumber rationalNumber9 = new RationalNumber(-1,-3);
        //when
        RationalNumber actual1 = cut.addRationals(rationalNumber2);
        RationalNumber expected1 = new RationalNumber(7,6);

        RationalNumber actual2 = cut.addRationals(rationalNumber3);
        RationalNumber expected2 = new RationalNumber(6,8);

        RationalNumber actual3 = cut.addRationals(rationalNumber4);
        RationalNumber expected3 = new RationalNumber(9,10);

        RationalNumber actual4 = cut.addRationals(rationalNumber5);
        RationalNumber expected4 = new RationalNumber(90,100);

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

        RationalNumber actual1 = cut.addRationals(rationalNumber2);
        RationalNumber expected1 = new RationalNumber(0,6);

        RationalNumber actual2 = cut.addRationals(rationalNumber3);
        RationalNumber expected2 = new RationalNumber(0,4);

        RationalNumber actual3 = cut.addRationals(rationalNumber4);
        RationalNumber expected3 = new RationalNumber(0,-4);

        //then
        Assertions.assertAll("Test addition",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3)
        );
    }
}