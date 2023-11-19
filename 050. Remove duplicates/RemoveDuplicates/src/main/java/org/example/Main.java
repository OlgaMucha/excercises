package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final int NUMBER_OF_ELEMENTS = 10;

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = userInput();
        ArrayIntegers arrayIntegers = new ArrayIntegers(arrayList);
        ArrayList<Integer> arrayResults = arrayIntegers.removeDuplicate();
        String result = arrayIntegers.output(arrayResults);
        System.out.println(result);
    }



    private static ArrayList<Integer> userInput() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Enter " + NUMBER_OF_ELEMENTS + " integers: ");
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            int entry = scanner.nextInt();
            arrayList.add(entry);
        }
        return arrayList;
    }
}