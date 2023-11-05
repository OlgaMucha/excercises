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

    /**
     * Method: findCommonFieldsTwoArrayLists
     * finds common elements of two array lists and returns it in the form of an array list.
     * @return ArrayList<Integer>
     */
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
