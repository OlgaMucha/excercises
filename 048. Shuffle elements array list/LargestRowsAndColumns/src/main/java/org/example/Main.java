package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayNBijN arrayNBijN = new ArrayNBijN();

        int size = userInput();
        arrayNBijN.setSize(size);

        int[][] array = arrayNBijN.fillInArray();
        String output = arrayNBijN.outputLargestColsAndRows(array);
        System.out.println(output);

    }

    /**Method name: userInput
     * User enters size of array
     * @return int size of array
     */
    public static int userInput(){
        System.out.print("Enter the array size n: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}