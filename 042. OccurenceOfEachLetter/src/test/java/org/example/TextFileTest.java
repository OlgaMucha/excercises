package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;

class TextFileTest {

    public static TextFile setUp() throws FileNotFoundException {
        String path = "test1.txt";
        File file = new File(path);
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("Java");
        printWriter.println("Return the resulting string");
        printWriter.close();
        return new TextFile(path);
    }



    @Test
    void test_getOccurrenceOfCharactersInFile_numberOfCharactersMatches() throws FileNotFoundException {
        TextFile unitUnderTest = setUp();
        HashMap<String, Integer> hashMapTest1 = unitUnderTest.getOccurrenceOfCharactersInFile(unitUnderTest.getPath());

        Assertions.assertAll(
                () -> Assertions.assertEquals(2,hashMapTest1.get("a")),
                () -> Assertions.assertEquals(1,hashMapTest1.get("v")),
                () -> Assertions.assertEquals(1,hashMapTest1.get("j"))
                );
    }
}