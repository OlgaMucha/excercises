package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        {
            // pass the path to the file as a parameter
            File file = new File("D://SprintApplicationFile.txt");

            //counting lines in file
            getCountLines(file);

            //counting words in file
            getCountWords(file);

            //counting characters in file
            getCountCharacters(file);
        }
    }

    private static void getCountCharacters(File file) throws FileNotFoundException {
        Scanner scannerToCountCharacters = new Scanner(file);
        int countLines = getCountLines(file);
        int countCharacters = 0;
        for (int i = 0; i < countLines; i++) {
            while (scannerToCountCharacters.hasNextLine()) {
                String characters = scannerToCountCharacters.nextLine();
                countCharacters = characters.length() + countCharacters;
            }
        }
        System.out.println(countCharacters + " characters");
    }

    private static void getCountWords(File file) throws FileNotFoundException {
        Scanner scannerToCountWords = new Scanner(file);
        int countLines = getCountLines(file);
        int countWords = 0;

        for (int i = 0; i < countLines; i++) {
            while (scannerToCountWords.hasNextLine()) {
                String[] words = scannerToCountWords.nextLine().split(" ");
                countWords = words.length + countWords;
            }
        }
        System.out.println(countWords + " words");
    }

    private static int getCountLines(File file) throws FileNotFoundException {
        Scanner scannerToCountLines = new Scanner(file);
        int countLines = 0;
        while (scannerToCountLines.hasNextLine()) {
            countLines = countLines + 1;
        }

        System.out.println(countLines + " lines");
        return countLines;
    }
}

