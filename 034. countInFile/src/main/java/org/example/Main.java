package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        {
            //user entry
            String fileAsString = input();

            // pass the path to the file as a parameter
            File file = new File(fileAsString);

            FileCount fileCount = new FileCount(file);

            //counting characters in file
            fileCount.output(file);

        }
    }

    public static String input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter file path and name divided with space");
        String[] fileDetails = scanner.nextLine().split(" ");
        String path = fileDetails[0];
        String name = fileDetails[1];
        return path.concat(name);
    }







}

