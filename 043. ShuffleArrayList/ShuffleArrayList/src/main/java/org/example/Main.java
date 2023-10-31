package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter numbers after space");
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayListNumbers = new ArrayList<>();
        String[] numbersAsString = scanner.nextLine().split(" ");

        //parsing integer from string for all elements entered by user
        // and entering them into arrayList
        for (String s : numbersAsString) {
            int number = Integer.parseInt(s);
            arrayListNumbers.add(number);
        }

        //
        ArrayListClass arrayListClass = new ArrayListClass(arrayListNumbers);
        System.out.println("Old list: " + arrayListNumbers.toString());
        //shuffling the list
        arrayListClass.shuffleArrayList();
        System.out.println("New list: " + arrayListNumbers.toString());

    }
}