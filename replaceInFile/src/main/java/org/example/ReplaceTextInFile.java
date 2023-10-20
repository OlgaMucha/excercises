package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReplaceTextInFile {
    public String oldFilePath;
    public String newFilePath;
    public String fileText;
    public String oldWord;
    public String newWord;

    public ReplaceTextInFile(String oldFilePath, String newFilePath, String fileText, String oldWord, String newWord) {
        this.oldFilePath = oldFilePath;
        this.newFilePath = newFilePath;
        this.fileText = fileText;
        this.oldWord = oldWord;
        this.newWord = newWord;
    }

    //create file if it doesn't exist
    public void createFile(String filePath, String fileText) throws FileNotFoundException {
        java.io.File file = new java.io.File(filePath);

        java.io.PrintWriter output = new java.io.PrintWriter(file);

        output.println(fileText);

        output.close();
    }

    public void searchAndReplaceStringAndSavingTextToNewFile(String oldWord, String newWord, String filePath, String targetFilePath) throws FileNotFoundException {
        java.io.File fileOld = new java.io.File(filePath);
        java.io.File fileNew = new java.io.File(targetFilePath);
        Scanner scanner = new Scanner(fileOld);
        java.io.PrintWriter printWriter = new java.io.PrintWriter(fileNew);
        while (scanner.hasNext()) {
            String s1 = scanner.nextLine();                         //old file as String
            String s2 = s1.replace(oldWord, newWord);    //replacing strings
            printWriter.println(s2);                                //new file as String
        }

        printWriter.close();
    }



    //searched word
    //read file - find all occurrences of the word
    //write file - replace all occurrences with new word



}
