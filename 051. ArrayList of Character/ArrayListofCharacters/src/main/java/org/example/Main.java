package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Strings strings = new Strings("Stol z powylamywanymi nogami");
        ArrayList<Character> array = strings.stringToCharacters();
        System.out.println(array.toString());
    }
}