package org.example;

import java.util.ArrayList;

public class ArrayNBijN {

    //region getters, setters and constructors
    private int size;

    public int getSize() {
        return size;
    }

    public ArrayNBijN(int size) {
        this.size = size;
    }

    public ArrayNBijN() {
    }

    public void setSize(int size) {
        this.size = size;
    }

    //endregion


    /**Method fillInArray
     * Array of a given size is filled in randomly with 0's and 1's
     * @return filled in array
     */
    public int[][] fillInArray(){
        int[][] array = new int[this.size][this.size];
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                array[i][j] = (int)Math.round(Math.random());
            }
        }
        System.out.println(this.outputArray(array));
        return array;
    }

    /**Method name: maxElementOfArrayList
     * method returns a max value for a given array list of integers
     * @return int max value
     */
    private int maxElementOfArrayList(ArrayList<Integer> array){
        int max = Integer.MIN_VALUE;
        for (Integer integer : array) {
            if (integer >= max) {
                max = integer;
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
        for (int[] ints : array) {
            int sumInRow = 0;
            for (int j = 0; j < array.length; j++) {
                sumInRow = sumInRow + ints[j];
            }
            arrayList.add(sumInRow);
        }

        //last array.length elements - sum cols in array list
        for (int j = 0; j < array.length; j++) {
            int sumInCol = 0;
            for (int[] ints : array) {
                sumInCol = sumInCol + ints[j];
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
    public String outputArray(int[][] array){
        System.out.println("The random array is");
        String output = "";
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                output = output.concat(ints[j] + " ");
            }
            output = output.concat("\n");
        }
        return output;
    }

    /**Method name: outputLargestColsAndRows
     * creates final output with the largest index for row and col
     */
    public String outputLargestColsAndRows(int[][] array){
        ArrayList<Integer> maxInRowsArrayList = this.maxInLine(array,"ROW");
        ArrayList<Integer> maxInColsArrayList = this.maxInLine(array,"COL");

        String maxInRowsOutput = createOutputArrayList(maxInRowsArrayList);
        String maxInColsOutput = createOutputArrayList(maxInColsArrayList);

       return  "The largest row index: " + maxInRowsOutput + "\n" +
               "The largest column index: " + maxInColsOutput;
    }

    /**Method name: getFinalOutput
     * Presents output for array list with only integer elements with comma, last one without comma
     * @return String with positions with comma between but not at the end
     */
    private String createOutputArrayList(ArrayList<Integer> maxInLineArrayList) {
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
