package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int LENGTH_OF_ARRAY = 120;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index");
        int userInputIndex = scanner.nextInt();

        ArrayList<Integer> arrayListRandomNumbers = createArrayWithRandomNumbers();

        System.out.println(getNumberOnPosition(userInputIndex, arrayListRandomNumbers));

    }

    public static ArrayList<Integer> createArrayWithRandomNumbers(){
        ArrayList<Integer> arrayWithRandomNumbers = new ArrayList<>();
        for (int i = 0; i < LENGTH_OF_ARRAY; i++) {
            arrayWithRandomNumbers.add(randomChooseInteger());
        }
        return arrayWithRandomNumbers;
    }

    public static int randomChooseInteger(){
        Random random = new Random();
        return random.nextInt();
    }

    public static int getNumberOnPosition(int index, ArrayList<Integer> array) throws IndexOutOfBoundsException{
        try {
            int value = array.get(index);
        } catch (IndexOutOfBoundsException ioob){
            System.out.println(ioob.getMessage());
        }
        return array.get(index);
    }
}