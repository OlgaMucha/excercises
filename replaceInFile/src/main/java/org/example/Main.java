package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {

        String textInFile = """

                What is Lorem Ipsum?

                Lorem Ipsum is simply dummy text of the printing and typesetting industry.\s
                Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. \s
                It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, \s
                and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.

                It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. \s
                The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', \s
                making it look like readable English.\s
                Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.\s
                Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).""";


        String wordToReplace = "has";
        String replacingWord = "had";
        String filePathOld = "oldFile.txt";
        String filePathNew = "newFile.txt";

        createFile(textInFile, filePathOld);
        searchAndReplaceStringInFile(wordToReplace, replacingWord, filePathOld, filePathNew);
    }

    private static void createFile(String textInFile, String filePath) throws FileNotFoundException {
        java.io.File file = new java.io.File(filePath);

        java.io.PrintWriter output = new java.io.PrintWriter(file);

        output.println(textInFile);

        output.close();
    }

    private static void searchAndReplaceStringInFile(String wordToSearch, String replacingWord, String filePath, String targetFilePath) throws FileNotFoundException {
        java.io.File fileOld = new java.io.File(filePath);
        java.io.File fileNew = new java.io.File(targetFilePath);
        Scanner scanner = new Scanner(fileOld);
        java.io.PrintWriter printWriter = new java.io.PrintWriter(fileNew);
        while (scanner.hasNext()) {
            String s1 = scanner.nextLine();
            String s2 = s1.replace(wordToSearch, replacingWord);
            printWriter.println(s2);
        }

        printWriter.close();
    }
}

