package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayIntegers {

    private ArrayList<Integer> arrayList;

    public ArrayIntegers(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayIntegers() {
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public int getMaxOfArrayIntegers(){
        int max = Integer.MIN_VALUE;
        if(arrayList.size() == 0){
            return max;
        }
        for (Integer integer : arrayList) {
            if (integer >= max) {
                max = integer;
            }
        }
        return max;
    }

}
