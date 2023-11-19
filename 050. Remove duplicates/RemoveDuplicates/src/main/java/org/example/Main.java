package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(List.of(10,2,10,33,5,10,2));
        ArrayIntegers arrayIntegers = new ArrayIntegers(arrayList);
        ArrayList<Integer> arrayResults = arrayIntegers.removeDuplicate();
        System.out.println(arrayResults.toString());
    }
}