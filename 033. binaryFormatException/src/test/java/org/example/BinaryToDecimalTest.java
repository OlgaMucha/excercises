package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BinaryToDecimalTest {

    @Test
    void test_verifyInputIsABinaryNumber_throwsAnErrorForNonBinary() {
        String stringToCheck = "11122";
        Assert.assertThrows(
                BinaryFormatException.class, () ->
                        new BinaryToDecimal(stringToCheck)
        );
    }

    @Test
    void test_verifyInputIsABinaryNumber_returnsTrueForBinary() throws BinaryFormatException {
        String stringToCheck = "11100";
        BinaryToDecimal btd = new BinaryToDecimal(stringToCheck);
        Assertions.assertTrue(btd.verifyInputIsABinaryNumber(stringToCheck));
    }

    @Test
    void test_verifyInputIsABinaryNumber_returnsTrueForEmpty() throws BinaryFormatException {
        String stringToCheck = "";
        BinaryToDecimal btd = new BinaryToDecimal(stringToCheck);
        Assertions.assertTrue(btd.verifyInputIsABinaryNumber(stringToCheck));
    }
}