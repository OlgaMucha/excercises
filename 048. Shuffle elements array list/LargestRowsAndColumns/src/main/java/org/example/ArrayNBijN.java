package org.example;

import java.util.Random;
import java.util.Scanner;

public class ArrayNBijN {
    //how many elements?
    private int userInput(){
        System.out.println("What is the size of array?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    //fill in array
    public int[][] fillInArray(){
        int size = this.userInput();
        int[][] array = new int[size][size];
        Random random = new Random(1);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (int)Math.round(Math.random());
            }
        }
        return array;
    }
}
