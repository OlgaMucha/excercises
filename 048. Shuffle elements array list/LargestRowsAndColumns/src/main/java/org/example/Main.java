package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayNBijN arrayNBijN = new ArrayNBijN();

        int[][] array = arrayNBijN.fillInArray();
        arrayNBijN.outputLargestColsAndRows(array);
    }

}