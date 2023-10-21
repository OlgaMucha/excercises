package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;


public class PasswordTest {
    String passwordString1 = "123"; //password too short
    String passwordString2 = "12312312312@"; //password with character that is not digit or letter
    String passwordString3 = "1aaaaaaaaa"; //password with 1 digit
    String passwordString4 = "aaaaaaaaaa"; //password with no digits
    String passwordString = "a12aaaaaaaa"; //correct password

    Password p1 = new Password(passwordString1);
    Password p2 = new Password(passwordString2);
    Password p3 = new Password(passwordString3);
    Password p4 = new Password(passwordString4);
    Password password1 = new Password(passwordString);
    Password password2 = new Password(passwordString);



    @ParameterizedTest
    @ValueSource(strings = {"123111aa", "123123123123", "AAAAAAA123"})
    void test_correctPasswordsWillReturnTrue(String passwordChar) {
        Password password = new Password(passwordChar);
        Assert.assertTrue(password.passwordCorrectCheck());
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    void test_emptyPasswordsWillReturnFalse(String passwordChar) {
        Password password = new Password(passwordChar);
        Assert.assertFalse(password.passwordCorrectCheck());
    }

    //Test length
    @Test
    public void test_passwordWithLessThenEightDigitsIncorrect() {
        Assert.assertFalse(p1.passwordCorrectCheck());
    }

    //Test only digits and letters
    @Test
    public void test_passwordWithIncorrectCharacterWillFail(){
        Assert.assertFalse(p2.passwordCorrectCheck());
    }

    @Test
    public void test_passwordWithOnlyOneDigitWillFail(){
        Assert.assertFalse(p3.passwordCorrectCheck());
    }

    @Test
    public void test_passwordWithNoDigitsWillFail(){
        Assert.assertFalse(p4.passwordCorrectCheck());
    }

    @Test
    public void test_twoPasswordsEqualToEachOther(){
        Assert.assertEquals(password1,password2);
    }
}