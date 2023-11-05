package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        RationalNumber rationalNumber3 = new RationalNumber(1,2);
        RationalNumber rationalNumber4 = new RationalNumber(1,-2);
        // 2/2 + 2/3 = 0/6
        RationalNumber actual1 = cut.addRationals(rationalNumber2);
        RationalNumber expected1 = new RationalNumber(0,6);
        // 0/2 + 1/2 = 2/4
        RationalNumber actual2 = cut.addRationals(rationalNumber3);
        RationalNumber expected2 = new RationalNumber(2,4);
        // 0/2 + 0/-2 = 2/-4
        RationalNumber actual3 = cut.addRationals(rationalNumber4);
        RationalNumber expected3 = new RationalNumber(2,-4);

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
        // 1/2 - 2/3 = -1/6
        RationalNumber actual1 = cut.subtractRationals(rationalNumber2);
        RationalNumber expected1 = new RationalNumber(-1,6);
        // 1/2 - 1/4 = 2/8
        RationalNumber actual2 = cut.subtractRationals(rationalNumber3);
        RationalNumber expected2 = new RationalNumber(2,8);
        // 1/2 - 2/5 = 1/10
        RationalNumber actual3 = cut.subtractRationals(rationalNumber4);
        RationalNumber expected3 = new RationalNumber(1,10);
        // 1/2 - 20/50 = 10/100
        RationalNumber actual4 = cut.subtractRationals(rationalNumber5);
        RationalNumber expected4 = new RationalNumber(10,100);
        //  1/2 - 100/233 = 33/466
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
        RationalNumber rationalNumber3 = new RationalNumber(1,2);
        RationalNumber rationalNumber4 = new RationalNumber(1,-2);
        // 2/2 - 2/3 = 0/6
        RationalNumber actual1 = cut.subtractRationals(rationalNumber2);
        RationalNumber expected1 = new RationalNumber(0,6);
        // 0/2 - 0/2 = 0/4
        RationalNumber actual2 = cut.subtractRationals(rationalNumber3);
        RationalNumber expected2 = new RationalNumber(-2,4);
        // 0/2 - 0/-2 = 0/-4
        RationalNumber actual3 = cut.subtractRationals(rationalNumber4);
        RationalNumber expected3 = new RationalNumber(-2,-4);

        //then
        Assertions.assertAll("Test addition",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3)
        );
    }


    //TEST MULTIPLICATION
    @Test
    public void addRationals_testForCorrectResultMultiplyTwoPositiveRationals() {
        //given
        RationalNumber cut = new RationalNumber(1,2);

        RationalNumber rationalNumber2 = new RationalNumber(2,3);
        RationalNumber rationalNumber3 = new RationalNumber(1,4);
        RationalNumber rationalNumber4 = new RationalNumber(2,5);
        RationalNumber rationalNumber5 = new RationalNumber(20,50);
        RationalNumber rationalNumber6 = new RationalNumber(100,233);;
        //when
        // 1/2 * 2/3 = 2/6
        RationalNumber actual1 = cut.multiplyRationals(rationalNumber2);
        RationalNumber expected1 = new RationalNumber(2,6);
        // 1/2 * 1/4 = 1/8
        RationalNumber actual2 = cut.multiplyRationals(rationalNumber3);
        RationalNumber expected2 = new RationalNumber(1,8);
        // 1/2 * 2/5 = 2/10
        RationalNumber actual3 = cut.multiplyRationals(rationalNumber4);
        RationalNumber expected3 = new RationalNumber(2,10);
        // 1/2 * 20/50 = 20/100
        RationalNumber actual4 = cut.multiplyRationals(rationalNumber5);
        RationalNumber expected4 = new RationalNumber(20,100);
        //  1/2 * 100/233 = 100/466
        RationalNumber actual5 = cut.multiplyRationals(rationalNumber6);
        RationalNumber expected5 = new RationalNumber(100,466);

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
    public void addRationals_testForCorrectResultMultiplyWithZeroRational() {
        //given
        RationalNumber cut = new RationalNumber(0,2);

        RationalNumber rationalNumber2 = new RationalNumber(0,3);
        RationalNumber rationalNumber3 = new RationalNumber(1,2);
        RationalNumber rationalNumber4 = new RationalNumber(1,-2);
        // 0/2 * 0/3 = 0/6
        RationalNumber actual1 = cut.multiplyRationals(rationalNumber2);
        RationalNumber expected1 = new RationalNumber(0,6);
        // 0/2 * 1/2 = 0/4
        RationalNumber actual2 = cut.multiplyRationals(rationalNumber3);
        RationalNumber expected2 = new RationalNumber(0,4);
        // 0/2 * 1/-2 = 0/-4
        RationalNumber actual3 = cut.multiplyRationals(rationalNumber4);
        RationalNumber expected3 = new RationalNumber(0,-4);

        //then
        Assertions.assertAll("Test addition",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3)
        );
    }


    //TEST DIVISION

    @Test
    public void constructor_byDivisionNumeratorOfDivisorCantBeNull(){
        //Code under test
        RationalNumber cut = new RationalNumber(1,10);
        RationalNumber div = new RationalNumber(0, 5);

        Assertions.assertThrows(IllegalArgumentException.class,() -> {

            cut.divideRationals(div);
        });
    }

    @Test
    public void addRationals_testForCorrectResultDivideTwoPositiveRationals() {
        //given
        RationalNumber cut = new RationalNumber(1,2);

        RationalNumber rationalNumber2 = new RationalNumber(2,3);
        RationalNumber rationalNumber3 = new RationalNumber(1,4);
        RationalNumber rationalNumber4 = new RationalNumber(2,5);
        RationalNumber rationalNumber5 = new RationalNumber(20,50);
        RationalNumber rationalNumber6 = new RationalNumber(100,233);;
        //when
        // 1/2 / 2/3 = 3/4
        RationalNumber actual1 = cut.divideRationals(rationalNumber2);
        RationalNumber expected1 = new RationalNumber(3,4);
        // 1/2 / 1/4 = 4/2
        RationalNumber actual2 = cut.divideRationals(rationalNumber3);
        RationalNumber expected2 = new RationalNumber(4,2);
        // 1/2 / 2/5 = 5/4
        RationalNumber actual3 = cut.divideRationals(rationalNumber4);
        RationalNumber expected3 = new RationalNumber(5,4);
        // 1/2 / 20/50 = 50/40
        RationalNumber actual4 = cut.divideRationals(rationalNumber5);
        RationalNumber expected4 = new RationalNumber(50,40);
        //  1/2 / 100/233 = 233/200
        RationalNumber actual5 = cut.divideRationals(rationalNumber6);
        RationalNumber expected5 = new RationalNumber(233,200);

        //then
        Assertions.assertAll("Test division",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3),
                ()->assertEquals(expected4,actual4),
                ()->assertEquals(expected5,actual5)
        );
    }

    @Test
    public void addRationals_testForCorrectResultDivideWithZeroRational() {
        //given
        RationalNumber cut = new RationalNumber(0,2);

        RationalNumber rationalNumber2 = new RationalNumber(5,3);
        RationalNumber rationalNumber3 = new RationalNumber(1,2);
        RationalNumber rationalNumber4 = new RationalNumber(1,-2);
        // 0/2 * 5/3 = 0/6
        RationalNumber actual1 = cut.divideRationals(rationalNumber2);
        RationalNumber expected1 = new RationalNumber(0,10);
        // 0/2 * 1/2 = 0/4
        RationalNumber actual2 = cut.divideRationals(rationalNumber3);
        RationalNumber expected2 = new RationalNumber(0,2);
        // 0/2 * 1/-2 = 0/-4
        RationalNumber actual3 = cut.divideRationals(rationalNumber4);
        RationalNumber expected3 = new RationalNumber(0,2);

        //then
        Assertions.assertAll("Test division",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3)
        );
    }

    //TEST SIMPLIFY RATIONAL

    @Test
    public void test_simplifyRationalNumber_rationalNumberCanBeSimplified(){
        RationalNumber rationalNumber1 = new RationalNumber(5,10);
        RationalNumber expected1 = rationalNumber1.simplifyRationalNumber();
        RationalNumber actual1 = new RationalNumber(1,2);

        RationalNumber rationalNumber2 = new RationalNumber(5,20);
        RationalNumber expected2 = rationalNumber2.simplifyRationalNumber();
        RationalNumber actual2 = new RationalNumber(1,4);

        RationalNumber rationalNumber3 = new RationalNumber(30,270);
        RationalNumber expected3 = rationalNumber3.simplifyRationalNumber();
        RationalNumber actual3 = new RationalNumber(1,9);

        RationalNumber rationalNumber4 = new RationalNumber(15,90);
        RationalNumber expected4  = rationalNumber3.simplifyRationalNumber();
        RationalNumber actual4 = new RationalNumber(5,30);

        //then
        Assertions.assertAll("Test simplify rational number that can be simplified",
                ()->assertEquals(expected1,actual1),
                ()->assertEquals(expected2,actual2),
                ()->assertEquals(expected3,actual3),
                ()->assertEquals(expected3,actual3)
        );

    }

    @Test
    public void test_simplifyRationalNumber_rationalNumberCantBeSimplified(){
        RationalNumber rationalNumber1 = new RationalNumber(1,10);
        RationalNumber expected1 = rationalNumber1.simplifyRationalNumber();

        RationalNumber rationalNumber2 = new RationalNumber(3,20);
        RationalNumber expected2 = rationalNumber2.simplifyRationalNumber();

        RationalNumber rationalNumber3 = new RationalNumber(13,270);
        RationalNumber expected3 = rationalNumber3.simplifyRationalNumber();

        RationalNumber rationalNumber4 = new RationalNumber(7,90);
        RationalNumber expected4  = rationalNumber4.simplifyRationalNumber();

        //then
        Assertions.assertAll("Test simplify rational number that can' t be simplified",
                ()-> assertEquals(expected1, rationalNumber1),
                ()-> assertEquals(expected2, rationalNumber2),
                ()-> assertEquals(expected3, rationalNumber3),
                ()-> assertEquals(expected4, rationalNumber4)

        );

    }

    @Test
    public void test_simplifyRationalNumber_rationalNumberNumeratorEqualsZeroWillReturnZeroOverOne(){
        RationalNumber rationalNumber1 = new RationalNumber(0,10);
        RationalNumber expected1 = rationalNumber1.simplifyRationalNumber();
        RationalNumber actual1 = new RationalNumber(0,1);

        //then
        Assertions.assertAll("Test simplify rational number that can be simplified",
                ()-> assertEquals(expected1, actual1)
                //()-> assertEquals(expected2, rationalNumber2)

        );

    }

    @Test
    public void test_simplifyRationalNumber_rationalNumberNumeratorOrDenominatorIsNegative(){
        //given
        RationalNumber rationalNumber1 = new RationalNumber(-2,4);
        RationalNumber rationalNumber2 = new RationalNumber(-2,-4);
        //when
        RationalNumber expected1 = rationalNumber1.simplifyRationalNumber();
        RationalNumber expected2 = rationalNumber2.simplifyRationalNumber();
        //then
        RationalNumber actual1 = new RationalNumber(-1,2);
        RationalNumber actual2 = new RationalNumber(1,2);

        Assertions.assertAll("Test simplify rational number that can be simplified",
                ()-> assertEquals(expected1, actual1),
                ()-> assertEquals(expected2, actual2)

        );

    }



}