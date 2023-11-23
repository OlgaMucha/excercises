package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayListInt arrayListInt = new ArrayListInt();

        arrayListInt.setArrayList(new ArrayList<>(List.of(10,2,9,7,1)));
        ArrayList<Integer> arrayList = arrayListInt.sortArrayList();
        System.out.println(arrayList.toString());

        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(array));
        System.out.println(java.util.Collections.max(arrayList1));
    }


}