package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayIntegers {

    private ArrayList<Integer> arrayList;

    public ArrayIntegers(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public ArrayIntegers() {
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaxOfArrayIntegers(){
        int max = Integer.MIN_VALUE;
        if(arrayList.size() == 0){
            return 0;
        }
        for (Integer integer : arrayList) {
            if (integer >= max) {
                max = integer;
            }
        }
        return max;
    }

    public ArrayList<Integer> userInputArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> arrayListString = new ArrayList<>();

        //User input
        System.out.println("Enter elements of array, enter 0 to stop");

        //user input until stop = 0
        Scanner scanner = new Scanner(System.in);
        String element = scanner.nextLine();
        while(!element.equals("0")){
            arrayListString.add(element);
            element = scanner.nextLine();
        }

        //parse user input from string to integer
        for(String string : arrayListString){
            int number = Integer.parseInt(string);
            arrayList.add(number);
        }

        return arrayList;
    }

}
