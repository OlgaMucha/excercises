package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index");
        int userInputIndex = scanner.nextInt();

        ArrayList<Integer> arrayListRandomNumbers = ArrayRandomNumbers.createArrayWithRandomNumbers();

        System.out.println(ArrayRandomNumbers.getNumberOnPosition(userInputIndex, arrayListRandomNumbers));

    }

}