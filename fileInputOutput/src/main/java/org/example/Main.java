package org.example;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //Write a program to create a file named Exercise.txt if
        //it does not exist.
        String fileName = "Exercise.txt";
        FileWithNumbers fileWithNumbers = new FileWithNumbers(fileName);

        fileWithNumbers.writeIntoFile();
        fileWithNumbers.readFromFile();

        System.out.println();


    }
}
