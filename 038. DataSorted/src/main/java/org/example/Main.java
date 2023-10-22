package org.example;

//(Data sorted?) Write a program that reads the strings from file SortedStrings.txt
//and reports whether the strings in the files are stored in increasing order. If the
//strings are not sorted in the file, it displays the first two strings that are out of
//the order.


import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "src/main/resources/SortedStrings.txt";

        StringsReader stringsReader = new StringsReader(path);

        stringsReader.printResults();
    }
}