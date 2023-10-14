package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileCount {
    public File file;

    public FileCount(File file) throws FileNotFoundException {
        if(!file.exists()) {
            throw new FileNotFoundException();
        }
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    private int getCountLines() throws FileNotFoundException {
        Scanner scannerToCountLines = new Scanner(this.file);
        int countLines = 0;
        while (scannerToCountLines.hasNextLine()) {
            countLines = countLines + 1;
            scannerToCountLines.nextLine();
        }
        scannerToCountLines.close();
        return countLines;

    }

    private int getCountCharacters() throws FileNotFoundException {
        Scanner scannerToCountCharacters = new Scanner(this.file);
        int countLines = getCountLines();
        int countCharacters = 0;
        for (int i = 0; i < countLines; i++) {
            while (scannerToCountCharacters.hasNextLine()) {
                String characters = scannerToCountCharacters.nextLine();
                countCharacters = characters.length() + countCharacters;
            }
        }
        scannerToCountCharacters.close();
        return countCharacters;
    }

    private int getCountWords() throws FileNotFoundException {
        Scanner scannerToCountWords = new Scanner(this.file);
        int countLines = getCountLines();
        int countWords = 0;

        for (int i = 0; i < countLines; i++) {
            while (scannerToCountWords.hasNextLine()) {
                String[] words = scannerToCountWords.nextLine().split(" ");
                countWords = words.length + countWords;
            }
        }
        scannerToCountWords.close();
        return countWords;
    }

    public void output(File file) throws FileNotFoundException {
        //get name of file without extension from the name of the file

        String[] fileSplit = file.getName().split("\\.");
        System.out.println("File " + fileSplit[0] + " has: \n");
        //print output characters in file
        System.out.println(getCountCharacters() + " characters");

        //print output words in file
        System.out.println(getCountWords() + " words");

        //print output lines in file
        System.out.println(getCountLines() + " lines");
    }
}
