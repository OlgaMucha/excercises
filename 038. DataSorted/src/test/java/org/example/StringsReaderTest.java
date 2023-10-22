package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringsReaderTest {



    @Test
    void test_readStringsFromFile_entersAllStringsFromFileToArrayListInThisSameOrderAsInTheFile() throws FileNotFoundException {
        java.io.File file = new java.io.File("test1.txt");
        java.io.PrintWriter pw = new java.io.PrintWriter(file);
        pw.println("alpha book char black");
        pw.println("red ziko");
        pw.close();
        StringsReader sr = new StringsReader("test1.txt");
        ArrayList<String> result1 = new ArrayList<String>(Arrays.asList("alpha", "book", "char", "black", "red", "ziko"));
        Assertions.assertEquals(sr.readStringsFromFile(), result1);
    }

    @Test
    void test_checkIfArrayStringsIsSorted_forEmptyFileWillReturnSorted() throws FileNotFoundException {
        java.io.File file = new java.io.File("test2.txt");
        java.io.PrintWriter pw = new java.io.PrintWriter(file);
        pw.close();
        StringsReader sr = new StringsReader("test2.txt");
        String[] array2 = {};
        ArrayList<String> result2 = new ArrayList<>(Arrays.asList(array2));
        Assertions.assertEquals(sr.readStringsFromFile(), result2);
    }

    @Test
    void test_testPrintResults() {
    }
}