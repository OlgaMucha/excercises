package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BinaryToDecimal {

    public String binaryNumberString;

    public BinaryToDecimal(String binaryNumberString) {
        this.binaryNumberString = binaryNumberString;
    }

    public boolean verifyInputIsABinaryNumber(String binaryString) {
        boolean inputIsBinary = false;
        List<Character> list = new ArrayList<>();
        char[] array = {'0', '1'};
        for (int i = 0; i < binaryString.length(); i++) {
            list.add(binaryString.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == '0' || list.get(i) == '1') {
                count = count + 1;
            }
        }
        if (count == list.size()) {
            inputIsBinary = true;
        }
        return inputIsBinary;
    }
}


