package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // user input
        System.out.println("Give directory name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String path = "D:\\" + name;

        Directory directory = new Directory(path);
        System.out.println(directory.createDirectory());
    }
}