package org.example;

import java.util.ArrayList;

public class NumberInt {

    private int numberValue;

    public NumberInt(int numberValue) {
        this.numberValue = numberValue;
    }

    public int getNumberValue() {
        return numberValue;
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
        int commonDivisor = 0;
        NumberInt firstNumber = new NumberInt(numberValue);
        ArrayList<Integer> divisorsFirstNumber = firstNumber.findDivisors();
        ArrayList<Integer> divisorsSecondNumber = secondNumber.findDivisors();
        ArrayList<Integer> commonElements = findCommonFieldsTwoArrayLists(divisorsFirstNumber,divisorsSecondNumber);
        for(int i:commonElements){
            if(i <= Math.min(firstNumber.numberValue, secondNumber.numberValue)) {
                commonDivisor = i;
            }
        }


//        for(i = 1; i <= a || i <= b; i++) {
//            if( a%i == 0 && b%i == 0 )
//                hcf = i;
//        }
//        System.out.println("HCF of given two numbers is ::"+hcf);
    //}
        return commonDivisor;
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

    private boolean isPrimeNumber(int nr){
        NumberInt numberInt = new NumberInt(nr);
        ArrayList<Integer> divisors = numberInt.findDivisors();
        return divisors.size() <= 2;
    }


}
