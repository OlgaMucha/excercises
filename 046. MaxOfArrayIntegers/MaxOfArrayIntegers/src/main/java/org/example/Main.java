package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayIntegers arrayIntegers = new ArrayIntegers();
        ArrayList<Integer> array = arrayIntegers.userInputArrayList();
        arrayIntegers.setArrayList(array);

        int max = arrayIntegers.getMaxOfArrayIntegers();
        System.out.println("Your input: " + array.toString());
        System.out.println("Max of your input is " + max);
    }
}