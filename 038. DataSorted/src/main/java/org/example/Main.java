package org.example;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        StringsReader sr = new StringsReader();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList = sr.readStringsFromFile();

        System.out.println("Incorrect order: " + Arrays.toString(sr.checkIfArrayStringsIsSorted(arrayList)));

    }
}