package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayListInt arrayListInt = new ArrayListInt();

        arrayListInt.setArrayList(new ArrayList<>(List.of(10,2,9,7,1)));
        ArrayList<Integer> arrayList = arrayListInt.sortArrayList();
        System.out.println(arrayList.toString());
    }
}