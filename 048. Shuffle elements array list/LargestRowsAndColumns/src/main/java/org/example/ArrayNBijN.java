package org.example;

import java.util.ArrayList;
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
        this.outputArray(array);
        return array;
    }
    private int maxElementOfArrayList(ArrayList<Integer> array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) >= max){
                max = array.get(i);
            }
        }
        return max;
    }

    public ArrayList<Integer> calculateMaxOfLine(int[][] array ){
        ArrayList<Integer> arrayList = new ArrayList<>();

        //first array.length elements - sum rows in array list
        for (int i = 0; i < array.length; i++) {
            int sumInRow = 0;
            for (int j = 0; j < array.length; j++) {
                sumInRow = sumInRow + array[i][j];
            }
            arrayList.add(sumInRow);
        }

        //last array.length elements - sum cols in array list
        for (int j = 0; j < array.length; j++) {
            int sumInCol = 0;
            for (int i = 0; i < array.length; i++) {
                sumInCol = sumInCol + array[i][j];
            }
            arrayList.add(sumInCol);
        }
        return arrayList;
    }

    public ArrayList<Integer> maxInRows(int[][] array){
        ArrayList<Integer> arrayList = calculateMaxOfLine(array);
        int arraySize = arrayList.size()/2;
        ArrayList<Integer> arrayTotalsPerRow = new ArrayList<>();
        ArrayList<Integer> arrayMaxPositionsInRow = new ArrayList<>();

        for (int i = 0; i < arraySize; i++) {
            arrayTotalsPerRow.add(arrayList.get(i));
        }
        int max = maxElementOfArrayList(arrayTotalsPerRow);
        for (int i = 0; i < arrayTotalsPerRow.size(); i++) {
            if(arrayTotalsPerRow.get(i) == max){
                arrayMaxPositionsInRow.add(i);
            }
        }
        return arrayMaxPositionsInRow;
    }

    public ArrayList<Integer> maxInCols(int[][] array){
        ArrayList<Integer> arrayList = calculateMaxOfLine(array);
        int arraySize = arrayList.size()/2;
        ArrayList<Integer> arrayTotalsPerCol = new ArrayList<>();
        ArrayList<Integer> arrayMaxPositionsInCol = new ArrayList<>();

        for (int i = arraySize; i < arrayList.size(); i++) {
            arrayTotalsPerCol.add(arrayList.get(i));
        }
        int max = maxElementOfArrayList(arrayTotalsPerCol);
        for (int i = 0; i < arrayTotalsPerCol.size(); i++) {
            if(arrayTotalsPerCol.get(i) == max){
                arrayMaxPositionsInCol.add(i);
            }
        }
        return arrayMaxPositionsInCol;
    }

    public void outputArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
