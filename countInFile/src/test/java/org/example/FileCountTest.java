package org.example;

import org.junit.Assert;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static org.junit.jupiter.api.Assertions.*;

class FileCountTest {

    public String setup() throws FileNotFoundException {
        //create file
        java.io.File file = new java.io.File("welcome.txt");

        java.io.PrintWriter printWriter = new java.io.PrintWriter(file);
        printWriter.println("Java is een objectgeoriënteerde programmeertaal.");
        printWriter.println("is een platformonafhankelijke taal die qua syntaxis grotendeels gebaseerd is op de programmeertaal C++.");
        printWriter.println("Java beschikt echter over een uitgebreidere klassenbibliotheek dan C++.");
        printWriter.close();
        return file.getName();
    }

    @Test
    void test_getCountLines_countDataInFileWelcomeLines() throws FileNotFoundException {
        String fileName = setup();
        File file = new File(fileName);
        FileCount fileCount = new FileCount(file);
        assertEquals(fileCount.getCountLines(), 3);
    }

    @Test
    void test_getCountLines_countDataInFileWelcomeWords() throws FileNotFoundException {
        String fileName = setup();
        File file = new File(fileName);
        FileCount fileCount = new FileCount(file);
        assertEquals(fileCount.getCountWords(), 28);
    }
}