package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static final String TEXT_IN_FILE = """

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

    public static void main(String[] args) throws java.io.IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Give word you want to replace: ");
        String wordToReplace = scanner.nextLine();
        System.out.print("Give word you want the word to be replaced with: ");
        String replacingWord = scanner.nextLine();

        String filePathOld = "oldFile.txt";

        ReplaceTextInFile replaceTextInFile = new ReplaceTextInFile(filePathOld, TEXT_IN_FILE, wordToReplace, replacingWord);

        //creating new file as copy of the old one but with replaced given word with  new one
        replaceTextInFile.searchAndReplaceStringAndSavingTextToNewFile(wordToReplace, replacingWord, filePathOld, TEXT_IN_FILE);
    }
}

