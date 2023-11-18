package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = userInputArrayList();
        ArrayIntegers arrayIntegers = new ArrayIntegers(array);

        int max = arrayIntegers.getMaxOfArrayIntegers();
        System.out.println("Your input: " + array.toString());
        System.out.println("Max of your input is " + max);
    }

    private static ArrayList<Integer> userInputArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> arrayListString = new ArrayList<>();

        //User input
        System.out.println("Enter elements of array, enter 0 to stop");

        //user input until stop = 0
        Scanner scanner = new Scanner(System.in);
        String element = scanner.nextLine();
        while(!element.equals("0")){
            arrayListString.add(element);
            element = scanner.nextLine();
        }

        //parse unser input from string to integer
        for(String string : arrayListString){
            int number = Integer.parseInt(string);
            arrayList.add(number);
        }

        return arrayList;

    }
}