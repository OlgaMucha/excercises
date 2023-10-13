package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path and file");

        String[] pathAndFile = scanner.nextLine().split(" ");

        String path = pathAndFile[0];
        String fileName = pathAndFile[1];

        java.io.File file = new File(path+fileName);
        System.out.println(file.exists());




    }
}