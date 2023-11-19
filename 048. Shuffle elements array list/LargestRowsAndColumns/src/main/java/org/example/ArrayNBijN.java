package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayNBijN {

    /**Method name: userInput
     * User enters size of array
     * @return int size of array
     */
    public int userInput(){
        System.out.print("Enter the array size n: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**Method fillInArray
     * Array of a given size is filled in randomly with 0's and 1's
     * @return filled in array
     */
    public int[][] fillInArray(int size){
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

    /**Method name: maxElementOfArrayList
     * method returns a max value for a given array list of integers
     * @return int max value
     */
    private int maxElementOfArrayList(ArrayList<Integer> array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) >= max){
                max = array.get(i);
            }
        }
        return max;
    }

    /**Method name: calculateMaxOfLine
     * Method calculates totals per line (row and column) and returns them in array list.
     * first arraylist size/2 elements - sum rows in array list, last arraylist size/2 elements - sum cols
     * @return array list with totals
     */
    public ArrayList<Integer> calculateTotalPerLine(int[][] array ){
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

    /**Method name: maxInLine
     * Method checks in which row/col is total maximal and returns position numbers in array
     * @return positions with max total per row/col in array list
     */

    public ArrayList<Integer> maxInLine(int[][] array, String choice){
        ArrayList<Integer> arrayList = calculateTotalPerLine(array);
        int arraySize = arrayList.size()/2;
        ArrayList<Integer> arrayTotals = new ArrayList<>();
        ArrayList<Integer> arrayMaxPositions = new ArrayList<>();

        if(choice.equals("ROW")){
            for (int i = 0; i < arraySize; i++) {
                arrayTotals.add(arrayList.get(i));
            }
        } else if (choice.equals("COL")){
            for (int i = arraySize; i < arrayList.size(); i++) {
                arrayTotals.add(arrayList.get(i));
            }
        }

        int max = maxElementOfArrayList(arrayTotals);
        for (int i = 0; i < arrayTotals.size(); i++) {
            if(arrayTotals.get(i) == max){
                arrayMaxPositions.add(i);
            }
        }
        return arrayMaxPositions;
    }

    /**Method name: outputArray
     * creates output for array
     */
    public void outputArray(int[][] array){
        System.out.println("The random array is");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**Method name: outputLargestColsAndRows
     * creates final output with the largest index for row and col
     * @param array
     */
    public void outputLargestColsAndRows(int[][] array){
        ArrayList<Integer> maxInRowsArrayList = this.maxInLine(array,"ROW");
        ArrayList<Integer> maxInColsArrayList = this.maxInLine(array,"COL");

        String maxInRowsOutput = createOutputArrayList(maxInRowsArrayList);
        String maxInColsOutput = createOutputArrayList(maxInColsArrayList);

        System.out.println("The largest row index: " + maxInRowsOutput);
        System.out.println("The largest column index: " + maxInColsOutput);
    }

    /**Method name: getFinalOutput
     * Presents output for array list with only integer elements with comma, last one without comma
     * @param maxInLineArrayList
     * @return
     */
    private static String createOutputArrayList(ArrayList<Integer> maxInLineArrayList) {
        String maxInLineOutput = "";
        for (int i = 0; i < maxInLineArrayList.size(); i++) {
            if(i == maxInLineArrayList.size() - 1){
                maxInLineOutput = maxInLineOutput.concat(maxInLineArrayList.get(i) + "");
            }else{
                maxInLineOutput = maxInLineOutput.concat(maxInLineArrayList.get(i) + ", ");
            }
        }
        return maxInLineOutput;
    }
}
