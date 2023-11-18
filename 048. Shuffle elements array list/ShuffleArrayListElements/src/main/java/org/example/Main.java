package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayListIntegers arrayListIntegers = new ArrayListIntegers(new ArrayList<>(List.of(1,2,3,4,5)));
        ArrayList<Integer> arrayListAfterShuffle = arrayListIntegers.shuffle();
        System.out.println(arrayListIntegers.getArray().toString());
    }
}