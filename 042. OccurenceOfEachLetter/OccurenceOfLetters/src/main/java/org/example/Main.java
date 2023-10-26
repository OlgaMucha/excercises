package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //(Occurrences of each letter) Write a program that prompts the user to enter a
        //	file name and displays the occurrences of each letter in the file. Letters are case
        //	insensitive. Here is a sample run:
        System.out.println("Enter a file path");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();

        java.io.File file = new File(path);
        Scanner fileReader = new Scanner(file);
        ArrayList<String> arrayList = new ArrayList<>();

        while (fileReader.hasNext()) {
            String[] arrayLetters = fileReader.nextLine().split("");
            List<String> listLetters = Arrays.asList(arrayLetters);
            arrayList.addAll(listLetters);
            fileReader.nextLine();
        }
        System.out.println(arrayList.toString());

        //all letters to lower case
        arrayList.replaceAll(String::toLowerCase);
        System.out.println(arrayList.toString());

        //sort array list ascending
        arrayList.sort(null);
        System.out.println(arrayList.toString());

    }
}

