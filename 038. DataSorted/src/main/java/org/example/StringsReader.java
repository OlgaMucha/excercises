package org.example;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringsReader {
    public String path;

    public StringsReader(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    /**method: readStringsFromFile
     * saves words from the file in array list of words
     * @return ArrayList<String> array list with words in the file
     */
    public ArrayList<String> readStringsFromFile() throws FileNotFoundException {
        java.io.File file = new java.io.File(this.path);
        Scanner scanner = new Scanner(file);
        ArrayList<String> wordsArrayList = new ArrayList<>();

        while (scanner.hasNext()) {
            String[] words = scanner.next().split(" ");
            wordsArrayList.addAll(List.of(words));
        }
        return wordsArrayList;
    }

    /**method: checkIfArrayStringsIsSorted
     * checks if given array list is sorted, if yes returning null, if no returning array with two elements
     * in incorrect order
     * @return incorrectStrings
     */
    public String[] checkIfArrayStringsIsSorted(ArrayList<String> arrayStrings){

        ArrayList<String> wordsArrayListSorted = new ArrayList<>(arrayStrings);

        String[] incorrectStrings = null;

        wordsArrayListSorted.sort(null);

        for (int i = 0; i < arrayStrings.size(); i++) {
            if(!wordsArrayListSorted.get(i).equals(arrayStrings.get(i))){
                incorrectStrings = new String[]{arrayStrings.get(i), arrayStrings.get(i + 1)};
                break;
            }
        }

        return incorrectStrings;
    }

    /**printResults
     * method prints or Array sorted correctly or gives strings in incorrect order
     */
    public void printResults() throws FileNotFoundException {
        ArrayList<String> wordsArrayList = readStringsFromFile();
        String[] array = checkIfArrayStringsIsSorted(wordsArrayList);
        if(array==null){
            System.out.println("Array sorted correctly");
        }else{
            System.out.println("First strings in incorrect order: " + array[0] + ", " + array[1]);
        }

    }

}
