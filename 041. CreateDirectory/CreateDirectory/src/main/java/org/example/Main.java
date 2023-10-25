package org.example;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // user input
        System.out.println("Give directory name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String path = "D:\\" + name;

        // create an abstract pathname (File object)
        File f = new File(path);



        // check if the directory can be created
        if (f.mkdirs()) {
            // display that the directory is created
            // as the function returned true
            System.out.println("Directory is created");}

        //check if directory exists
        else if (f.isDirectory()) {
            // display that the directory already created
            System.out.println("Directory already exists.");

        } else {
            // display that the directory cannot be created
            // as the function returned false
            System.out.println("Directory not created");
        }
    }
}