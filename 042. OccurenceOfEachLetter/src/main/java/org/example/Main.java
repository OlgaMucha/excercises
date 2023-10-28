package org.example;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String path = getFilePathFromUser();

        TextFile textFile = new TextFile(path);

        textFile.getOccurrenceOfCharactersInFile(path);

    }
    private static String getFilePathFromUser() {
        System.out.println("Enter a file path");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();
        return path;
    }


}




