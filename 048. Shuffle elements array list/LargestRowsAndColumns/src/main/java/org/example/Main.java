package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayNBijN arrayNBijN = new ArrayNBijN();

        int size = arrayNBijN.userInput();
        int[][] array = arrayNBijN.fillInArray(size);
        arrayNBijN.outputLargestColsAndRows(array);
    }

}