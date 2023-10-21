package org.example;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringsReader {
    String path = "src/main/resources/SortedStrings.txt";

    //(Data sorted?) Write a program that reads the strings from file SortedStrings.txt
    //and reports whether the strings in the files are stored in increasing order. If the
    //strings are not sorted in the file, it displays the first two strings that are out of
    //the order.

    public ArrayList<String> readStringsFromFile() throws FileNotFoundException {
        java.io.File file = new java.io.File(path);
        Scanner scanner = new Scanner(file);
        ArrayList<String> wordsArrayList = new ArrayList<>();
        while (scanner.hasNext()) {
            String[] words = scanner.next().split(" ");
            wordsArrayList.addAll(List.of(words));
        }

        return wordsArrayList;

    }

    public String[] checkIfArrayStringsIsSorted(ArrayList<String> arrayStrings){

        ArrayList<String> wordsArrayListSorted = new ArrayList<>(arrayStrings);

        String[] incorrectStrings = null;

        wordsArrayListSorted.sort(null);

        for (int i = 0; i < arrayStrings.size(); i++) {
            if(!wordsArrayListSorted.get(i).equals(arrayStrings.get(i))){
                incorrectStrings = new String[]{arrayStrings.get(i), arrayStrings.get(i + 1)};
                break;
            }
        }

        return incorrectStrings;
    }

}
