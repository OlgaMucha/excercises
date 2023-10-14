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

    public void writeIntoFile() {
        java.io.File file = new java.io.File(this.fileName);
        if (!file.exists()) {

            //Write 100 integers created randomly into the file using text
            //I/O. Integers are separated by spaces in the file.
            PrintWriter printWriter = null;
            try {
                printWriter = new PrintWriter(file);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
            if (printWriter != null) {
                for (int i = 0; i < NUMBER_OF_NUMBERS_IN_FILE; i++) {
                    Random random = new Random();
                    int number = random.nextInt();

                    printWriter.print(number + " ");
                }
                printWriter.close();
            }
        }
    }

    //Read the data back from the file and display the data in increasing order.
    public void readFromFile() throws FileNotFoundException {
        java.io.File file = new java.io.File(this.fileName);
        Scanner scanner = new Scanner(file);
        String[] numbers = scanner.nextLine().split(" ");
        ArrayList<Integer> arrayListOfNumbers = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_NUMBERS_IN_FILE; i++) {
            int numberAsInteger = Integer.parseInt(numbers[i]);
            arrayListOfNumbers.add(numberAsInteger);
        }
        arrayListOfNumbers.sort(null);
    }
}


