package org.example;

import java.util.ArrayList;

public class ArrayIntegers {
    private ArrayList<Integer> arrayList;

    //region constructor getters & setters
    public ArrayIntegers(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayIntegers() {
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }
    //endregion

    public ArrayList<Integer> removeDuplicate(){
        ArrayList<Integer> noDuplicatesArray = new ArrayList<>();
        for (int i = 0; i < this.arrayList.size(); i++) {
            if(!noDuplicatesArray.contains(this.arrayList.get(i))){
                noDuplicatesArray.add(this.arrayList.get(i));
            }
        }
        return noDuplicatesArray;
    }

}
