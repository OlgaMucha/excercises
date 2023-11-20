package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListInt {
    public ArrayList<Integer> arrayList;

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<Integer> sortArrayList(){
        this.arrayList.sort(Comparator.comparingInt(Integer::intValue));
        return arrayList;
    }
}
