package org.example;

import java.util.ArrayList;

public class Strings {
    private String string;

    public Strings(String string) {
        this.string = string;
    }

    public ArrayList<Character> stringToCharacters(){
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < this.string.length(); i++) {
            arrayList.add(string.charAt(i));
        }
        return arrayList;
    }


}
