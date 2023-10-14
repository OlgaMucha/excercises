package org.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FileWithNumbers {

    public static final int NUMBER_OF_NUMBERS_IN_FILE = 100;
    public String fileName;
    public FileWithNumbers(String fileName) {
        this.fileName = fileName;
    }

    public void writeIntoFile() throws FileNotFoundException {
        java.io.File file = new java.io.File(this.fileName);
        if (!file.exists()) {

            //opening file to read/write
            PrintWriter printWriter = new PrintWriter(file);
            try {
                printWriter = new PrintWriter(file);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }

            //creating 100 random numbers

            for (int i = 0; i < NUMBER_OF_NUMBERS_IN_FILE; i++) {
                Random random = new Random();

                //creating random number
                int number = random.nextInt();

                //entering random number to array, separated by space
                printWriter.print(number + " ");
            }
            printWriter.close();
        }
    }


    //Read the data back from the file and display the data in increasing order.
    public void readFromFile() throws FileNotFoundException {

        java.io.File file = new java.io.File(this.fileName);
        Scanner scanner = new Scanner(file);

        //reading the numbers as string from file to array
        String[] numbers = scanner.nextLine().split(" ");

        ArrayList<Integer> arrayListOfNumbers = new ArrayList<>();

        //writing elements of array converted from string to int to array list
        for (int i = 0; i < NUMBER_OF_NUMBERS_IN_FILE; i++) {

            //converting elements of array from string to integer
            int numberAsInteger = Integer.parseInt(numbers[i]);

            //adding
            arrayListOfNumbers.add(numberAsInteger);
        }
        //sorting array list in natural way (ascending)
        arrayListOfNumbers.sort(null);
    }
}


