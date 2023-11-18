package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayNBijN arrayNBijN = new ArrayNBijN();

        int[][] array = arrayNBijN.fillInArray();
        System.out.println("The largest row index: " + arrayNBijN.maxInRows(array).toString());
        System.out.println("The largest column index: " + arrayNBijN.maxInCols(array).toString());
    }

}