package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberFormatUserTest {


    @Test
    void test_applyRegexToCheckNumber_number_m_choice_2_8_10_16() {
        NumberFormatUser cut = new NumberFormatUser();
        String usersChoiceNumber = "m";

        String expectedReturnText = "Incorrect format";


        Assertions.assertAll(
                "Grouped assertion checking if 'm' is type 2, 8, 10, 16",
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(2))),
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(8))),
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(10))),
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(16)))
        );
    }

    @Test
    void test_applyRegexToCheckNumber_number_10_choice_2_8_10_16() {
        NumberFormatUser cut = new NumberFormatUser();
        String usersChoiceNumber = "10";

        String expectedReturnText = "Incorrect format";


        Assertions.assertAll(
                "Grouped assertion checking if 'm' is type 2, 8, 10, 16",
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(2))),
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(8))),
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(10))),
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(16)))
        );
    }

    @Test
    void test_applyRegexToCheckNumber_number_102_choice_2_8_10_16() {
        NumberFormatUser cut = new NumberFormatUser();
        String usersChoiceNumber = "102";

        String expectedReturnText = "Incorrect format";


        Assertions.assertAll(
                "Grouped assertion checking if 'm' is type 2, 8, 10, 16",
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(2))),
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(8))),
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(10))),
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(16)))
        );
    }

    @Test
    void test_applyRegexToCheckNumber_number_0_choice_2_8_10_16() {
        NumberFormatUser cut = new NumberFormatUser();
        String usersChoiceNumber = "0";

        String expectedReturnText = "Incorrect format";


        Assertions.assertAll(
                "Grouped assertion checking if 'm' is type 2, 8, 10, 16",
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(2))),
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(8))),
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(10))),
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(16)))
        );
    }

    @Test
    void test_applyRegexToCheckNumber_number_emptyString_choice_2_8_10_16() {
        NumberFormatUser cut = new NumberFormatUser();
        String usersChoiceNumber = "";

        String expectedReturnText = "Incorrect format";


        Assertions.assertAll(
                "Grouped assertion checking if 'm' is type 2, 8, 10, 16",
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(2))),
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(8))),
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(10))),
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(16)))
        );
    }

    @Test
    void test_applyRegexToCheckNumber_number_1f_choice_2_8_10_16() {
        NumberFormatUser cut = new NumberFormatUser();
        String usersChoiceNumber = "1f";

        String expectedReturnText = "Incorrect format";


        Assertions.assertAll(
                "Grouped assertion checking if 'm' is type 2, 8, 10, 16",
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(2))),
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(8))),
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(10))),
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(16)))
        );
    }

    @Test
    void test_applyRegexToCheckNumber_number_zzz_choice_2_8_10_16() {
        NumberFormatUser cut = new NumberFormatUser();
        String usersChoiceNumber = "zzz";

        String expectedReturnText = "Incorrect format";


        Assertions.assertAll(
                "Grouped assertion checking if 'm' is type 2, 8, 10, 16",
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(2))),
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(8))),
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(10))),
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(16)))
        );
    }

    @Test
    void test_applyRegexToCheckNumber_number_107_choice_2_8_10_16() {
        NumberFormatUser cut = new NumberFormatUser();
        String usersChoiceNumber = "107";

        String expectedReturnText = "Incorrect format";


        Assertions.assertAll(
                "Grouped assertion checking if 'm' is type 2, 8, 10, 16",
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(2))),
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(8))),
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(10))),
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(16)))
        );
    }

    @Test
    void test_applyRegexToCheckNumber_number_199_choice_2_8_10_16() {
        NumberFormatUser cut = new NumberFormatUser();
        String usersChoiceNumber = "199";

        String expectedReturnText = "Incorrect format";


        Assertions.assertAll(
                "Grouped assertion checking if 'm' is type 2, 8, 10, 16",
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(2))),
                ()->Assertions.assertEquals("Incorrect format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(8))),
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(10))),
                ()->Assertions.assertEquals("Correct format",cut.applyRegexToCheckNumber(usersChoiceNumber,cut.getRegexForUserChoice(16)))
        );
    }
}
