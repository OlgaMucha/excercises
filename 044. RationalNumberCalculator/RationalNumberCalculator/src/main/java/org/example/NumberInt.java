package org.example;

import java.util.ArrayList;

public class NumberInt {

    private int numberValue;

    public NumberInt(int numberValue) {
        this.numberValue = numberValue;
    }

    public ArrayList<Integer> findDivisors() {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= numberValue; i++)
            if (numberValue % i == 0) {
                divisors.add(i);
            }
        return divisors;
    }

    public int greatestCommonDivisor(NumberInt secondNumber){
        int multiplicationResult = 1;
        NumberInt firstNumber = new NumberInt(numberValue);
        ArrayList<Integer> divisorsFirstNumber = firstNumber.findDivisors();
        ArrayList<Integer> divisorsSecondNumber = secondNumber.findDivisors();
        ArrayList<Integer> commonElements = findCommonFieldsTwoArrayLists(divisorsFirstNumber,divisorsSecondNumber);
        for(int i:commonElements){
            multiplicationResult = multiplicationResult*i;
        }
        return multiplicationResult;
    }

    private ArrayList<Integer> findCommonFieldsTwoArrayLists(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2){
        ArrayList<Integer> commonElements = new ArrayList<>();
        for(int i:arrayList1){
            for(int j:arrayList2){
                if(i==j){
                    commonElements.add(i);
                }
            }
        }
        return commonElements;
    }


}
