package org.example;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.*;

class FileCountTest {


    public String setup() throws FileNotFoundException {
        //create file
        java.io.File file = new java.io.File("java.txt");

        java.io.PrintWriter printWriter = new java.io.PrintWriter(file);
        printWriter.println("Java is een programmeertaal.");
        printWriter.println("yes");
        printWriter.close();
        return file.getName();
    }

    @Test
    void test_getCountLines_countDataInFileWelcomeLines() throws FileNotFoundException {
        String fileName = setup();
        File file = new File(fileName);
        FileCount fileCount = new FileCount(file);
        assertEquals(fileCount.getCountLines(), 2);
    }

    @Test
    void test_getCountLines_countDataInFileWelcomeWords() throws FileNotFoundException {
        String fileName = setup();
        File file = new File(fileName);
        FileCount fileCount = new FileCount(file);
        assertEquals(fileCount.getCountWords(), 5);
    }

    @Test
    void test_getCountLines_countDataInFileWelcomeCharacters() throws FileNotFoundException {
        String fileName = setup();
        File file = new File(fileName);
        FileCount fileCount = new FileCount(file);
        assertEquals(fileCount.getCountCharacters(), 31);
    }
}