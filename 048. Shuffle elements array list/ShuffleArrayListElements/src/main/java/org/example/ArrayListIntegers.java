package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIntegers {

    private ArrayList<Integer> array;

    //region constructors
    public ArrayListIntegers(ArrayList<Integer> array) {
        this.array = array;
    }

    public ArrayListIntegers() {
    }
    //endregion

    //region getters&setters
    public ArrayList<Integer> getArray() {
        return array;
    }

    public void setArray(ArrayList<Integer> array) {
        this.array = array;
    }
    //endregion

    public ArrayList<Integer> shuffle(){
        Collections.shuffle(array);
        return array;
    }
}
