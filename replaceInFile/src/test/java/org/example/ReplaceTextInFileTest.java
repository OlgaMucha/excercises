package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReplaceTextInFileTest {


    @Test
    void test_searchAndReplaceStringAndSavingTextToNewFile_ifWordsToReplaceReturnsReplaceTrue() throws FileNotFoundException {
        //create file
        java.io.File file = new java.io.File("test1.txt");
        java.io.PrintWriter pw = new java.io.PrintWriter(file);  //open file for writing
        String textToFile = """
                I hava two dogs \n Two dogs have me""";
        String oldWord = "dogs";
        String newWord = "legs";
        pw.close();
        ReplaceTextInFile replaceTextInFile = new ReplaceTextInFile("test1.txt", "test2.txt", textToFile);
        Assertions.assertTrue(replaceTextInFile.searchAndReplaceStringAndSavingTextToNewFile(oldWord, newWord, "test1.txt", textToFile));

        Boolean success = file.delete();  //delete file to prepare for another test
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
        ReplaceTextInFile replaceTextInFile = new ReplaceTextInFile("test1.txt", "test2.txt", textToFile);
        Assertions.assertFalse(replaceTextInFile.searchAndReplaceStringAndSavingTextToNewFile(oldWord, newWord, "test1.txt",  textToFile));

        Boolean success = file.delete();  //delete file to prepare for another test
    }

    @Test
    void test_searchAndReplaceStringAndSavingTextToNewFile_lineIsChanged() throws FileNotFoundException {
        //create file
        java.io.File file1 = new java.io.File("test1.txt");
        java.io.File file2 = new java.io.File("test2.txt");
        java.io.PrintWriter pw = new java.io.PrintWriter(file1);  //open file for writing
        String textToFile = """
                I hava two dogs \n Two dogs have me""";
        String oldWord = "dogs";
        String newWord = "legs";
        pw.close();
        ReplaceTextInFile replaceTextInFile = new ReplaceTextInFile("test1.txt", "test2.txt", textToFile);

        Scanner scanner1 = new Scanner(file1);
        String line1 = scanner1.nextLine();



        Boolean success = file1.delete();  //delete file to prepare for another test
    }
}