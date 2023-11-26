package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberFormatUserTest {



    @Test
    void test_getRegexForUserChoice_choice_2_8_10_16() {
        NumberFormatUser cut = new NumberFormatUser();

        String expectedReturnText = "Incorrect format";

        Assertions.assertAll(
                "Grouped assertion types 2, 8, 10, 16 return correct regex",
                ()->Assertions.assertEquals("^[01]+",cut.getRegexForUserChoice(2)),
                ()->Assertions.assertEquals("^[0-7]+",cut.getRegexForUserChoice(8)),
                ()->Assertions.assertEquals("^[0-9]+",cut.getRegexForUserChoice(10)),
                ()->Assertions.assertEquals("^[0-9a-fA-F]+",cut.getRegexForUserChoice(16))
        );
    }

    @Test
    void test_getRegexForUserChoice_choice_0_5_12_999() {
        NumberFormatUser cut = new NumberFormatUser();

        String expectedReturnText = "Incorrect format";

        Assertions.assertAll(
                "Grouped assertion types 2, 8, 10, 16, -10 return string incorrect entry",
                ()->Assertions.assertEquals("Incorrect entry",cut.getRegexForUserChoice(0)),
                ()->Assertions.assertEquals("Incorrect entry",cut.getRegexForUserChoice(5)),
                ()->Assertions.assertEquals("Incorrect entry",cut.getRegexForUserChoice(12)),
                ()->Assertions.assertEquals("Incorrect entry",cut.getRegexForUserChoice(999)),
                ()->Assertions.assertEquals("Incorrect entry",cut.getRegexForUserChoice(-10))

        );
    }


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
