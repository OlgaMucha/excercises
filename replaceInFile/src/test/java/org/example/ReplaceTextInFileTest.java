package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.example.Main.TEXT_IN_FILE;

class ReplaceTextInFileTest {


    @Test
    void test_searchAndReplaceStringAndSavingTextToNewFile_ifWordsToReplaceReturnsReplaceTrue() throws FileNotFoundException {
        java.io.File file = new java.io.File("test1.txt");
        java.io.PrintWriter pw = new java.io.PrintWriter(file);  //open file for writing
        String textToFile = """
                I hava two dogs \n Two dogs have me""";
        String oldWord = "dogs";
        String newWord = "cats";
        pw.close();
        ReplaceTextInFile replaceTextInFile = new ReplaceTextInFile("test1.txt", textToFile, oldWord, newWord);
        Assertions.assertTrue(replaceTextInFile.searchAndReplaceStringAndSavingTextToNewFile(replaceTextInFile.getOldText(), replaceTextInFile.getNewText(), replaceTextInFile.oldFilePath, replaceTextInFile.getFileText()));
        Boolean success = file.delete();  //delete file to prepare for another test
        pw.close();
    }

    @Test
    void test_searchAndReplaceStringAndSavingTextToNewFile_ifNoWordsToReplaceReturnsReplaceFalse() throws FileNotFoundException {
        //create file
        java.io.File file = new java.io.File("test1.txt");
        java.io.PrintWriter pw = new java.io.PrintWriter(file);  //open file for writing
        String textToFile = """
                I hava two dogs \n Two dogs have me""";
        String oldWord = "legs";
        String newWord = "cats";
        pw.close();
        ReplaceTextInFile replaceTextInFile = new ReplaceTextInFile("test1.txt", textToFile, oldWord, newWord);
        Assertions.assertFalse(replaceTextInFile.searchAndReplaceStringAndSavingTextToNewFile(oldWord, newWord, "test1.txt",  textToFile));

        Boolean success = file.delete();  //delete file to prepare for another test
    }

    @Test
    void test_searchAndReplaceStringAndSavingTextToNewFile_lineIsChanged() throws FileNotFoundException {
        //create file
        java.io.File file1 = new java.io.File("test1.txt");
        java.io.PrintWriter pw = new java.io.PrintWriter(file1);  //open file for writing
        String textToFile = """
                I hava two dogs \n Two dogs have me""";
        String oldWord = " ";
        String newWord = "x";
        pw.close();
        ReplaceTextInFile replaceTextInFile = new ReplaceTextInFile("test1.txt", textToFile, oldWord, newWord);
        Assertions.assertTrue(replaceTextInFile.searchAndReplaceStringAndSavingTextToNewFile(oldWord, newWord, "test1.txt",  textToFile));
    }
}