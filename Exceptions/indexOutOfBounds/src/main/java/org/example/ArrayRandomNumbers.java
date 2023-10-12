package org.example;

import java.util.ArrayList;
import java.util.Random;

public class ArrayRandomNumbers {
    public static final int LENGTH_OF_ARRAY = 120;

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
        }
        catch (IndexOutOfBoundsException error){
            System.out.println(error.getMessage());
        }
        return array.get(index);
    }
}
