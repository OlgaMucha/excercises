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
        ArrayList<Integer> arrayDivisorsFirstNumber = firstNumber.findDivisors();
        ArrayListInt divisorsFirstNumber = new ArrayListInt(arrayDivisorsFirstNumber);

        ArrayList<Integer> arrayDivisorsSecondNumber = secondNumber.findDivisors();
        ArrayListInt divisorsSecondNumber = new ArrayListInt(arrayDivisorsSecondNumber);


        ArrayList<Integer> commonElements = divisorsFirstNumber.findCommonFieldsTwoArrayLists(divisorsSecondNumber);
        for(int i:commonElements){
            if(i <= Math.min(firstNumber.numberValue, secondNumber.numberValue)) {
                commonDivisor = i;
            }
        }

        return commonDivisor;
    }

}
