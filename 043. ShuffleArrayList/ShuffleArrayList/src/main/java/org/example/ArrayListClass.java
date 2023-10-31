package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListClass {
    private ArrayList<Integer> arrayListNumbers;

    public ArrayList<Integer> getArrayListNumbers() {
        return arrayListNumbers;
    }

    public ArrayListClass(ArrayList<Integer> arrayListNumbers) {
        this.arrayListNumbers = arrayListNumbers;
    }

    public void shuffleArrayList(){
        //random order
        Collections.shuffle(this.arrayListNumbers);
    }
}
