package org.example;

import java.util.ArrayList;

public class ArrayListInt {

    private ArrayList<Integer> arrayList;

    public ArrayListInt(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public ArrayList<Integer> findCommonFieldsTwoArrayLists(ArrayListInt arrayList2){
        ArrayList<Integer> commonElements = new ArrayList<>();

        for(int element1:this.arrayList){
            for(int element2:arrayList2.arrayList){
                if(element1 == element2){
                    commonElements.add(element1);
                }
            }
        }
        return commonElements;
    }
}
