package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StringsTest {

    @Test
    void test_stringToCharacters_String_tralala() {
        String input = "tralala";
        Strings cut = new Strings(input);
        //act
        ArrayList<Character> arrayListActual = cut.stringToCharacters();
        ArrayList<Character> arrayListExpected = new ArrayList<>(List.of('t','r','a','l','a','l','a'));
        Assertions.assertEquals(arrayListExpected,arrayListActual);
    }

    @Test
    void test_stringToCharacters_String_empty() {
        String input = "";
        Strings cut = new Strings(input);
        //act
        ArrayList<Character> arrayListActual = cut.stringToCharacters();
        ArrayList<Character> arrayListExpected = new ArrayList<>(List.of());
        Assertions.assertEquals(arrayListExpected,arrayListActual);
    }

    @Test
    void test_stringToCharacters_String_tra_la() {
        String input = "tra la";
        Strings cut = new Strings(input);
        //act
        ArrayList<Character> arrayListActual = cut.stringToCharacters();
        ArrayList<Character> arrayListExpected = new ArrayList<>(List.of('t','r','a',' ','l','a'));
        Assertions.assertEquals(arrayListExpected,arrayListActual);
    }

    @Test
    void test_stringToCharacters_String_10aaprocent() {
        String input = "10aa%";
        Strings cut = new Strings(input);
        //act
        ArrayList<Character> arrayListActual = cut.stringToCharacters();
        ArrayList<Character> arrayListExpected = new ArrayList<>(List.of('1','0','a','a','%'));
        Assertions.assertEquals(arrayListExpected,arrayListActual);
    }

    @Test
    void test_stringToCharacters_String_3_spaces() {
        String input = "   ";
        Strings cut = new Strings(input);
        //act
        ArrayList<Character> arrayListActual = cut.stringToCharacters();
        ArrayList<Character> arrayListExpected = new ArrayList<>(List.of(' ',' ',' '));
        Assertions.assertEquals(arrayListExpected,arrayListActual);
    }

    @Test
    void test_stringToCharacters_String_1() {
        String input = "1";
        Strings cut = new Strings(input);
        //act
        ArrayList<Character> arrayListActual = cut.stringToCharacters();
        ArrayList<Character> arrayListExpected = new ArrayList<>(List.of('1'));
        Assertions.assertEquals(arrayListExpected,arrayListActual);
    }
}