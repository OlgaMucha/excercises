package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayNBijN arrayNBijN = new ArrayNBijN();

        int[][] array = arrayNBijN.fillInArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}